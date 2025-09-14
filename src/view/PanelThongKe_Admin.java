package view;

import java.time.LocalDate;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.HangHangKhong;
import model.QuanLyChung;

public class PanelThongKe_Admin extends javax.swing.JPanel {

    public PanelThongKe_Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jL_thang = new javax.swing.JLabel();
        jComboBox_thang = new javax.swing.JComboBox<>();
        jL_nam = new javax.swing.JLabel();
        jComboBox_nam = new javax.swing.JComboBox<>();
        jL_hang = new javax.swing.JLabel();
        jComboBox_hang = new javax.swing.JComboBox<>();
        jB_thongKe = new javax.swing.JButton();
        jL_tongDoanTh = new javax.swing.JLabel();
        jT_tongDoanhThu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 700));
        setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hãng", "Doanh thu"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jL_thang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_thang.setText("Tháng : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 114, 0, 0);
        jPanel2.add(jL_thang, gridBagConstraints);

        jComboBox_thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel2.add(jComboBox_thang, gridBagConstraints);

        jL_nam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_nam.setText("Năm : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel2.add(jL_nam, gridBagConstraints);

        jComboBox_nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_namActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 165);
        jPanel2.add(jComboBox_nam, gridBagConstraints);

        jL_hang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hang.setText("Hãng hàng không : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 9, 0, 0);
        jPanel2.add(jL_hang, gridBagConstraints);

        jComboBox_hang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_hang, gridBagConstraints);

        jB_thongKe.setText("Thống kê");
        jB_thongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_thongKeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 0, 0);
        jPanel2.add(jB_thongKe, gridBagConstraints);

        jL_tongDoanTh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_tongDoanTh.setText("Tổng doanh thu của tháng : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 148, 0, 0);
        jPanel2.add(jL_tongDoanTh, gridBagConstraints);

        jT_tongDoanhThu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jT_tongDoanhThu.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jT_tongDoanhThu, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Kết quả thống kê doanh thu");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 42, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_namActionPerformed

    private void jB_thongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_thongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_thongKeActionPerformed

    public JButton getjB_thongKe() {
        return jB_thongKe;
    }

    public JComboBox<String> getjComboBox_hang() {
        return jComboBox_hang;
    }

    public JComboBox<String> getjComboBox_nam() {
        return jComboBox_nam;
    }

    public JComboBox<String> getjComboBox_thang() {
        return jComboBox_thang;
    }

    public JTable getjTable() {
        return jTable1;
    }

    public JTextField getjT_tongDoanhThu() {
        return jT_tongDoanhThu;
    }

    // Phương thức nạp dữ liệu cho các JComboBox
    public void loadComboBoxes(QuanLyChung quanLy) {
        getjComboBox_thang().removeAllItems();
        for (int i = 1; i <= 12; i++) {
            getjComboBox_thang().addItem(String.valueOf(i));
        }

        getjComboBox_nam().removeAllItems();
        int currentYear = LocalDate.now().getYear();
        for (int i = currentYear - 5; i <= currentYear + 5; i++) {
            getjComboBox_nam().addItem(String.valueOf(i));
        }

        getjComboBox_hang().removeAllItems();
        getjComboBox_hang().addItem("Tất cả các hãng");
        for (HangHangKhong hhk : quanLy.getDanhSachHang()) {
            getjComboBox_hang().addItem(hhk.getMaHang() + " - " + hhk.getTenHang());
        }
    }

    // Phương thức thực hiện thống kê doanh thu
    public void thongKeDoanhThu(QuanLyChung quanLy) {
        try {
            int thang = Integer.parseInt(getjComboBox_thang().getSelectedItem().toString());
            int nam = Integer.parseInt(getjComboBox_nam().getSelectedItem().toString());
            String selectedHang = getjComboBox_hang().getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) getjTable().getModel();
            model.setRowCount(0);

            if (selectedHang.equals("Tất cả các hãng")) {
                double tongDoanhThu = quanLy.thongKeDoanhThuTheoThang(thang, nam);
                getjT_tongDoanhThu().setText(String.format("%,.0f VNĐ", tongDoanhThu));

                Map<String, Double> doanhThuMoiHang = quanLy.thongKeDoanhThuTheoTungHang(thang, nam);
                for (Map.Entry<String, Double> entry : doanhThuMoiHang.entrySet()) {
                    model.addRow(new Object[]{entry.getKey(), String.format("%,.0f VNĐ", entry.getValue())});
                }
            } else {
                String maHang = selectedHang.split(" - ")[0];
                double doanhThu = quanLy.thongKeDoanhThuTheoHang(maHang, thang, nam);
                getjT_tongDoanhThu().setText(String.format("%,.0f VNĐ", doanhThu));

                model.addRow(new Object[]{maHang, String.format("%,.0f VNĐ", doanhThu)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tháng, năm và hãng hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_thongKe;
    private javax.swing.JComboBox<String> jComboBox_hang;
    private javax.swing.JComboBox<String> jComboBox_nam;
    private javax.swing.JComboBox<String> jComboBox_thang;
    private javax.swing.JLabel jL_hang;
    private javax.swing.JLabel jL_nam;
    private javax.swing.JLabel jL_thang;
    private javax.swing.JLabel jL_tongDoanTh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_tongDoanhThu;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
