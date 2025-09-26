package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.QuanLyChung;
import model.TaiKhoan;

public class PanelTaiKhoan_Admin extends BaseAdminPanel<TaiKhoan> {

    private DefaultTableModel tableModel;
    private QuanLyChung quanLy;

    // Biến cho phân trang và tìm kiếm
    private int currentPage = 1;
    private final int ITEMS_PER_PAGE = 20;
    private List<TaiKhoan> filteredList;

    public PanelTaiKhoan_Admin() {
        initComponents();
        this.tableModel = (DefaultTableModel) jTable_dsTaiKhoan.getModel();
        this.filteredList = new ArrayList<>();

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

        jTable_dsTaiKhoan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRowOnView = jTable_dsTaiKhoan.getSelectedRow();
                if (selectedRowOnView != -1) {
                    // Tính toán chỉ số thực tế trong danh sách đã lọc
                    int actualIndex = (currentPage - 1) * ITEMS_PER_PAGE + selectedRowOnView;

                    // Lấy đúng đối tượng tài khoản
                    if (actualIndex < filteredList.size()) {
                        TaiKhoan selectedAccount = filteredList.get(actualIndex);
                        fillFieldsFromTable(selectedRowOnView); // Gọi phương thức mới
                    }
                }
            }
        });
        jRadioButton_matKhau.addActionListener(evt -> {
            if (jRadioButton_matKhau.isSelected()) {
                jPasswordField_matKhau.setEchoChar((char) 0);
            } else {
                jPasswordField_matKhau.setEchoChar('*');
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dsTaiKhoan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jT_dangNhap = new javax.swing.JTextField();
        jPasswordField_matKhau = new javax.swing.JPasswordField();
        jRadioButton_matKhau = new javax.swing.JRadioButton();
        jL_loaiTaiKhoan = new javax.swing.JLabel();
        jL_tenDangNhap = new javax.swing.JLabel();
        jL_matKhau = new javax.swing.JLabel();
        jComboBox_loaiTaiKhoan = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jB_them = new javax.swing.JButton();
        jB_sua = new javax.swing.JButton();
        jB_xoa = new javax.swing.JButton();
        jB_lamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jL_timKiem = new javax.swing.JLabel();
        jComboBox_tieuChi = new javax.swing.JComboBox<>();
        jT_timKiem = new javax.swing.JTextField();
        jB_xuatExcel = new javax.swing.JButton();
        jPanel_South = new javax.swing.JPanel();
        jB_dau = new javax.swing.JButton();
        jB_truoc = new javax.swing.JButton();
        jL_trang = new javax.swing.JLabel();
        jB_sau = new javax.swing.JButton();
        jB_cuoi = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTable_dsTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên đăng nhập", "Mật khẩu", "Loại tài khoản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_dsTaiKhoan);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jT_dangNhap.setPreferredSize(new java.awt.Dimension(65, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 118;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jT_dangNhap, gridBagConstraints);

        jPasswordField_matKhau.setPreferredSize(new java.awt.Dimension(65, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 118;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jPasswordField_matKhau, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jRadioButton_matKhau, gridBagConstraints);

        jL_loaiTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_loaiTaiKhoan.setText("Loại tài khoản : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 117, 0, 0);
        jPanel2.add(jL_loaiTaiKhoan, gridBagConstraints);

        jL_tenDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_tenDangNhap.setText("Tên đăng nhập : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 75, 0, 0);
        jPanel2.add(jL_tenDangNhap, gridBagConstraints);

        jL_matKhau.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_matKhau.setText("Mật khẩu : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 119, 0, 0);
        jPanel2.add(jL_matKhau, gridBagConstraints);

        jComboBox_loaiTaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "USER", " " }));
        jComboBox_loaiTaiKhoan.setPreferredSize(new java.awt.Dimension(78, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 107;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jComboBox_loaiTaiKhoan, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách tài khoản");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jL_timKiem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_timKiem.setText("Tìm kiếm theo : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 80, 0, 0);
        jPanel2.add(jL_timKiem, gridBagConstraints);

        jComboBox_tieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Tên đăng nhập", "Loại tài khoản" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -13;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jComboBox_tieuChi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jT_timKiem, gridBagConstraints);

        jB_xuatExcel.setText("Xuất Excel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        jPanel2.add(jB_xuatExcel, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jB_dau.setText("|<");
        jB_dau.setPreferredSize(new java.awt.Dimension(85, 28));
        jPanel_South.add(jB_dau);

        jB_truoc.setText("<");
        jPanel_South.add(jB_truoc);

        jL_trang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_trang.setText("Trang 1 / X");
        jPanel_South.add(jL_trang);

        jB_sau.setText(">");
        jPanel_South.add(jB_sau);

        jB_cuoi.setText(">|");
        jB_cuoi.setPreferredSize(new java.awt.Dimension(85, 28));
        jPanel_South.add(jB_cuoi);

        add(jPanel_South, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    // Phương thức lấy dữ liệu từ các trường nhập liệu
    @Override
    public TaiKhoan getDataFromFields() {
        String tenDangNhap = jT_dangNhap.getText();
        String matKhau = new String(jPasswordField_matKhau.getPassword());
        TaiKhoan.LoaiTaiKhoan loai = TaiKhoan.LoaiTaiKhoan.valueOf((String) getjComboBox1().getSelectedItem());
        if (tenDangNhap.isEmpty() || matKhau.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return new TaiKhoan(tenDangNhap, matKhau, loai);
    }

    // Phương thức xóa các trường nhập liệu
    @Override
    public void clearFields() {
        getjT_dangNhap().setText("");
        getjPasswordField_matKhau().setText("");
        getjComboBox1().setSelectedIndex(0);
        getjT_dangNhap().setEnabled(true);
        getjB_them().setEnabled(true);
        getjB_sua().setEnabled(false);
        getjB_xoa().setEnabled(false);
    }

    @Override
// Phương thức nạp dữ liệu vào bảng
    public void loadDataToTable(QuanLyChung quanLy) {
        this.quanLy = quanLy;
        this.currentPage = 1;
        if (jT_timKiem != null) {
            jT_timKiem.setText("");
        }
        updateTableAndPagination();
    }

    private void updateTableAndPagination() {
        if (this.quanLy == null) {
            return;
        }
        // Lọc dữ liệu
        String tuKhoa = jT_timKiem.getText().toLowerCase().trim();
        String tieuChi = (String) jComboBox_tieuChi.getSelectedItem();
        List<TaiKhoan> danhSachGoc = this.quanLy.getDanhSachTaiKhoan();

        if (tuKhoa.isEmpty()) {
            filteredList = new ArrayList<>(danhSachGoc);
        } else {
            filteredList = danhSachGoc.stream().filter(tk -> {
                if (tk == null) {
                    return false;
                }
                switch (tieuChi) {
                    case "Tên đăng nhập":
                        return tk.getTenDangNhap() != null && tk.getTenDangNhap().toLowerCase().contains(tuKhoa);
                    case "Loại tài khoản":
                        return tk.getLoaiTaiKhoan() != null && tk.getLoaiTaiKhoan().toString().toLowerCase().contains(tuKhoa);
                    default: // "Tất cả"
                        boolean tenMatch = tk.getTenDangNhap() != null && tk.getTenDangNhap().toLowerCase().contains(tuKhoa);
                        boolean loaiMatch = tk.getLoaiTaiKhoan() != null && tk.getLoaiTaiKhoan().toString().toLowerCase().contains(tuKhoa);
                        return tenMatch || loaiMatch;
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
        List<TaiKhoan> pagedList = filteredList.subList(startIndex, endIndex);

        // Hiển thị
        tableModel.setRowCount(0);
        for (TaiKhoan tk : pagedList) {
            tableModel.addRow(new Object[]{tk.getTenDangNhap(), tk.getMatKhau(), tk.getLoaiTaiKhoan()});
        }

        jL_trang.setText("Trang " + currentPage + " / " + totalPages);
        jB_dau.setEnabled(currentPage > 1);
        jB_truoc.setEnabled(currentPage > 1);
        jB_sau.setEnabled(currentPage < totalPages);
        jB_cuoi.setEnabled(currentPage < totalPages);
    }

    @Override
    public void fillFieldsFromTable(int viewIndex) {
        int actualIndex = (currentPage - 1) * ITEMS_PER_PAGE + viewIndex;
        if (actualIndex < filteredList.size()) {
            TaiKhoan tk = filteredList.get(actualIndex);

            getjT_dangNhap().setText(tk.getTenDangNhap());
            getjPasswordField_matKhau().setText(tk.getMatKhau());

            String loaiTK = tk.getLoaiTaiKhoan().toString();
            for (int i = 0; i < getjComboBox1().getItemCount(); i++) {
                if (getjComboBox1().getItemAt(i).toString().equalsIgnoreCase(loaiTK)) {
                    getjComboBox1().setSelectedIndex(i);
                    break;
                }
            }

            getjT_dangNhap().setEnabled(false);
            getjB_them().setEnabled(false);
            getjB_sua().setEnabled(true);
            getjB_xoa().setEnabled(true);
        }
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

    public JComboBox<String> getjComboBox1() {
        return jComboBox_loaiTaiKhoan;
    }

    public JPasswordField getjPasswordField_matKhau() {
        return jPasswordField_matKhau;
    }

    public JTextField getjT_dangNhap() {
        return jT_dangNhap;
    }

    public JTable getjTable_dsTaiKhoan() {
        return jTable_dsTaiKhoan;
    }

    public javax.swing.JButton getjB_xuatExcel() {
        return jB_xuatExcel;
    }

    public List<model.TaiKhoan> getFilteredList() {
        return filteredList;
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
    private javax.swing.JButton jB_xuatExcel;
    private javax.swing.JComboBox<String> jComboBox_loaiTaiKhoan;
    private javax.swing.JComboBox<String> jComboBox_tieuChi;
    private javax.swing.JLabel jL_loaiTaiKhoan;
    private javax.swing.JLabel jL_matKhau;
    private javax.swing.JLabel jL_tenDangNhap;
    private javax.swing.JLabel jL_timKiem;
    private javax.swing.JLabel jL_trang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_South;
    private javax.swing.JPasswordField jPasswordField_matKhau;
    private javax.swing.JRadioButton jRadioButton_matKhau;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_dangNhap;
    private javax.swing.JTextField jT_timKiem;
    private javax.swing.JTable jTable_dsTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
