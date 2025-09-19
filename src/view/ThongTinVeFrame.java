package view;

import javax.swing.JOptionPane;
import model.ChuyenBay;
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

        // Điền thông tin vé hiện tại vào form
        jT_maVe.setText(ve.getMaVe());
        jT_soHieuCB.setText(ve.getSoHieuChuyenBay());
        jComboBox_hangVe.setSelectedItem(ve.getHangVe() == VeMayBay.HangVe.PHO_THONG ? "Phổ thông" : "Thương gia");

        jT_maVe.setEditable(false);
        jT_soHieuCB.setEditable(false);
        jComboBox_hangVe.setEditable(false);

        setTitle("Chi Tiết Vé Của Bạn");
        this.setLocationRelativeTo(null);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chi tiết vé");

        jL_maVe.setText("Số hiệu chuyến bay:");

        jL_maVe1.setText("Mã vé:");

        jL_maVe2.setText("Hạng vé:");

        jT_maVe.setEditable(false);

        jT_soHieuCB.setEditable(false);
        jT_soHieuCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_soHieuCBActionPerformed(evt);
            }
        });

        jComboBox_hangVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phổ thông", "Thương gia" }));

        jB_Luu.setText("Ok");
        jB_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jL_maVe1)
                .addGap(12, 12, 12)
                .addComponent(jT_maVe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jB_Luu))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jL_maVe2)
                    .addGap(12, 12, 12)
                    .addComponent(jComboBox_hangVe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jL_maVe)
                    .addGap(12, 12, 12)
                    .addComponent(jT_soHieuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_maVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_maVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_maVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_soHieuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_maVe2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_hangVe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jB_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_soHieuCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_soHieuCBActionPerformed

    }//GEN-LAST:event_jT_soHieuCBActionPerformed

    private void jB_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LuuActionPerformed
        String hangVeMoiStr = (String) jComboBox_hangVe.getSelectedItem();
        VeMayBay.HangVe hangVeMoi = hangVeMoiStr.equals("Phổ thông") ? VeMayBay.HangVe.PHO_THONG : VeMayBay.HangVe.THUONG_GIA;
        if (hangVeMoi == veHienTai.getHangVe()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa thay đổi hạng vé.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ChuyenBay cb = quanLy.timChuyenBay(veHienTai.getSoHieuChuyenBay());
        if (cb == null) {
            JOptionPane.showMessageDialog(this, "Lỗi: Không tìm thấy thông tin chuyến bay tương ứng.", "Lỗi dữ liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!cb.conChoTrong(hangVeMoi)) {
            JOptionPane.showMessageDialog(this, "Hạng vé '" + hangVeMoiStr + "' đã hết chỗ. Vui lòng chọn lại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        veHienTai.setHangVe(hangVeMoi);
        quanLy.suaVe(veHienTai);
        JOptionPane.showMessageDialog(this, "Cập nhật vé thành công!");

        frameUser.hienThiVeCuaToi();

        this.dispose();
    }//GEN-LAST:event_jB_LuuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Luu;
    private javax.swing.JComboBox<String> jComboBox_hangVe;
    private javax.swing.JLabel jL_maVe;
    private javax.swing.JLabel jL_maVe1;
    private javax.swing.JLabel jL_maVe2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jT_maVe;
    private javax.swing.JTextField jT_soHieuCB;
    // End of variables declaration//GEN-END:variables
}
