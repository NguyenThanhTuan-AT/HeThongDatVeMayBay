package view;

import javax.swing.JOptionPane;
import model.HanhKhach;
import model.QuanLyChung;
import model.TaiKhoan;

public class ThayDoiThongTinFrame extends javax.swing.JFrame {

    private QuanLyChung quanLy;
    private TaiKhoan taiKhoanHienTai;

    public ThayDoiThongTinFrame(QuanLyChung quanLy, TaiKhoan taiKhoan) {
        this.quanLy = quanLy;
        this.taiKhoanHienTai = taiKhoan;
        initComponents();
        this.setTitle("Thay đổi Thông tin cá nhân");

        // 3. Điền thông tin hiện tại của người dùng vào các ô
        jT_tenDangNhap.setText(taiKhoan.getTenDangNhap());
        jT_hoTen.setText(taiKhoan.getHoTen());
        jT_CCCD.setText(taiKhoan.getCccd());

        // Không cho phép sửa Tên đăng nhập và CCCD (khóa chính)
        jT_tenDangNhap.setEditable(false);
        jT_CCCD.setEditable(false);

        jT_hoTen.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_CCCD.requestFocusInWindow();
            }
        });
        jT_CCCD.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_capNhatActionPerformed(evt);
            }
        });
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jT_tenDangNhap = new javax.swing.JTextField();
        jL_hoTen = new javax.swing.JLabel();
        jT_hoTen = new javax.swing.JTextField();
        jL_CCCD = new javax.swing.JLabel();
        jT_CCCD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton_capNhat = new javax.swing.JButton();
        jButton_huy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Tên đăng nhập");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 33, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jT_tenDangNhap.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 131;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 1, 0, 100);
        getContentPane().add(jT_tenDangNhap, gridBagConstraints);

        jL_hoTen.setText("Họ tên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 33, 0, 0);
        getContentPane().add(jL_hoTen, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 131;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 1, 0, 100);
        getContentPane().add(jT_hoTen, gridBagConstraints);

        jL_CCCD.setText("CCCD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 33, 0, 0);
        getContentPane().add(jL_CCCD, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 131;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 1, 0, 100);
        getContentPane().add(jT_CCCD, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Thay đổi thông tin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 136, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jButton_capNhat.setText("Cập nhật");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 69, 46, 0);
        getContentPane().add(jButton_capNhat, gridBagConstraints);

        jButton_huy.setText("Huỷ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 4, 46, 100);
        getContentPane().add(jButton_huy, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_huyActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jButton_capNhatActionPerformed(java.awt.event.ActionEvent evt) {
        String hoTenMoi = jT_hoTen.getText();
        if (hoTenMoi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Họ tên không được để trống.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cập nhật cho đối tượng TaiKhoan
        taiKhoanHienTai.setHoTen(hoTenMoi);
        quanLy.suaTaiKhoan(taiKhoanHienTai);

        // Cập nhật cho đối tượng HanhKhach tương ứng
        HanhKhach hanhKhach = quanLy.timHanhKhach(taiKhoanHienTai.getCccd());
        if (hanhKhach != null) {
            hanhKhach.setHoTen(hoTenMoi);
            quanLy.suaHanhKhach(hanhKhach);
        }

        JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_capNhat;
    private javax.swing.JButton jButton_huy;
    private javax.swing.JLabel jL_CCCD;
    private javax.swing.JLabel jL_hoTen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jT_CCCD;
    private javax.swing.JTextField jT_hoTen;
    private javax.swing.JTextField jT_tenDangNhap;
    // End of variables declaration//GEN-END:variables
}
