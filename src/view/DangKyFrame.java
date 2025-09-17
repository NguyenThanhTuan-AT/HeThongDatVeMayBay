package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.QuanLyChung;
import model.TaiKhoan;

public class DangKyFrame extends javax.swing.JDialog {

    private QuanLyChung quanLy;

    public DangKyFrame(JFrame parent, boolean modal, QuanLyChung quanLy) {
        super(parent, modal);
        this.quanLy = quanLy;
        initComponents();
        this.setLocationRelativeTo(parent);

        jRadioButton_matKhau.addActionListener(evt -> {
            if (jRadioButton_matKhau.isSelected()) {
                jPasswordField_matKhau.setEchoChar((char) 0);
                jPasswordField_xacNhanMK.setEchoChar((char) 0);
            } else {
                jPasswordField_matKhau.setEchoChar('*');
                jPasswordField_xacNhanMK.setEchoChar('*');
            }
        });

        jT_hoTen.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_CCCD.requestFocusInWindow();
            }
        });
        jT_CCCD.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDate_NgaySinh.requestFocusInWindow();
            }
        });
        jT_tenDangNhap.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_matKhau.requestFocusInWindow();
            }
        });
        jPasswordField_matKhau.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_xacNhanMK.requestFocusInWindow();
            }
        });
        jPasswordField_xacNhanMK.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dangKyActionPerformed(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_tenDangNhap = new javax.swing.JLabel();
        jL_matKhau = new javax.swing.JLabel();
        jL_hoTen = new javax.swing.JLabel();
        jT_Email = new javax.swing.JTextField();
        jT_hoTen = new javax.swing.JTextField();
        jT_SĐT = new javax.swing.JTextField();
        jT_tenDangNhap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jL_xacNhanMK = new javax.swing.JLabel();
        jL_Email = new javax.swing.JLabel();
        jB_dangKy = new javax.swing.JButton();
        baoloimail = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        baoloiName = new javax.swing.JLabel();
        baoloiTenDN = new javax.swing.JLabel();
        jPasswordField_matKhau = new javax.swing.JPasswordField();
        baoloiMK = new javax.swing.JLabel();
        baoloiXacThuc = new javax.swing.JLabel();
        jPasswordField_xacNhanMK = new javax.swing.JPasswordField();
        jDate_NgaySinh = new com.toedter.calendar.JDateChooser();
        jT_CCCD = new javax.swing.JTextField();
        jL_CCCD = new javax.swing.JLabel();
        jL_ngaySinh = new javax.swing.JLabel();
        jL_SĐT = new javax.swing.JLabel();
        jB_dangNhap = new javax.swing.JButton();
        jRadioButton_matKhau = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ĐĂNG KÝ");
        setLocation(new java.awt.Point(0, 0));

        jL_tenDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_tenDangNhap.setText("Tên đăng nhập : ");

        jL_matKhau.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_matKhau.setText("Mật khẩu : ");

        jL_hoTen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hoTen.setText("Họ và tên : ");

        jT_Email.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jT_hoTen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ĐĂNG KÍ TÀI KHOẢN");

        jL_xacNhanMK.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_xacNhanMK.setText("Xác nhận mật khẩu : ");

        jL_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Email.setText("Email : ");

        jB_dangKy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jB_dangKy.setText("Đăng ký");
        jB_dangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dangKyActionPerformed(evt);
            }
        });

        baoloimail.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloimail.setForeground(new java.awt.Color(255, 51, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("@gmail.com");

        baoloiName.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloiName.setForeground(new java.awt.Color(255, 51, 51));

        baoloiTenDN.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloiTenDN.setForeground(new java.awt.Color(255, 51, 51));

        baoloiMK.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloiMK.setForeground(new java.awt.Color(255, 51, 51));

        baoloiXacThuc.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloiXacThuc.setForeground(new java.awt.Color(255, 51, 51));

        jDate_NgaySinh.setDateFormatString("dd/MM/yyyy");

        jL_CCCD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_CCCD.setText("CCCD : ");

        jL_ngaySinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_ngaySinh.setText("Ngày sinh : ");

        jL_SĐT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_SĐT.setText("SĐT : ");

        jB_dangNhap.setText("Đăng nhập");
        jB_dangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jPasswordField_xacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(baoloimail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jB_dangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jB_dangNhap)
                        .addGap(12, 12, 12)
                        .addComponent(baoloiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baoloiXacThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(baoloiTenDN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jL_xacNhanMK)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jL_hoTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jL_CCCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jL_ngaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jL_SĐT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jL_Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jL_tenDangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jL_matKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(baoloiName, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDate_NgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jT_CCCD, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jT_hoTen, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jT_SĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jT_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel10))
                            .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPasswordField_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(baoloiName)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_SĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_SĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(baoloimail))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_xacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_xacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(baoloiTenDN)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(baoloiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB_dangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_dangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(baoloiXacThuc)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_dangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_dangKyActionPerformed
        String hoTen = jT_hoTen.getText();
        String cccd = jT_CCCD.getText();
        String tenDN = jT_tenDangNhap.getText();
        String matKhau = new String(jPasswordField_matKhau.getPassword());
        String xacNhanMK = new String(jPasswordField_xacNhanMK.getPassword());

        if (hoTen.isEmpty() || cccd.isEmpty() || tenDN.isEmpty() || matKhau.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ các trường bắt buộc:\nHọ tên, CCCD, Tên đăng nhập, Mật khẩu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (quanLy.timHanhKhach(cccd) != null) {
            JOptionPane.showMessageDialog(this, "Số CCCD này đã được đăng ký cho một tài khoản khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (quanLy.timTaiKhoan(tenDN) != null) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại. Vui lòng chọn tên khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (matKhau.length() < 6) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải có ít nhất 6 ký tự.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!matKhau.equals(xacNhanMK)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        TaiKhoan tkMoi = new TaiKhoan(tenDN, matKhau, TaiKhoan.LoaiTaiKhoan.USER, hoTen, cccd);
        quanLy.themTaiKhoan(tkMoi);

        JOptionPane.showMessageDialog(this, "Đăng ký tài khoản thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jB_dangKyActionPerformed

    private void jB_dangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_dangNhapActionPerformed
        this.dispose();
    }//GEN-LAST:event_jB_dangNhapActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baoloiMK;
    private javax.swing.JLabel baoloiName;
    private javax.swing.JLabel baoloiTenDN;
    private javax.swing.JLabel baoloiXacThuc;
    private javax.swing.JLabel baoloimail;
    private javax.swing.JButton jB_dangKy;
    private javax.swing.JButton jB_dangNhap;
    private com.toedter.calendar.JDateChooser jDate_NgaySinh;
    private javax.swing.JLabel jL_CCCD;
    private javax.swing.JLabel jL_Email;
    private javax.swing.JLabel jL_SĐT;
    private javax.swing.JLabel jL_hoTen;
    private javax.swing.JLabel jL_matKhau;
    private javax.swing.JLabel jL_ngaySinh;
    private javax.swing.JLabel jL_tenDangNhap;
    private javax.swing.JLabel jL_xacNhanMK;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField_matKhau;
    private javax.swing.JPasswordField jPasswordField_xacNhanMK;
    private javax.swing.JRadioButton jRadioButton_matKhau;
    private javax.swing.JTextField jT_CCCD;
    private javax.swing.JTextField jT_Email;
    private javax.swing.JTextField jT_SĐT;
    private javax.swing.JTextField jT_hoTen;
    private javax.swing.JTextField jT_tenDangNhap;
    // End of variables declaration//GEN-END:variables
}
