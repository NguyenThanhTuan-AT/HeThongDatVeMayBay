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

        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jL_diemDi = new javax.swing.JLabel();
        jT_diemDi = new javax.swing.JTextField();
        jL_diemDen = new javax.swing.JLabel();
        jT_diemDen = new javax.swing.JTextField();
        jL_ngayDi = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jL_soGhe = new javax.swing.JLabel();
        jSpinner_soVe = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jB_timKiem = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tìm kiếm chuyến bay");
        add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jL_diemDi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_diemDi.setText("Điểm đi : ");
        jL_diemDi.setPreferredSize(new java.awt.Dimension(41, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 48, 0, 0);
        jPanel4.add(jL_diemDi, gridBagConstraints);

        jT_diemDi.setPreferredSize(new java.awt.Dimension(140, 30));
        jT_diemDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_diemDiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 0, 0, 0);
        jPanel4.add(jT_diemDi, gridBagConstraints);

        jL_diemDen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_diemDen.setText("Điểm đến : ");
        jL_diemDen.setPreferredSize(new java.awt.Dimension(60, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 20, 0, 0);
        jPanel4.add(jL_diemDen, gridBagConstraints);

        jT_diemDen.setPreferredSize(new java.awt.Dimension(140, 30));
        jT_diemDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_diemDenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 0, 0, 41);
        jPanel4.add(jT_diemDen, gridBagConstraints);

        jL_ngayDi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_ngayDi.setText("Ngày đi : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 48, 0, 0);
        jPanel4.add(jL_ngayDi, gridBagConstraints);

        jDateChooser1.setPreferredSize(new java.awt.Dimension(140, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(jDateChooser1, gridBagConstraints);

        jL_soGhe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_soGhe.setText("Số lượng vé: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 40, 0);
        jPanel4.add(jL_soGhe, gridBagConstraints);

        jSpinner_soVe.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinner_soVe.setPreferredSize(new java.awt.Dimension(64, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 40, 0);
        jPanel4.add(jSpinner_soVe, gridBagConstraints);

        add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jB_timKiem.setText("Tìm kiếm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 225, 6, 225);
        jPanel1.add(jB_timKiem, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jT_diemDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_diemDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_diemDenActionPerformed

    private void jT_diemDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_diemDiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_diemDiActionPerformed

    public JTextField getjT_diemDi() {
        return jT_diemDi;
    }

    public JTextField getjT_diemDen() {
        return jT_diemDen;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public JSpinner getjSpinner_soVe() {
        return jSpinner_soVe;
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
        getjSpinner_soVe().setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_timKiem;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jL_diemDen;
    private javax.swing.JLabel jL_diemDi;
    private javax.swing.JLabel jL_ngayDi;
    private javax.swing.JLabel jL_soGhe;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner_soVe;
    private javax.swing.JTextField jT_diemDen;
    private javax.swing.JTextField jT_diemDi;
    // End of variables declaration//GEN-END:variables
}
