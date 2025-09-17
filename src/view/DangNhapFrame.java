package view;

import javax.swing.JOptionPane;
import model.QuanLyChung;
import model.TaiKhoan;

public class DangNhapFrame extends javax.swing.JFrame {

    private QuanLyChung quanLy;

    public DangNhapFrame() {
        initComponents();

        this.quanLy = new QuanLyChung(); // Khởi tạo đối tượng quản lý

        jL_thongbaoLoi.setVisible(false);
        setTitle("Đăng nhập hệ thống");
        jPasswordField_matKhau.setEchoChar('*');
        this.setLocationRelativeTo(null);

        // Xử lý sự kiện khi chọn "Hiện mật khẩu"
        jRadioButton_matKhau.addActionListener(evt -> {
            if (jRadioButton_matKhau.isSelected()) {
                jPasswordField_matKhau.setEchoChar((char) 0); // Hiển thị mật khẩu
            } else {
                jPasswordField_matKhau.setEchoChar('*'); // Ẩn mật khẩu
            }
        });

        // Xử lý Enter
        jT_tenDangNhap.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_matKhau.requestFocusInWindow();
            }
        });
        jPasswordField_matKhau.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dangNhapActionPerformed(evt);
            }
        });
        //Nút đăng ký
        jB_dangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangKyFrame dangKyFrame = new DangKyFrame(DangNhapFrame.this, true, quanLy);
                dangKyFrame.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_tenDangNhap = new javax.swing.JTextField();
        jPasswordField_matKhau = new javax.swing.JPasswordField();
        jB_dangNhap = new javax.swing.JButton();
        jRadioButton_matKhau = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jB_dangKy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jL_thongbaoLoi = new java.awt.Label();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên đăng nhập");

        jLabel2.setText("Mật khẩu");

        jT_tenDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_tenDangNhapActionPerformed(evt);
            }
        });

        jB_dangNhap.setText("Đăng nhập");
        jB_dangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dangNhapActionPerformed(evt);
            }
        });

        jRadioButton_matKhau.setText("Hiện mật khẩu");
        jRadioButton_matKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_matKhauActionPerformed(evt);
            }
        });

        jLabel3.setText("Chưa có tài khoản ?");

        jB_dangKy.setText("Đăng ký");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("Đăng nhập");

        jL_thongbaoLoi.setForeground(new java.awt.Color(255, 51, 0));
        jL_thongbaoLoi.setText("Tên đăng nhập hoặc mật khẩu không đúng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jB_dangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(jB_dangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jL_thongbaoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_matKhau))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_thongbaoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jB_dangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_dangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_matKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_matKhauActionPerformed
    }//GEN-LAST:event_jRadioButton_matKhauActionPerformed

    private void jB_dangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_dangNhapActionPerformed
        String tenDangNhap = jT_tenDangNhap.getText();
        String matKhau = new String(jPasswordField_matKhau.getPassword());

        if (tenDangNhap.isEmpty() || matKhau.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ tên đăng nhập và mật khẩu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean dangNhapThanhCong = quanLy.kiemTraDangNhap(tenDangNhap, matKhau);

        if (dangNhapThanhCong) {
            // Đăng nhập thành công, ẩn thông báo lỗi nếu có
            jL_thongbaoLoi.setVisible(false);

            // Lấy thông tin tài khoản để phân quyền
            TaiKhoan taiKhoan = quanLy.timTaiKhoan(tenDangNhap);

            // Đóng cửa sổ đăng nhập
            this.dispose();

            // Mở Frame tương ứng với loại tài khoản
            if (taiKhoan.laAdmin()) {
                // Mở giao diện Admin
                Frame_Admin adminFrame = new Frame_Admin(quanLy, taiKhoan);
                adminFrame.setVisible(true);
            } else {
                // Mở giao diện User
                Frame_User userFrame = new Frame_User(quanLy, taiKhoan);
                userFrame.setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại.",
                    "Đăng nhập thất bại",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jB_dangNhapActionPerformed

    private void jT_tenDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_tenDangNhapActionPerformed
    }//GEN-LAST:event_jT_tenDangNhapActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_dangKy;
    private javax.swing.JButton jB_dangNhap;
    private java.awt.Label jL_thongbaoLoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_matKhau;
    private javax.swing.JRadioButton jRadioButton_matKhau;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_tenDangNhap;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
