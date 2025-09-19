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
        jB_qlHang = new javax.swing.JButton();
        jB_qlMayBay = new javax.swing.JButton();
        jB_qlChuyenBay = new javax.swing.JButton();
        jB_qlVe = new javax.swing.JButton();
        jB_qlHanhKhach = new javax.swing.JButton();
        jB_thongKe = new javax.swing.JButton();
        jB_qlTaiKhoan = new javax.swing.JButton();
        jB_doiMatKhau = new javax.swing.JButton();
        jB_suaThongTin = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jPanel_Header.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hệ thống đặt vé máy bay");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 561;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        jPanel_Header.add(jLabel2, gridBagConstraints);

        jL_xinChao.setText("Xin chào, Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel_Header.add(jL_xinChao, gridBagConstraints);

        jB_dangXuat.setText("Đăng xuất");
        jB_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dangXuatActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel_Header.add(jB_dangXuat, gridBagConstraints);

        jPanel_chucNang.setLayout(new java.awt.GridLayout(1, 0));

        jB_qlHang.setText("Hãng");
        jPanel_chucNang.add(jB_qlHang);

        jB_qlMayBay.setText("Máy bay");
        jB_qlMayBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_qlMayBayActionPerformed(evt);
            }
        });
        jPanel_chucNang.add(jB_qlMayBay);

        jB_qlChuyenBay.setText("Chuyến bay");
        jPanel_chucNang.add(jB_qlChuyenBay);

        jB_qlVe.setText("Vé");
        jPanel_chucNang.add(jB_qlVe);

        jB_qlHanhKhach.setText("Hành khách");
        jPanel_chucNang.add(jB_qlHanhKhach);

        jB_thongKe.setText("Thống kê");
        jB_thongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_thongKeActionPerformed(evt);
            }
        });
        jPanel_chucNang.add(jB_thongKe);

        jB_qlTaiKhoan.setText("Tài khoản");
        jPanel_chucNang.add(jB_qlTaiKhoan);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 15, 0);
        jPanel_Header.add(jPanel_chucNang, gridBagConstraints);

        jB_doiMatKhau.setText("Đổi mật khẩu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel_Header.add(jB_doiMatKhau, gridBagConstraints);

        jB_suaThongTin.setText("Sửa thông tin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 355, 0, 0);
        jPanel_Header.add(jB_suaThongTin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
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

    public JButton getjB_qlHanhKhach() {
        return jB_qlHanhKhach;
    }

    public JButton getjB_qlVe() {
        return jB_qlVe;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_dangXuat;
    private javax.swing.JButton jB_doiMatKhau;
    private javax.swing.JButton jB_qlChuyenBay;
    private javax.swing.JButton jB_qlHang;
    private javax.swing.JButton jB_qlHanhKhach;
    private javax.swing.JButton jB_qlMayBay;
    private javax.swing.JButton jB_qlTaiKhoan;
    private javax.swing.JButton jB_qlVe;
    private javax.swing.JButton jB_suaThongTin;
    private javax.swing.JButton jB_thongKe;
    private javax.swing.JLabel jL_xinChao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_chucNang;
    // End of variables declaration//GEN-END:variables
}
