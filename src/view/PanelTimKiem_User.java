package view;

import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import model.ChuyenBay;

public class PanelTimKiem_User extends javax.swing.JPanel {

    public PanelTimKiem_User() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jL_diemDi = new javax.swing.JLabel();
        jT_diemDi = new javax.swing.JTextField();
        jL_diemDen = new javax.swing.JLabel();
        jT_diemDen = new javax.swing.JTextField();
        jL_ngayDi = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jL_soGhe = new javax.swing.JLabel();
        jSpinner_soGhe = new javax.swing.JSpinner();
        jB_timKiem = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tìm kiếm chuyến bay");

        jL_diemDi.setText("Điểm đi");

        jL_diemDen.setText("Điểm đến");

        jT_diemDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_diemDenActionPerformed(evt);
            }
        });

        jL_ngayDi.setText("Ngày đi");

        jL_soGhe.setText("Số ghế");

        jB_timKiem.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jL_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jT_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jL_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jT_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jL_ngayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jL_soGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSpinner_soGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jB_timKiem))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_ngayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_soGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_soGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jB_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        add(jPanel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jT_diemDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_diemDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_diemDenActionPerformed

    public JTextField getjT_diemDi() {
        return jT_diemDi;
    }

    public JTextField getjT_diemDen() {
        return jT_diemDen;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public JSpinner getjSpinner_soGhe() {
        return jSpinner_soGhe;
    }

    public JButton getjB_timKiem() {
        return jB_timKiem;
    }

    // Phương thức lấy dữ liệu từ các trường tìm kiếm
    public ChuyenBay getDataFromFields() {
        try {
            String diemDi = getjT_diemDi().getText();
            String diemDen = getjT_diemDen().getText();
            Date ngayDiDate = getjDateChooser1().getDate();

            if (diemDi.isEmpty() || diemDen.isEmpty() || ngayDiDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin tìm kiếm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            LocalDate ngayDi = ngayDiDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            // Bạn có thể xử lý soGhe nếu cần

            // Trả về một đối tượng tạm thời để chuyển dữ liệu tìm kiếm
            return new ChuyenBay(null, null, diemDi, diemDen, ngayDi.atStartOfDay(), null, 0, 0, 0, 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // Phương thức xóa các trường tìm kiếm
    public void clearFields() {
        getjT_diemDi().setText("");
        getjT_diemDen().setText("");
        getjDateChooser1().setDate(null);
        getjSpinner_soGhe().setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_timKiem;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jL_diemDen;
    private javax.swing.JLabel jL_diemDi;
    private javax.swing.JLabel jL_ngayDi;
    private javax.swing.JLabel jL_soGhe;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner_soGhe;
    private javax.swing.JTextField jT_diemDen;
    private javax.swing.JTextField jT_diemDi;
    // End of variables declaration//GEN-END:variables
}
