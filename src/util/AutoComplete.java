package util;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class AutoComplete {

    private final JTextField textField;
    private final List<String> allSuggestions;
    private final JPopupMenu popupMenu;
    private final JList<String> list;
    private final DefaultListModel<String> listModel;
    private boolean isUpdating = false; // Thêm cờ để tránh vòng lặp vô hạn

    public AutoComplete(JTextField textField, List<String> allSuggestions) {
        this.textField = textField;
        this.allSuggestions = allSuggestions;
        this.popupMenu = new JPopupMenu();
        this.listModel = new DefaultListModel<>();
        this.list = new JList<>(listModel);

        // Giúp popup có cùng chiều rộng với text field
        popupMenu.setFocusable(false);

        setupListeners();
    }

    private void setupListeners() {
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateSuggestions();
            }
        };

        // 1. Lắng nghe sự kiện thay đổi văn bản
        textField.getDocument().addDocumentListener(documentListener);

        // 2. Lắng nghe sự kiện nhấn phím (lên, xuống, enter)
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (!popupMenu.isVisible()) {
                    return;
                }

                int selectedIndex = list.getSelectedIndex();
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_DOWN:
                        // Di chuyển lựa chọn xuống
                        list.setSelectedIndex(Math.min(selectedIndex + 1, listModel.getSize() - 1));
                        list.ensureIndexIsVisible(list.getSelectedIndex());
                        e.consume(); // Ngăn text field xử lý phím này
                        break;
                    case KeyEvent.VK_UP:
                        // Di chuyển lựa chọn lên
                        list.setSelectedIndex(Math.max(selectedIndex - 1, 0));
                        list.ensureIndexIsVisible(list.getSelectedIndex());
                        e.consume(); // Ngăn text field xử lý phím này
                        break;
                    case KeyEvent.VK_ENTER:
                        // Chọn mục và ẩn popup
                        selectSuggestion();
                        e.consume();
                        break;
                    case KeyEvent.VK_ESCAPE:
                        // Ẩn popup khi nhấn Escape
                        popupMenu.setVisible(false);
                        break;
                }
            }
        });

        // 3. Lắng nghe sự kiện click chuột
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectSuggestion();
            }
        });

        // 4. Ẩn popup khi text field mất focus
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                // Thêm một độ trễ nhỏ để sự kiện click chuột trên JList vẫn hoạt động
                setTimeout(() -> popupMenu.setVisible(false), 200);
            }
        });

        popupMenu.add(new javax.swing.JScrollPane(list));
    }

    private void updateSuggestions() {
        if (isUpdating) {
            return; // Nếu đang trong quá trình cập nhật thì bỏ qua
        }
        String typedText = textField.getText().toLowerCase();

        SwingUtilities.invokeLater(() -> {
            listModel.clear();
            if (typedText.isEmpty()) {
                popupMenu.setVisible(false);
                return;
            }

            allSuggestions.stream()
                    .filter(suggestion -> suggestion.toLowerCase().contains(typedText))
                    .forEach(listModel::addElement);

            if (!listModel.isEmpty()) {
                // Cài đặt chiều rộng của popup cho khớp với text field
                popupMenu.setPopupSize(textField.getWidth(), popupMenu.getPreferredSize().height);
                popupMenu.show(textField, 0, textField.getHeight());
                list.setSelectedIndex(0);
            } else {
                popupMenu.setVisible(false);
            }
        });
    }

    private void selectSuggestion() {
        if (list.getSelectedIndex() == -1) {
            return;
        }

        isUpdating = true;
        textField.setText(list.getSelectedValue());
        isUpdating = false; // Tắt cờ

        popupMenu.setVisible(false);
    }

    // Hàm tiện ích để tạo độ trễ
    private void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    }
}
