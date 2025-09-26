package view;

import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import model.ChuyenBay;
import model.QuanLyChung;
import util.AutoComplete;

public class PanelTimKiem_User extends javax.swing.JPanel {

    public PanelTimKiem_User(QuanLyChung quanLy) {
        initComponents();
        List<String> danhSachDiaDiem = quanLy.getDanhSachDiaDiem();

        // Kích hoạt auto-complete cho ô "Điểm đi"
        new AutoComplete(jT_diemDi, danhSachDiaDiem);

        // Kích hoạt auto-complete cho ô "Điểm đến"
        new AutoComplete(jT_diemDen, danhSachDiaDiem);
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
        jDateChooser_timKiemNgay = new com.toedter.calendar.JDateChooser();
        jL_soGhe = new javax.swing.JLabel();
        jSpinner_soVe = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSpinner_gioDi = new javax.swing.JSpinner();
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
        gridBagConstraints.insets = new java.awt.Insets(37, 38, 0, 0);
        jPanel4.add(jL_diemDi, gridBagConstraints);

        jT_diemDi.setPreferredSize(new java.awt.Dimension(140, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 86;
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
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 10, 0, 0);
        jPanel4.add(jL_diemDen, gridBagConstraints);

        jT_diemDen.setPreferredSize(new java.awt.Dimension(140, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 0, 0, 53);
        jPanel4.add(jT_diemDen, gridBagConstraints);

        jL_ngayDi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_ngayDi.setText("Ngày đi : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 38, 0, 0);
        jPanel4.add(jL_ngayDi, gridBagConstraints);

        jDateChooser_timKiemNgay.setDateFormatString("EEEE, dd MMM yyyy");
        jDateChooser_timKiemNgay.setPreferredSize(new java.awt.Dimension(155, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(jDateChooser_timKiemNgay, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 40, 0);
        jPanel4.add(jSpinner_soVe, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Giờ khởi hành : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 15, 0, 0);
        jPanel4.add(jLabel1, gridBagConstraints);

        jSpinner_gioDi.setModel(new javax.swing.SpinnerNumberModel(8, 0, 23, 1));
        jSpinner_gioDi.setPreferredSize(new java.awt.Dimension(140, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 53);
        jPanel4.add(jSpinner_gioDi, gridBagConstraints);

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

    public JTextField getjT_diemDi() {
        return jT_diemDi;
    }

    public JTextField getjT_diemDen() {
        return jT_diemDen;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser_timKiemNgay;
    }

    public JSpinner getjSpinner_soVe() {
        return jSpinner_soVe;
    }

    public JButton getjB_timKiem() {
        return jB_timKiem;
    }

    public javax.swing.JSpinner getjSpinner_gioDi() {
        return jSpinner_gioDi;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_timKiem;
    private com.toedter.calendar.JDateChooser jDateChooser_timKiemNgay;
    private javax.swing.JLabel jL_diemDen;
    private javax.swing.JLabel jL_diemDi;
    private javax.swing.JLabel jL_ngayDi;
    private javax.swing.JLabel jL_soGhe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner_gioDi;
    private javax.swing.JSpinner jSpinner_soVe;
    private javax.swing.JTextField jT_diemDen;
    private javax.swing.JTextField jT_diemDi;
    // End of variables declaration//GEN-END:variables
}
