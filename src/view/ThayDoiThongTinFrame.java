package view;

import javax.swing.JOptionPane;
import model.HanhKhach;
import model.QuanLyChung;
import model.TaiKhoan;

public class ThayDoiThongTinFrame extends javax.swing.JFrame {

    private QuanLyChung quanLy;
    private TaiKhoan taiKhoanHienTai;

    public ThayDoiThongTinFrame(QuanLyChung quanLy, TaiKhoan taiKhoan, java.awt.Frame parent) {
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
        this.setLocationRelativeTo(parent);
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
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thay đổi thông tin");

        jButton_capNhat.setText("Cập nhật");

        jButton_huy.setText("Huỷ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jT_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
