package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.HangHangKhong;
import model.QuanLyChung;

public class PanelHangHangKhong_Admin extends BaseAdminPanel<HangHangKhong> {

    private TableRowSorter<DefaultTableModel> sorter;
    private DefaultTableModel tableModel;

    public PanelHangHangKhong_Admin() {
        initComponents();
        this.tableModel = (DefaultTableModel) jTable_dsHangHangKhong.getModel();

        sorter = new TableRowSorter<>(tableModel);
        jTable_dsHangHangKhong.setRowSorter(sorter);

        jT_timKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }
        });

        jTable_dsHangHangKhong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jTable_dsHangHangKhong.getSelectedRow();
                if (selectedRow != -1) {
                    int modelRow = jTable_dsHangHangKhong.convertRowIndexToModel(selectedRow);
                    fillFieldsFromTable(modelRow);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jL_maHang = new javax.swing.JLabel();
        jT_maHang = new javax.swing.JTextField();
        jL_tenHang = new javax.swing.JLabel();
        jT_tenHang = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jB_them = new javax.swing.JButton();
        jB_sua = new javax.swing.JButton();
        jB_xoa = new javax.swing.JButton();
        jB_lamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jL_timKiem = new javax.swing.JLabel();
        jComboBox_tieuChi = new javax.swing.JComboBox<>();
        jT_timKiem = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dsHangHangKhong = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jL_maHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maHang.setText(" Mã hãng : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 149, 0, 0);
        jPanel2.add(jL_maHang, gridBagConstraints);

        jT_maHang.setPreferredSize(new java.awt.Dimension(70, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jT_maHang, gridBagConstraints);

        jL_tenHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_tenHang.setText("Tên hãng : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 149, 0, 0);
        jPanel2.add(jL_tenHang, gridBagConstraints);

        jT_tenHang.setPreferredSize(new java.awt.Dimension(70, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jT_tenHang, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jB_them.setText("Thêm");
        jPanel3.add(jB_them);

        jB_sua.setText("Sửa");
        jPanel3.add(jB_sua);

        jB_xoa.setText("Xoá");
        jB_xoa.setToolTipText("");
        jPanel3.add(jB_xoa);

        jB_lamMoi.setText("Làm mới");
        jPanel3.add(jB_lamMoi);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 246;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 1, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách hãnh hàng không");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 24, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jL_timKiem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_timKiem.setText("Tìm kiếm theo : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 73, 0, 0);
        jPanel2.add(jL_timKiem, gridBagConstraints);

        jComboBox_tieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Tên hãng", "Mã hãng" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_tieuChi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jT_timKiem, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jTable_dsHangHangKhong.setModel(new javax.swing.table.DefaultTableModel(
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
                "Mã hãng", "Tên hãng", "Số lượng máy bay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_dsHangHangKhong);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Phương thức nạp dữ liệu vào bảng
    @Override
    public void loadDataToTable(QuanLyChung quanLy) {
        if (sorter != null) {
            sorter.setRowFilter(null);
        }
        tableModel.setRowCount(0);
        for (HangHangKhong hhk : quanLy.getDanhSachHang()) {
            tableModel.addRow(new Object[]{hhk.getMaHang(), hhk.getTenHang(), hhk.getDanhSachMayBay().size()});
        }
    }

    // Phương thức lấy dữ liệu từ các trường nhập liệu
    @Override
    public HangHangKhong getDataFromFields() {
        String maHang = jT_maHang.getText();
        String tenHang = jT_tenHang.getText();
        if (maHang.isEmpty() || tenHang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return new HangHangKhong(maHang, tenHang);
    }

    // Phương thức xóa các trường nhập liệu
    @Override
    public void clearFields() {
        jT_maHang.setText("");
        jT_tenHang.setText("");
        jT_maHang.setEnabled(true);
        jB_them.setEnabled(true);
        jB_sua.setEnabled(false);
        jB_xoa.setEnabled(false);
    }

    // Phương thức điền dữ liệu vào các trường khi chọn hàng trên bảng
    @Override
    public void fillFieldsFromTable(int modelRowIndex) {
        jT_maHang.setText(tableModel.getValueAt(modelRowIndex, 0).toString());
        jT_tenHang.setText(tableModel.getValueAt(modelRowIndex, 1).toString());
        jT_maHang.setEnabled(false);
        jB_them.setEnabled(false);
        jB_sua.setEnabled(true);
        jB_xoa.setEnabled(true);
    }

    private void filterTable() {
        String text = jT_timKiem.getText();
        String tieuChi = (String) jComboBox_tieuChi.getSelectedItem();
        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            int columnIndex = -1;
            if ("Mã hãng".equals(tieuChi)) {
                columnIndex = 0;
            } else if ("Tên hãng".equals(tieuChi)) {
                columnIndex = 1;
            }

            if (columnIndex == -1) {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, columnIndex));
            }
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

    public JTextField getjT_maHang() {
        return jT_maHang;
    }

    public JTextField getjT_tenHang() {
        return jT_tenHang;
    }

    public JTable getjTable_dsHangHangKhong() {
        return jTable_dsHangHangKhong;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_lamMoi;
    private javax.swing.JButton jB_sua;
    private javax.swing.JButton jB_them;
    private javax.swing.JButton jB_xoa;
    private javax.swing.JComboBox<String> jComboBox_tieuChi;
    private javax.swing.JLabel jL_maHang;
    private javax.swing.JLabel jL_tenHang;
    private javax.swing.JLabel jL_timKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_maHang;
    private javax.swing.JTextField jT_tenHang;
    private javax.swing.JTextField jT_timKiem;
    private javax.swing.JTable jTable_dsHangHangKhong;
    // End of variables declaration//GEN-END:variables
}
