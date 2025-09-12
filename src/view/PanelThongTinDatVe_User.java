package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.ChuyenBay;
import model.QuanLyChung;

public class PanelThongTinDatVe_User extends javax.swing.JPanel {

    private ChuyenBay chuyenBayHienTai;

    public PanelThongTinDatVe_User() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jL_thongTinDaChon = new javax.swing.JLabel();
        jL_soHieu = new javax.swing.JLabel();
        jL_hang = new javax.swing.JLabel();
        jL_thoiGian = new javax.swing.JLabel();
        jT_soHieu = new javax.swing.JTextField();
        jT_hang = new javax.swing.JTextField();
        jT_thoiGian = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_hangVe = new javax.swing.JComboBox<>();
        jL_giá = new javax.swing.JLabel();
        jT_gia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jL_thongTinHanhKhach = new javax.swing.JLabel();
        jL_hoTen = new javax.swing.JLabel();
        jL_CCCD = new javax.swing.JLabel();
        jT_hoTen = new javax.swing.JTextField();
        jT_CCCD = new javax.swing.JTextField();
        jB_xacNhan = new javax.swing.JButton();
        jB_quayLai = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông tin đặt vé");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 454;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel4.add(jLabel2, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jL_thongTinDaChon.setText("Thông tin chuyến bay đã chọn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 55, 0, 0);
        jPanel1.add(jL_thongTinDaChon, gridBagConstraints);

        jL_soHieu.setText("-   Số hiệu: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 179, 0, 0);
        jPanel1.add(jL_soHieu, gridBagConstraints);

        jL_hang.setText("-   Hãng: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 179, 0, 0);
        jPanel1.add(jL_hang, gridBagConstraints);

        jL_thoiGian.setText("-   Thời gian: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 179, 0, 0);
        jPanel1.add(jL_thoiGian, gridBagConstraints);

        jT_soHieu.setEditable(false);
        jT_soHieu.setToolTipText("");
        jT_soHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_soHieuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 121;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 165);
        jPanel1.add(jT_soHieu, gridBagConstraints);

        jT_hang.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 131;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 165);
        jPanel1.add(jT_hang, gridBagConstraints);

        jT_thoiGian.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 165);
        jPanel1.add(jT_thoiGian, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel4.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Lựa chọn hạng vé");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 77, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel3.setText("Hạng vé");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 180, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        jComboBox_hangVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phổ thông", "Thương gia" }));
        jComboBox_hangVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_hangVeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jComboBox_hangVe, gridBagConstraints);

        jL_giá.setText("Giá");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 180, 0, 0);
        jPanel2.add(jL_giá, gridBagConstraints);

        jT_gia.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 222);
        jPanel2.add(jT_gia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel4.add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jL_thongTinHanhKhach.setText("Thông tin hành khách");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 79, 0, 0);
        jPanel3.add(jL_thongTinHanhKhach, gridBagConstraints);

        jL_hoTen.setText("Họ tên: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 167, 0, 0);
        jPanel3.add(jL_hoTen, gridBagConstraints);

        jL_CCCD.setText("CCCD: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 167, 0, 0);
        jPanel3.add(jL_CCCD, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 168);
        jPanel3.add(jT_hoTen, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 168);
        jPanel3.add(jT_CCCD, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel4.add(jPanel3, gridBagConstraints);

        jB_xacNhan.setText("Xác nhận");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 180, 0, 0);
        jPanel4.add(jB_xacNhan, gridBagConstraints);

        jB_quayLai.setText("<< Quay lại");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel4.add(jB_quayLai, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 21, 0);
        add(jPanel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjB_quayLai() {
        return jB_quayLai;
    }

    public JButton getjB_xacNhan() {
        return jB_xacNhan;
    }

    public JComboBox<String> getjComboBox_hangVe() {
        return jComboBox_hangVe;
    }

    public JTextField getjT_CCCD() {
        return jT_CCCD;
    }

    public JTextField getjT_gia() {
        return jT_gia;
    }

    public JTextField getjT_hang() {
        return jT_hang;
    }

    public JTextField getjT_hoTen() {
        return jT_hoTen;
    }

    public JTextField getjT_soHieu() {
        return jT_soHieu;
    }

    public JTextField getjT_thoiGian() {
        return jT_thoiGian;
    }

    public ChuyenBay getChuyenBayHienTai() {
        return chuyenBayHienTai;
    }

    public void setThongTinChuyenBay(ChuyenBay cb, QuanLyChung quanLy) {
        this.chuyenBayHienTai = cb;
        if (cb != null) {
            jT_soHieu.setText(cb.getSoHieuChuyenBay());

            // Lấy tên hãng từ mã máy bay để hiển thị
            String maHang = quanLy.timMayBay(cb.getSoHieuMayBay()).getMaHang();
            String tenHang = quanLy.timHang(maHang).getTenHang();
            jT_hang.setText(tenHang);

            jT_thoiGian.setText(cb.getThoiGianDi().toString() + " - " + cb.getThoiGianDen().toString());

            // Cập nhật giá vé mặc định là Phổ thông
            jComboBox_hangVe.setSelectedIndex(0);
            jT_gia.setText(String.format("%,.0f VNĐ", cb.getGiaPhoThong()));
        }
    }

    private void jT_soHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_soHieuActionPerformed

    }//GEN-LAST:event_jT_soHieuActionPerformed

    private void jComboBox_hangVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_hangVeActionPerformed

    }//GEN-LAST:event_jComboBox_hangVeActionPerformed

    private void capNhatGiaVe() {
        if (chuyenBayHienTai != null) {
            String selectedHangVe = (String) jComboBox_hangVe.getSelectedItem();
            double giaVe = 0;
            if ("Phổ thông".equals(selectedHangVe)) {
                giaVe = chuyenBayHienTai.getGiaPhoThong();
            } else if ("Thương gia".equals(selectedHangVe)) {
                giaVe = chuyenBayHienTai.getGiaThuongGia();
            }
            jT_gia.setText(String.format("%,.0f VNĐ", giaVe));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_quayLai;
    private javax.swing.JButton jB_xacNhan;
    private javax.swing.JComboBox<String> jComboBox_hangVe;
    private javax.swing.JLabel jL_CCCD;
    private javax.swing.JLabel jL_giá;
    private javax.swing.JLabel jL_hang;
    private javax.swing.JLabel jL_hoTen;
    private javax.swing.JLabel jL_soHieu;
    private javax.swing.JLabel jL_thoiGian;
    private javax.swing.JLabel jL_thongTinDaChon;
    private javax.swing.JLabel jL_thongTinHanhKhach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jT_CCCD;
    private javax.swing.JTextField jT_gia;
    private javax.swing.JTextField jT_hang;
    private javax.swing.JTextField jT_hoTen;
    private javax.swing.JTextField jT_soHieu;
    private javax.swing.JTextField jT_thoiGian;
    // End of variables declaration//GEN-END:variables
}
