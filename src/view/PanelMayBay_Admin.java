package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.HangHangKhong;
import model.MayBay;
import model.QuanLyChung;

public class PanelMayBay_Admin extends BaseAdminPanel<MayBay> {

    private DefaultTableModel tableModel;
    private QuanLyChung quanLy;

    // Biến cho phân trang và tìm kiếm
    private int currentPage = 1;
    private final int ITEMS_PER_PAGE = 20;
    private List<MayBay> filteredList;

    public PanelMayBay_Admin() {
        initComponents();

        this.tableModel = (DefaultTableModel) jTable_dsMayBay.getModel();
        this.filteredList = new ArrayList<>();

        //Gắn sự kiện lắng nghe cho ô tìm kiếm (giả sử tên là jT_timKiem)
        jT_timKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                currentPage = 1;
                updateTableAndPagination();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                currentPage = 1;
                updateTableAndPagination();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                currentPage = 1;
                updateTableAndPagination();
            }
        });

        // Gắn sự kiện cho các nút phân trang
        jB_dau.addActionListener(e -> {
            currentPage = 1;
            updateTableAndPagination();
        });
        jB_truoc.addActionListener(e -> {
            if (currentPage > 1) {
                currentPage--;
                updateTableAndPagination();
            }
        });
        jB_sau.addActionListener(e -> {
            int totalPages = (int) Math.ceil((double) filteredList.size() / ITEMS_PER_PAGE);
            if (currentPage < totalPages) {
                currentPage++;
                updateTableAndPagination();
            }
        });
        jB_cuoi.addActionListener(e -> {
            int totalPages = (int) Math.ceil((double) filteredList.size() / ITEMS_PER_PAGE);
            currentPage = totalPages > 0 ? totalPages : 1;
            updateTableAndPagination();
        });

        jTable_dsMayBay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRowOnView = jTable_dsMayBay.getSelectedRow();
                if (selectedRowOnView != -1) {
                    fillFieldsFromTable(selectedRowOnView);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dsMayBay = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jL_soHieuMB = new javax.swing.JLabel();
        jT_soHieuMB = new javax.swing.JTextField();
        jL_maHang = new javax.swing.JLabel();
        jComboBox_maHang = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jB_them = new javax.swing.JButton();
        jB_sua = new javax.swing.JButton();
        jB_xoa = new javax.swing.JButton();
        jB_lamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jL_timKiem = new javax.swing.JLabel();
        jComboBox_tieuChi = new javax.swing.JComboBox<>();
        jT_timKiem = new javax.swing.JTextField();
        jPanel_South = new javax.swing.JPanel();
        jB_dau = new javax.swing.JButton();
        jB_truoc = new javax.swing.JButton();
        jL_trang = new javax.swing.JLabel();
        jB_sau = new javax.swing.JButton();
        jB_cuoi = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTable_dsMayBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Số hiệu máy bay", "Hãng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_dsMayBay);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jL_soHieuMB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_soHieuMB.setText("Số hiệu máy bay : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 100, 0, 0);
        jPanel2.add(jL_soHieuMB, gridBagConstraints);

        jT_soHieuMB.setPreferredSize(new java.awt.Dimension(70, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 101;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jT_soHieuMB, gridBagConstraints);

        jL_maHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maHang.setText("Mã hãng : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 119, 0, 0);
        jPanel2.add(jL_maHang, gridBagConstraints);

        jComboBox_maHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_maHang.setPreferredSize(new java.awt.Dimension(70, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jComboBox_maHang, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jB_them.setText("Thêm");
        jPanel3.add(jB_them);

        jB_sua.setText("Sửa");
        jPanel3.add(jB_sua);

        jB_xoa.setText("Xoá");
        jPanel3.add(jB_xoa);

        jB_lamMoi.setText("Làm mới");
        jPanel3.add(jB_lamMoi);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.ipadx = 258;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách máy bay");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 43, 10, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jL_timKiem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_timKiem.setText("Tìm kiếm theo : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 112, 0, 0);
        jPanel2.add(jL_timKiem, gridBagConstraints);

        jComboBox_tieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Số hiệu máy bay", "Mã hãng" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -21;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_tieuChi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jT_timKiem, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel_South.setLayout(new java.awt.GridBagLayout());

        jB_dau.setText("|<");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 150, 5, 0);
        jPanel_South.add(jB_dau, gridBagConstraints);

        jB_truoc.setText("<");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 5, 0);
        jPanel_South.add(jB_truoc, gridBagConstraints);

        jL_trang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_trang.setText("Trang 1 / X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel_South.add(jL_trang, gridBagConstraints);

        jB_sau.setText(">");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 5, 0);
        jPanel_South.add(jB_sau, gridBagConstraints);

        jB_cuoi.setText(">|");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 5, 141);
        jPanel_South.add(jB_cuoi, gridBagConstraints);

        add(jPanel_South, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void updateTableAndPagination() {
        if (this.quanLy == null) {
            return;
        }
        // Lọc dữ liệu
        String tuKhoa = jT_timKiem.getText().toLowerCase().trim();
        String tieuChi = (String) jComboBox_tieuChi.getSelectedItem();
        List<MayBay> danhSachGoc = this.quanLy.getDanhSachMayBay();

        if (tuKhoa.isEmpty()) {
            filteredList = new ArrayList<>(danhSachGoc);
        } else {
            filteredList = danhSachGoc.stream().filter(mb -> {
                if (mb == null) {
                    return false;
                }
                switch (tieuChi) {
                    case "Số hiệu máy bay":
                        return mb.getSoHieuMayBay() != null && mb.getSoHieuMayBay().toLowerCase().contains(tuKhoa);
                    case "Mã hãng":
                        return mb.getMaHang() != null && mb.getMaHang().toLowerCase().contains(tuKhoa);
                    default: // "Tất cả"
                        boolean soHieuMatch = mb.getSoHieuMayBay() != null && mb.getSoHieuMayBay().toLowerCase().contains(tuKhoa);
                        boolean maHangMatch = mb.getMaHang() != null && mb.getMaHang().toLowerCase().contains(tuKhoa);
                        return soHieuMatch || maHangMatch;
                }
            }).collect(Collectors.toList());
        }

        // Tính toán phân trang
        int totalItems = filteredList.size();
        int totalPages = (int) Math.ceil((double) totalItems / ITEMS_PER_PAGE);
        totalPages = totalPages > 0 ? totalPages : 1;
        if (currentPage > totalPages) {
            currentPage = totalPages;
        }

        int startIndex = (currentPage - 1) * ITEMS_PER_PAGE;
        int endIndex = Math.min(startIndex + ITEMS_PER_PAGE, totalItems);
        List<MayBay> pagedList = filteredList.subList(startIndex, endIndex);

        // Hiển thị
        tableModel.setRowCount(0);
        for (MayBay mb : pagedList) {
            tableModel.addRow(new Object[]{mb.getSoHieuMayBay(), mb.getMaHang()});
        }

        jL_trang.setText("Trang " + currentPage + " / " + totalPages);
        jB_dau.setEnabled(currentPage > 1);
        jB_truoc.setEnabled(currentPage > 1);
        jB_sau.setEnabled(currentPage < totalPages);
        jB_cuoi.setEnabled(currentPage < totalPages);
    }

    @Override
    public void loadDataToTable(QuanLyChung quanLy) {
        this.quanLy = quanLy;
        this.currentPage = 1;
        loadMaHang(quanLy); // Cập nhật danh sách hãng
        if (jT_timKiem != null) {
            jT_timKiem.setText("");
        }
        updateTableAndPagination();
    }

    @Override
    public void fillFieldsFromTable(int viewIndex) {
        int actualIndex = (currentPage - 1) * ITEMS_PER_PAGE + viewIndex;
        if (actualIndex < filteredList.size()) {
            MayBay mb = filteredList.get(actualIndex);
            jT_soHieuMB.setText(mb.getSoHieuMayBay());
            jComboBox_maHang.setSelectedItem(mb.getMaHang());
            jT_soHieuMB.setEnabled(false);
            jB_them.setEnabled(false);
            jB_sua.setEnabled(true);
            jB_xoa.setEnabled(true);
        }
    }

    // Các phương thức khác giữ nguyên
    public void loadMaHang(QuanLyChung quanLy) {
        List<String> maHangList = quanLy.getDanhSachHang().stream()
                .map(HangHangKhong::getMaHang).collect(Collectors.toList());
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(maHangList.toArray(new String[0]));
        jComboBox_maHang.setModel(model);
    }

    @Override
    public MayBay getDataFromFields() {
        String soHieu = jT_soHieuMB.getText();
        String maHang = (String) jComboBox_maHang.getSelectedItem();
        if (soHieu.isEmpty() || maHang == null || maHang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return new MayBay(soHieu, maHang);
    }

    @Override
    public void clearFields() {
        jT_soHieuMB.setText("");
        jComboBox_maHang.setSelectedIndex(-1);
        jT_soHieuMB.setEnabled(true);
        jB_them.setEnabled(true);
        jB_sua.setEnabled(false);
        jB_xoa.setEnabled(false);
    }

    public JButton getjB_lamMoi() {
        return jB_lamMoi;
    }

    public JButton getjB_sua() {
        return jB_sua;
    }

    public JButton getjB_them() {
        return jB_them;
    }

    public JButton getjB_xoa() {
        return jB_xoa;
    }

    public JComboBox<String> getjComboBox_maHang() {
        return jComboBox_maHang;
    }

    public JTextField getjT_soHieuMB() {
        return jT_soHieuMB;
    }

    public JTable getjTable() {
        return jTable_dsMayBay;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_cuoi;
    private javax.swing.JButton jB_dau;
    private javax.swing.JButton jB_lamMoi;
    private javax.swing.JButton jB_sau;
    private javax.swing.JButton jB_sua;
    private javax.swing.JButton jB_them;
    private javax.swing.JButton jB_truoc;
    private javax.swing.JButton jB_xoa;
    private javax.swing.JComboBox<String> jComboBox_maHang;
    private javax.swing.JComboBox<String> jComboBox_tieuChi;
    private javax.swing.JLabel jL_maHang;
    private javax.swing.JLabel jL_soHieuMB;
    private javax.swing.JLabel jL_timKiem;
    private javax.swing.JLabel jL_trang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_South;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_soHieuMB;
    private javax.swing.JTextField jT_timKiem;
    private javax.swing.JTable jTable_dsMayBay;
    // End of variables declaration//GEN-END:variables
}
