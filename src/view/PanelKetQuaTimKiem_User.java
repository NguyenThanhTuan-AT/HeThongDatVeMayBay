package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelKetQuaTimKiem_User extends javax.swing.JPanel {

    public PanelKetQuaTimKiem_User() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_KetQua = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jB_chonCB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jB_quayLai = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jL_diaDiem = new javax.swing.JLabel();
        jL_thoiGian = new javax.swing.JLabel();
        jL_cacChuyenBay = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jTable_KetQua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Số hiệu CB", "Hãng", "TG đi", "TG đến", "Giá PT", "Giá TG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_KetQua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_KetQuaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_KetQua);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jB_chonCB.setText("Chọn chuyến bay");
        jB_chonCB.setEnabled(false);
        jB_chonCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_chonCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 211, 11, 219);
        jPanel3.add(jB_chonCB, gridBagConstraints);

        add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kết quả tìm kiếm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 406;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jB_quayLai.setText("<< Quay lại");
        jB_quayLai.setDefaultCapable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 22, 0, 0);
        jPanel2.add(jB_quayLai, gridBagConstraints);

        jL_diaDiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jL_thoiGian.setText("Ngày: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jL_thoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jL_diaDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jL_diaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jL_thoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 352;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel2.add(jPanel1, gridBagConstraints);

        jL_cacChuyenBay.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jL_cacChuyenBay.setText("Các chuyến bay");
        jL_cacChuyenBay.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 46, 0, 0);
        jPanel2.add(jL_cacChuyenBay, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_chonCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_chonCBActionPerformed
        // Lấy chỉ số hàng được chọn
        int selectedRow = jTable_KetQua.getSelectedRow();

        // Đảm bảo có hàng được chọn
        if (selectedRow != -1) {
            // Lấy dữ liệu của chuyến bay từ hàng đó
            String soHieuChuyenBay = (String) jTable_KetQua.getValueAt(selectedRow, 0);

            // TODO: Gọi phương thức để lấy đối tượng ChuyenBay từ lớp QuanLyChung
            // TODO: Mở màn hình đặt vé và truyền dữ liệu
        }
    }//GEN-LAST:event_jB_chonCBActionPerformed

    private void jTable_KetQuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_KetQuaMouseClicked
        // Kiểm tra xem có hàng nào được chọn không
        if (jTable_KetQua.getSelectedRow() != -1) {
            // Nếu có, kích hoạt nút "Chọn chuyến bay"
            jB_chonCB.setEnabled(true);
        } else {
            // Nếu không, vô hiệu hóa nút (khi người dùng nhấp ra ngoài bảng)
            jB_chonCB.setEnabled(false);
        }
    }//GEN-LAST:event_jTable_KetQuaMouseClicked

    public JButton getJbQuayLai() {
        return jB_quayLai;
    }

    public JButton getJbChonCB() {
        return jB_chonCB;
    }

    public JTable getJTable_KetQua() {
        return jTable_KetQua;
    }

    public JLabel getjL_thoiGian() {
        return jL_thoiGian;
    }

    public JLabel getjL_diaDiem() {
        return jL_diaDiem;
    }

    // Phương thức nạp dữ liệu vào bảng
    public void loadDataToTable(DefaultTableModel model) {
        jTable_KetQua.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_chonCB;
    private javax.swing.JButton jB_quayLai;
    private javax.swing.JLabel jL_cacChuyenBay;
    private javax.swing.JLabel jL_diaDiem;
    private javax.swing.JLabel jL_thoiGian;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_KetQua;
    // End of variables declaration//GEN-END:variables

    Object getjTable_KetQua() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
