package view;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.QuanLyChung;
import model.VeMayBay;

public class PanelVeCuaToi_User extends javax.swing.JPanel {

    private DefaultTableModel tableModel;

    public PanelVeCuaToi_User() {
        initComponents();

        tableModel = (DefaultTableModel) jTable_dsVe.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_dsVe = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jB_suaVe = new javax.swing.JButton();
        jB_xoaVe = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTable_dsVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã vé", "Số hiệu CB", "Hạng vé", "Ngày đi", "Giá vé"
            }
        ));
        jScrollPane2.setViewportView(jTable_dsVe);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh sách vé của tôi");
        add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jB_suaVe.setText("Sửa vé ");
        jB_suaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_suaVeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 174, 0, 0);
        jPanel2.add(jB_suaVe, gridBagConstraints);

        jB_xoaVe.setText("Xoá vé");
        jB_xoaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_xoaVeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 174);
        jPanel2.add(jB_xoaVe, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_xoaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_xoaVeActionPerformed

    }//GEN-LAST:event_jB_xoaVeActionPerformed

    private void jB_suaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_suaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_suaVeActionPerformed

    public JTable getJTable() {
        return jTable_dsVe;
    }

    public JButton getjB_suaVe() {
        return jB_suaVe;
    }

    public JButton getjB_xoaVe() {
        return jB_xoaVe;
    }

    public void loadDataToTable(QuanLyChung quanLy, String cccd) {
        tableModel.setRowCount(0);
        for (VeMayBay ve : quanLy.timVeTheoCccd(cccd)) {
            ChuyenBay cb = quanLy.timChuyenBay(ve.getSoHieuChuyenBay());
            double giaVe = 0;
            if (cb != null) {
                giaVe = (ve.getHangVe() == VeMayBay.HangVe.THUONG_GIA) ? cb.getGiaThuongGia() : cb.getGiaPhoThong();
            }

            Object[] row = new Object[]{
                ve.getMaVe(),
                ve.getSoHieuChuyenBay(),
                ve.getHangVe().toString(),
                cb != null ? cb.getThoiGianDi().toLocalDate() : "N/A",
                String.format("%,.0f VNĐ", giaVe)
            };
            tableModel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_suaVe;
    private javax.swing.JButton jB_xoaVe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_dsVe;
    // End of variables declaration//GEN-END:variables
}
