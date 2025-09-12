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

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        jLabel1.setText("Tên đăng nhập");

        jT_tenDangNhap.setEditable(false);

        jL_hoTen.setText("Họ tên");

        jL_CCCD.setText("CCCD");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Thay đổi thông tin");

        jButton_capNhat.setText("Cập nhật");

        jButton_huy.setText("Huỷ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel2)
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jL_hoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_CCCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jT_CCCD)
                            .addComponent(jT_hoTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(jT_tenDangNhap)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

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
