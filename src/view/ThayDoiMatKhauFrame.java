package view;

import javax.swing.JOptionPane;
import model.QuanLyChung;
import model.TaiKhoan;

public class ThayDoiMatKhauFrame extends javax.swing.JFrame {

    private QuanLyChung quanLy;
    private TaiKhoan taiKhoanHienTai;

    public ThayDoiMatKhauFrame(QuanLyChung quanLy, TaiKhoan taiKhoan) {
        this.quanLy = quanLy;
        this.taiKhoanHienTai = taiKhoan;
        initComponents();
        setTitle("Đổi mật khẩu");

        // Điền sẵn tên đăng nhập và không cho sửa
        jT_tenDangNhap.setText(taiKhoanHienTai.getTenDangNhap());
        jT_tenDangNhap.setEditable(false);

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jL_mkHienTai = new javax.swing.JLabel();
        jL_mkMoi = new javax.swing.JLabel();
        jPasswordField_mkMoi = new javax.swing.JPasswordField();
        jL_XacThucMK = new javax.swing.JLabel();
        jPasswordField_XacThucMK = new javax.swing.JPasswordField();
        jB_Luu = new javax.swing.JButton();
        jB_Huy = new javax.swing.JButton();
        jL_tenDangNhap = new javax.swing.JLabel();
        jT_tenDangNhap = new javax.swing.JTextField();
        jRadioButton_mkHienTai = new javax.swing.JRadioButton();
        jRadioButton_mkMoi = new javax.swing.JRadioButton();
        jRadioButton_xacThucMK = new javax.swing.JRadioButton();
        jPasswordField_mkHienTai = new javax.swing.JPasswordField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Đổi Mật Khẩu");

        jL_mkHienTai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jL_mkHienTai.setText("Mật khẩu hiện tại");

        jL_mkMoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jL_mkMoi.setText("Mật khẩu mới");

        jPasswordField_mkMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField_mkMoiMouseClicked(evt);
            }
        });

        jL_XacThucMK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jL_XacThucMK.setText("Xác thực mật khẩu");

        jPasswordField_XacThucMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField_XacThucMKMouseClicked(evt);
            }
        });

        jB_Luu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jB_Luu.setText("Lưu");
        jB_Luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_LuuMouseClicked(evt);
            }
        });

        jB_Huy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jB_Huy.setText("Hủy");
        jB_Huy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_HuyMouseClicked(evt);
            }
        });

        jL_tenDangNhap.setText("Tên đăng nhập");
        jL_tenDangNhap.setToolTipText("");

        jT_tenDangNhap.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_XacThucMK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField_XacThucMK))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jL_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jL_mkHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jL_mkMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordField_mkMoi)
                                        .addComponent(jPasswordField_mkHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_mkMoi)
                            .addComponent(jRadioButton_xacThucMK)
                            .addComponent(jRadioButton_mkHienTai)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jB_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jB_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_mkHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton_mkHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPasswordField_mkHienTai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_mkMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_mkMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_mkMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_XacThucMK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_XacThucMK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_xacThucMK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_HuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_HuyMouseClicked
        this.dispose(); // Đóng cửa sổ
    }//GEN-LAST:event_jB_HuyMouseClicked

    private void jB_LuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_LuuMouseClicked
        String matKhauHienTai = new String(jPasswordField_mkHienTai.getPassword());
        String matKhauMoi = new String(jPasswordField_mkMoi.getPassword());
        String xacThucMatKhau = new String(jPasswordField_XacThucMK.getPassword());

        if (!matKhauHienTai.equals(taiKhoanHienTai.getMatKhau())) {
            JOptionPane.showMessageDialog(this, "Mật khẩu hiện tại không đúng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (matKhauMoi.length() < 6) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới phải có ít nhất 6 ký tự.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!matKhauMoi.equals(xacThucMatKhau)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác thực không khớp.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cập nhật mật khẩu mới và lưu vào file
        taiKhoanHienTai.setMatKhau(matKhauMoi);
        quanLy.suaTaiKhoan(taiKhoanHienTai);

        JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
        this.dispose();
    }//GEN-LAST:event_jB_LuuMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    }//GEN-LAST:event_formMouseClicked

    private void jPasswordField_mkMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_mkMoiMouseClicked
    }//GEN-LAST:event_jPasswordField_mkMoiMouseClicked

    private void jPasswordField_XacThucMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_XacThucMKMouseClicked
    }//GEN-LAST:event_jPasswordField_XacThucMKMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Huy;
    private javax.swing.JButton jB_Luu;
    private javax.swing.JLabel jL_XacThucMK;
    private javax.swing.JLabel jL_mkHienTai;
    private javax.swing.JLabel jL_mkMoi;
    private javax.swing.JLabel jL_tenDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField_XacThucMK;
    private javax.swing.JPasswordField jPasswordField_mkHienTai;
    private javax.swing.JPasswordField jPasswordField_mkMoi;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton_mkHienTai;
    private javax.swing.JRadioButton jRadioButton_mkMoi;
    private javax.swing.JRadioButton jRadioButton_xacThucMK;
    private javax.swing.JTextField jT_tenDangNhap;
    // End of variables declaration//GEN-END:variables
}
