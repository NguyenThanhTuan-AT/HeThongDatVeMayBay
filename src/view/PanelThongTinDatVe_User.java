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
        jComboBox_hangVe.addActionListener(e -> capNhatGiaVe());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_thongTinDaChon = new javax.swing.JLabel();
        jL_soHieu = new javax.swing.JLabel();
        jL_hang = new javax.swing.JLabel();
        jL_thoiGian = new javax.swing.JLabel();
        jT_soHieu = new javax.swing.JTextField();
        jT_hang = new javax.swing.JTextField();
        jT_thoiGian = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jL_giá = new javax.swing.JLabel();
        jComboBox_hangVe = new javax.swing.JComboBox<>();
        jT_gia = new javax.swing.JTextField();
        jL_thongTinHanhKhach = new javax.swing.JLabel();
        jL_hoTen = new javax.swing.JLabel();
        jT_hoTen = new javax.swing.JTextField();
        jL_CCCD = new javax.swing.JLabel();
        jT_CCCD = new javax.swing.JTextField();
        jB_quayLai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jB_xacNhan = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jL_thongTinDaChon.setText("Thông tin chuyến bay đã chọn");

        jL_soHieu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_soHieu.setText("-   Số hiệu :  ");

        jL_hang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hang.setText("-   Hãng :  ");

        jL_thoiGian.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_thoiGian.setText("-   Thời gian :  ");

        jT_soHieu.setEditable(false);
        jT_soHieu.setToolTipText("");
        jT_soHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_soHieuActionPerformed(evt);
            }
        });

        jT_hang.setEditable(false);

        jT_thoiGian.setEditable(false);

        jLabel1.setText("Lựa chọn hạng vé");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Hạng vé : ");

        jL_giá.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_giá.setText("Giá : ");

        jComboBox_hangVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phổ thông", "Thương gia" }));
        jComboBox_hangVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_hangVeActionPerformed(evt);
            }
        });

        jT_gia.setEditable(false);

        jL_thongTinHanhKhach.setText("Thông tin hành khách");

        jL_hoTen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hoTen.setText("Họ tên :  ");

        jT_hoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_hoTenActionPerformed(evt);
            }
        });

        jL_CCCD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_CCCD.setText("CCCD :  ");

        jB_quayLai.setText("<< Quay lại");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jL_thongTinDaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jL_thongTinHanhKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 42, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jL_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jL_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jT_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jT_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jL_thoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jL_hang, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jL_soHieu, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jL_giá, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jT_hang, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addComponent(jT_thoiGian)
                                .addComponent(jT_soHieu)
                                .addComponent(jComboBox_hangVe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jT_gia))))
                    .addComponent(jB_quayLai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jB_quayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jL_thongTinDaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_soHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_soHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_hang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_hang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jT_thoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jL_thoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_hangVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_giá, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jT_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jL_thongTinHanhKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông tin đặt vé");
        add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jB_xacNhan.setText("Xác nhận");
        jB_xacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_xacNhanActionPerformed(evt);
            }
        });
        jPanel2.add(jB_xacNhan, new java.awt.GridBagConstraints());

        add(jPanel2, java.awt.BorderLayout.PAGE_END);
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

            String gioDi = cb.getThoiGianDi().format(util.DateTimeUtil.TIME_FORMATTER);
            String gioDen = cb.getThoiGianDen().format(util.DateTimeUtil.TIME_FORMATTER);
            String ngayDi = cb.getThoiGianDi().format(util.DateTimeUtil.DATE_FORMATTER);

            String thoiGianDisplay = gioDi + " → " + gioDen + " (" + ngayDi + ")";

            jT_thoiGian.setText(thoiGianDisplay);
            // Cập nhật giá vé mặc định là Phổ thông
            jComboBox_hangVe.setSelectedIndex(0);
            jT_gia.setText(String.format("%,.0f VNĐ", cb.getGiaPhoThong()));
        }
    }

    private void jT_soHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_soHieuActionPerformed

    }//GEN-LAST:event_jT_soHieuActionPerformed

    private void jComboBox_hangVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_hangVeActionPerformed

    }//GEN-LAST:event_jComboBox_hangVeActionPerformed

    private void jT_hoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_hoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_hoTenActionPerformed

    private void jB_xacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_xacNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_xacNhanActionPerformed

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
    private javax.swing.JTextField jT_CCCD;
    private javax.swing.JTextField jT_gia;
    private javax.swing.JTextField jT_hang;
    private javax.swing.JTextField jT_hoTen;
    private javax.swing.JTextField jT_soHieu;
    private javax.swing.JTextField jT_thoiGian;
    // End of variables declaration//GEN-END:variables
}
