package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.HangHangKhong;
import model.MayBay;
import model.QuanLyChung;

public class PanelMayBay_Admin extends javax.swing.JPanel {

    public PanelMayBay_Admin() {
        initComponents();
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow != -1) {
                    fillFieldsFromTable(selectedRow);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jL_soHieuMB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_soHieuMB.setText("Số hiệu máy bay : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 111, 0, 0);
        jPanel2.add(jL_soHieuMB, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 130, 0, 0);
        jPanel2.add(jL_maHang, gridBagConstraints);

        jComboBox_maHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jComboBox_maHang, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jB_them.setText("Thêm");
        jB_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_themActionPerformed(evt);
            }
        });
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
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 269;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách máy bay");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 54, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_themActionPerformed

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
        return jTable1;
    }

    // Phương thức nạp dữ liệu vào bảng
    public void loadDataToTable(QuanLyChung quanLy) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (MayBay mb : quanLy.getDanhSachMayBay()) {
            Object[] row = new Object[]{mb.getSoHieuMayBay(), mb.getMaHang()};
            model.addRow(row);
        }
    }

    // Phương thức nạp danh sách mã hãng vào JComboBox
    public void loadMaHang(QuanLyChung quanLy) {
        List<String> maHangList = quanLy.getDanhSachHang().stream()
                .map(HangHangKhong::getMaHang).collect(Collectors.toList());
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(maHangList.toArray(new String[0]));
        jComboBox_maHang.setModel(model);
    }

    // Phương thức lấy dữ liệu từ các trường nhập liệu
    public MayBay getDataFromFields() {
        String soHieu = jT_soHieuMB.getText();
        String maHang = (String) jComboBox_maHang.getSelectedItem();
        if (soHieu.isEmpty() || maHang == null || maHang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return new MayBay(soHieu, maHang);
    }

    // Phương thức xóa các trường nhập liệu
    public void clearFields() {
        jT_soHieuMB.setText("");
        jComboBox_maHang.setSelectedIndex(-1);
        jT_soHieuMB.setEnabled(true);
        jB_them.setEnabled(true);
        jB_sua.setEnabled(false);
        jB_xoa.setEnabled(false);
    }

    // Phương thức điền dữ liệu vào các trường khi chọn hàng trên bảng
    public void fillFieldsFromTable(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jT_soHieuMB.setText(model.getValueAt(rowIndex, 0).toString());
        jComboBox_maHang.setSelectedItem(model.getValueAt(rowIndex, 1).toString());
        jT_soHieuMB.setEnabled(false);
        jB_them.setEnabled(false);
        jB_sua.setEnabled(true);
        jB_xoa.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_lamMoi;
    private javax.swing.JButton jB_sua;
    private javax.swing.JButton jB_them;
    private javax.swing.JButton jB_xoa;
    private javax.swing.JComboBox<String> jComboBox_maHang;
    private javax.swing.JLabel jL_maHang;
    private javax.swing.JLabel jL_soHieuMB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_soHieuMB;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
