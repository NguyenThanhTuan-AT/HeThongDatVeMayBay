package view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelHeader_Admin extends javax.swing.JPanel {

    public PanelHeader_Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel_Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jL_xinChao = new javax.swing.JLabel();
        jB_dangXuat = new javax.swing.JButton();
        jPanel_chucNang = new javax.swing.JPanel();
        jB_qlChuyenBay = new javax.swing.JButton();
        jB_qlMayBay = new javax.swing.JButton();
        jB_qlHang = new javax.swing.JButton();
        jB_qlTaiKhoan = new javax.swing.JButton();
        jB_thongKe = new javax.swing.JButton();
        jB_doiMatKhau = new javax.swing.JButton();
        jB_suaThongTin = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hệ thống đặt vé máy bay");

        jL_xinChao.setText("Xin chào, Admin");

        jB_dangXuat.setText("Đăng xuất");
        jB_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dangXuatActionPerformed(evt);
            }
        });

        jPanel_chucNang.setLayout(new java.awt.GridLayout(1, 0));

        jB_qlChuyenBay.setText("Chuyến bay");
        jPanel_chucNang.add(jB_qlChuyenBay);

        jB_qlMayBay.setText("Máy bay");
        jB_qlMayBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_qlMayBayActionPerformed(evt);
            }
        });
        jPanel_chucNang.add(jB_qlMayBay);

        jB_qlHang.setText("Hãng");
        jPanel_chucNang.add(jB_qlHang);

        jB_qlTaiKhoan.setText("Tài khoản");
        jPanel_chucNang.add(jB_qlTaiKhoan);

        jB_thongKe.setText("Thống kê");
        jB_thongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_thongKeActionPerformed(evt);
            }
        });
        jPanel_chucNang.add(jB_thongKe);

        jB_doiMatKhau.setText("Đổi mật khẩu");

        jB_suaThongTin.setText("Sửa thông tin");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jL_xinChao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_suaThongTin)
                .addGap(0, 0, 0)
                .addComponent(jB_doiMatKhau)
                .addGap(0, 0, 0)
                .addComponent(jB_dangXuat))
            .addComponent(jPanel_chucNang, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_xinChao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_dangXuat)
                    .addComponent(jB_doiMatKhau)
                    .addComponent(jB_suaThongTin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_chucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jPanel_Header, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_dangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_dangXuatActionPerformed

    private void jB_qlMayBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_qlMayBayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_qlMayBayActionPerformed

    private void jB_thongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_thongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_thongKeActionPerformed

    public JButton getjB_qlChuyenBay() {
        return jB_qlChuyenBay;
    }

    public JButton getjB_qlHang() {
        return jB_qlHang;
    }

    public JButton getjB_qlTaiKhoan() {
        return jB_qlTaiKhoan;
    }

    public JButton getjB_thongKe() {
        return jB_thongKe;
    }

    public JButton getjB_dangXuat() {
        return jB_dangXuat;
    }

    public JLabel getjL_xinChao() {
        return jL_xinChao;
    }

    public JButton getjB_qlMayBay() {
        return jB_qlMayBay;
    }

    public JButton getjB_doiMatKhau() {
        return jB_doiMatKhau;
    }

    public JButton getjB_suaThongTin() {
        return jB_suaThongTin;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_dangXuat;
    private javax.swing.JButton jB_doiMatKhau;
    private javax.swing.JButton jB_qlChuyenBay;
    private javax.swing.JButton jB_qlHang;
    private javax.swing.JButton jB_qlMayBay;
    private javax.swing.JButton jB_qlTaiKhoan;
    private javax.swing.JButton jB_suaThongTin;
    private javax.swing.JButton jB_thongKe;
    private javax.swing.JLabel jL_xinChao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_chucNang;
    // End of variables declaration//GEN-END:variables
}
