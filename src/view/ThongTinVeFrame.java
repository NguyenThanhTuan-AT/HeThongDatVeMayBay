package view;

import model.ChuyenBay;
import model.HanhKhach;
import model.QuanLyChung;
import model.VeMayBay;

public class ThongTinVeFrame extends javax.swing.JFrame {

    private QuanLyChung quanLy;
    private VeMayBay veHienTai;
    private Frame_User frameUser;

    public ThongTinVeFrame(QuanLyChung quanLy, VeMayBay ve, Frame_User frameUser) {
        this.quanLy = quanLy;
        this.veHienTai = ve;
        this.frameUser = frameUser;
        initComponents();
        setTitle("Chi Tiết Vé");

        // Lấy các đối tượng liên quan để có đủ thông tin
        ChuyenBay cb = quanLy.timChuyenBay(ve.getSoHieuChuyenBay());
        HanhKhach hk = quanLy.timHanhKhach(ve.getCccdHanhKhach());

        // --- Điền thông tin vé ---
        jT_maVe.setText(ve.getMaVe());
        jComboBox_hangVe.setSelectedItem(ve.getHangVe() == VeMayBay.HangVe.PHO_THONG ? "Phổ thông" : "Thương gia");

        // --- Điền thông tin chuyến bay ---
        if (cb != null) {
            jT_soHieuCB.setText(cb.getSoHieuChuyenBay());
            jT_diemDi.setText(cb.getDiemDi());
            jT_diemDen.setText(cb.getDiemDen());
            jT_tgDi.setText(cb.getThoiGianDi().toString());
            jT_tgDen.setText(cb.getThoiGianDen().toString());

            // Tính và hiển thị giá vé
            double giaVe = (ve.getHangVe() == VeMayBay.HangVe.THUONG_GIA) ? cb.getGiaThuongGia() : cb.getGiaPhoThong();
            jT_giaVe.setText(String.format("%,.0f VNĐ", giaVe));
        }

        // --- Điền thông tin hành khách ---
        if (hk != null) {
            jT_hoTen.setText(hk.getHoTen());
            jT_soCCCD.setText(hk.getCccd());
        }

        // Vô hiệu hóa các thành phần, vì đây là màn hình xem chi tiết
        jComboBox_hangVe.setEnabled(false);

        this.setLocationRelativeTo(frameUser);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jL_maVe = new javax.swing.JLabel();
        jL_maVe1 = new javax.swing.JLabel();
        jL_maVe2 = new javax.swing.JLabel();
        jT_maVe = new javax.swing.JTextField();
        jT_soHieuCB = new javax.swing.JTextField();
        jComboBox_hangVe = new javax.swing.JComboBox<>();
        jB_Luu = new javax.swing.JButton();
        jL_hoTen = new javax.swing.JLabel();
        jT_hoTen = new javax.swing.JTextField();
        jL_soCCCD = new javax.swing.JLabel();
        jT_soCCCD = new javax.swing.JTextField();
        jL_diemDi = new javax.swing.JLabel();
        jT_diemDi = new javax.swing.JTextField();
        jL_diemDen = new javax.swing.JLabel();
        jT_diemDen = new javax.swing.JTextField();
        jL_tgDi = new javax.swing.JLabel();
        jT_tgDi = new javax.swing.JTextField();
        jL_tgDen = new javax.swing.JLabel();
        jT_tgDen = new javax.swing.JTextField();
        jL_giaVe = new javax.swing.JLabel();
        jT_giaVe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chi tiết vé");

        jL_maVe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maVe.setText("Số hiệu chuyến bay : ");

        jL_maVe1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maVe1.setText("Mã vé : ");

        jL_maVe2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maVe2.setText("Hạng vé : ");

        jT_maVe.setEditable(false);

        jT_soHieuCB.setEditable(false);

        jComboBox_hangVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phổ thông", "Thương gia" }));

        jB_Luu.setText("Ok");
        jB_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LuuActionPerformed(evt);
            }
        });

        jL_hoTen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hoTen.setText("Họ tên : ");

        jT_hoTen.setEditable(false);

        jL_soCCCD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_soCCCD.setText("Số CCCD : ");

        jT_soCCCD.setEditable(false);

        jL_diemDi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_diemDi.setText("Điểm đi : ");

        jT_diemDi.setEditable(false);

        jL_diemDen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_diemDen.setText("Điểm đến : ");

        jT_diemDen.setEditable(false);

        jL_tgDi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_tgDi.setText("Thời gian đi : ");

        jT_tgDi.setEditable(false);

        jL_tgDen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_tgDen.setText("Thời gian đến : ");

        jT_tgDen.setEditable(false);

        jL_giaVe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_giaVe.setText("Giá vé : ");

        jT_giaVe.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_soCCCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_diemDi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_maVe1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_tgDi)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jL_hoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jL_maVe)
                            .addComponent(jL_maVe2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jT_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_tgDi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_maVe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_soHieuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_hangVe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jL_giaVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_tgDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_diemDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jT_giaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jT_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_tgDen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jB_Luu)
                .addGap(308, 308, 308))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jT_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_tgDi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jT_tgDi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_tgDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_tgDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_maVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_maVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_giaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_giaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_maVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_soHieuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_hangVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_maVe2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LuuActionPerformed
        this.dispose();
    }//GEN-LAST:event_jB_LuuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Luu;
    private javax.swing.JComboBox<String> jComboBox_hangVe;
    private javax.swing.JLabel jL_diemDen;
    private javax.swing.JLabel jL_diemDi;
    private javax.swing.JLabel jL_giaVe;
    private javax.swing.JLabel jL_hoTen;
    private javax.swing.JLabel jL_maVe;
    private javax.swing.JLabel jL_maVe1;
    private javax.swing.JLabel jL_maVe2;
    private javax.swing.JLabel jL_soCCCD;
    private javax.swing.JLabel jL_tgDen;
    private javax.swing.JLabel jL_tgDi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jT_diemDen;
    private javax.swing.JTextField jT_diemDi;
    private javax.swing.JTextField jT_giaVe;
    private javax.swing.JTextField jT_hoTen;
    private javax.swing.JTextField jT_maVe;
    private javax.swing.JTextField jT_soCCCD;
    private javax.swing.JTextField jT_soHieuCB;
    private javax.swing.JTextField jT_tgDen;
    private javax.swing.JTextField jT_tgDi;
    // End of variables declaration//GEN-END:variables
}
