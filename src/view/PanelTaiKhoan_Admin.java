package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.QuanLyChung;
import model.TaiKhoan;

public class PanelTaiKhoan_Admin extends javax.swing.JPanel {

    public PanelTaiKhoan_Admin() {
        initComponents();
        jTable_dsTaiKhoan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jTable_dsTaiKhoan.getSelectedRow();
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
        jTable_dsTaiKhoan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jT_dangNhap = new javax.swing.JTextField();
        jPasswordField_matKhau = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jL_loaiTaiKhoan = new javax.swing.JLabel();
        jL_tenDangNhap = new javax.swing.JLabel();
        jL_matKhau = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jB_them = new javax.swing.JButton();
        jB_sua = new javax.swing.JButton();
        jB_xoa = new javax.swing.JButton();
        jB_lamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        ));
        jScrollPane3.setViewportView(jTable_dsTaiKhoan);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jT_dangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_dangNhapActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel2.add(jT_dangNhap, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel2.add(jPasswordField_matKhau, gridBagConstraints);

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 0);
        jPanel2.add(jRadioButton1, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 117, 0, 0);
        jPanel2.add(jL_matKhau, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "USER", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 107;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel2.add(jComboBox1, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách tài khoản");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_themActionPerformed

    private void jT_dangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_dangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_dangNhapActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
        return jComboBox1;
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

    // Phương thức nạp dữ liệu vào bảng
    public void loadDataToTable(QuanLyChung quanLy) {
        DefaultTableModel model = (DefaultTableModel) jTable_dsTaiKhoan.getModel();
        model.setRowCount(0);
        for (TaiKhoan tk : quanLy.getDanhSachTaiKhoan()) {
            Object[] row = new Object[]{tk.getTenDangNhap(), tk.getMatKhau(), tk.getLoaiTaiKhoan()};
            model.addRow(row);
        }
    }

    // Phương thức lấy dữ liệu từ các trường nhập liệu
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
    public void clearFields() {
        getjT_dangNhap().setText("");
        getjPasswordField_matKhau().setText("");
        getjComboBox1().setSelectedIndex(0);
        getjT_dangNhap().setEnabled(true);
        getjB_them().setEnabled(true);
        getjB_sua().setEnabled(false);
        getjB_xoa().setEnabled(false);
    }

    // Phương thức điền dữ liệu vào các trường khi chọn hàng trên bảng
    public void fillFieldsFromTable(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) getjTable_dsTaiKhoan().getModel();
        getjT_dangNhap().setText(model.getValueAt(rowIndex, 0).toString());
        getjPasswordField_matKhau().setText(model.getValueAt(rowIndex, 1).toString());
        getjComboBox1().setSelectedItem(model.getValueAt(rowIndex, 2).toString());
        getjT_dangNhap().setEnabled(false);
        getjB_them().setEnabled(false);
        getjB_sua().setEnabled(true);
        getjB_xoa().setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_lamMoi;
    private javax.swing.JButton jB_sua;
    private javax.swing.JButton jB_them;
    private javax.swing.JButton jB_xoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jL_loaiTaiKhoan;
    private javax.swing.JLabel jL_matKhau;
    private javax.swing.JLabel jL_tenDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_matKhau;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_dangNhap;
    private javax.swing.JTable jTable_dsTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
