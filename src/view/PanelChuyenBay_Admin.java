package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.MayBay;
import model.QuanLyChung;

public class PanelChuyenBay_Admin extends javax.swing.JPanel {

    private DefaultTableModel tableModel;

    public PanelChuyenBay_Admin() {
        initComponents();
        tableModel = (DefaultTableModel) jT_dsVeMayBay.getModel();

        // Thêm sự kiện click chuột vào bảng để tự động điền dữ liệu
        jT_dsVeMayBay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jT_dsVeMayBay.getSelectedRow();
                if (selectedRow != -1) {
                    fillFieldsFromTable(selectedRow);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jL_soHieuCB = new java.awt.Label();
        jL_soHieuMB = new java.awt.Label();
        jL_soGhePT = new java.awt.Label();
        jL_diemDi = new java.awt.Label();
        jL_diemDen = new java.awt.Label();
        jL_soGheTG = new java.awt.Label();
        jL_thoiGianDi = new java.awt.Label();
        jL_thoiGianDen = new java.awt.Label();
        jL_giaPT = new java.awt.Label();
        jL_giaTG = new java.awt.Label();
        jComboBox_soHieuCB = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jT_soHieuCB = new javax.swing.JTextField();
        jT_diemDi = new javax.swing.JTextField();
        jT_diemDen = new javax.swing.JTextField();
        jT_soGhePT = new javax.swing.JTextField();
        jT_giaPT = new javax.swing.JTextField();
        jT_soGheTG = new javax.swing.JTextField();
        jT_giaTG = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jB_them = new javax.swing.JButton();
        jB_sua = new javax.swing.JButton();
        jB_xoa = new javax.swing.JButton();
        jB_lamMoi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_dsVeMayBay = new javax.swing.JTable();

        setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jL_soHieuCB.setPreferredSize(new java.awt.Dimension(20, 22));
        jL_soHieuCB.setText("Số hiệu chuyến bay");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel2.add(jL_soHieuCB, gridBagConstraints);

        jL_soHieuMB.setMinimumSize(new java.awt.Dimension(34, 20));
        jL_soHieuMB.setPreferredSize(new java.awt.Dimension(20, 20));
        jL_soHieuMB.setText("Số hiệu máy bay");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jL_soHieuMB, gridBagConstraints);

        jL_soGhePT.setPreferredSize(new java.awt.Dimension(20, 20));
        jL_soGhePT.setText("Số ghế phổ thông");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 7, 0);
        jPanel2.add(jL_soGhePT, gridBagConstraints);

        jL_diemDi.setPreferredSize(new java.awt.Dimension(44, 22));
        jL_diemDi.setText("Điểm đi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel2.add(jL_diemDi, gridBagConstraints);

        jL_diemDen.setPreferredSize(new java.awt.Dimension(54, 22));
        jL_diemDen.setText("Điểm đến");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jL_diemDen, gridBagConstraints);

        jL_soGheTG.setText("Số ghế thương gia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 23, 7, 0);
        jPanel2.add(jL_soGheTG, gridBagConstraints);

        jL_thoiGianDi.setPreferredSize(new java.awt.Dimension(65, 22));
        jL_thoiGianDi.setText("Thời gian đi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel2.add(jL_thoiGianDi, gridBagConstraints);

        jL_thoiGianDen.setText("Thời gian đến");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jL_thoiGianDen, gridBagConstraints);

        jL_giaPT.setText("Giá");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 7, 0);
        jPanel2.add(jL_giaPT, gridBagConstraints);

        jL_giaTG.setText("Giá");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 7, 0);
        jPanel2.add(jL_giaTG, gridBagConstraints);

        jComboBox_soHieuCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_soHieuCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_soHieuCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 1, 0, 0);
        jPanel2.add(jComboBox_soHieuCB, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 77);
        jPanel2.add(jDateChooser1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 77);
        jPanel2.add(jDateChooser3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 0, 0);
        jPanel2.add(jT_soHieuCB, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel2.add(jT_diemDi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jT_diemDen, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 7, 0);
        jPanel2.add(jT_soGhePT, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 7, 0);
        jPanel2.add(jT_giaPT, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 7, 0);
        jPanel2.add(jT_soGheTG, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 7, 0);
        jPanel2.add(jT_giaTG, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jB_them.setText("Thêm");
        jPanel3.add(jB_them);

        jB_sua.setText("Sửa");
        jPanel3.add(jB_sua);

        jB_xoa.setText("Xoá");
        jB_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_xoaActionPerformed(evt);
            }
        });
        jPanel3.add(jB_xoa);

        jB_lamMoi.setText("Làm mới");
        jPanel3.add(jB_lamMoi);

        jT_dsVeMayBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Số hiệu CB", "Số hiệu MB", "Điểm đi", "Điểm đến", "TG đi", "TG đến", "Số ghế PT", "Số ghế TG", "Giá PT", "Giá TG", "Số vé đã bán", "Số vé còn lại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jT_dsVeMayBay);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_soHieuCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_soHieuCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_soHieuCBActionPerformed

    private void jB_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_xoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_xoaActionPerformed

    public JButton getjB_them() {
        return jB_them;
    }

    public JButton getjB_sua() {
        return jB_sua;
    }

    public JButton getjB_xoa() {
        return jB_xoa;
    }

    public JButton getjB_lamMoi() {
        return jB_lamMoi;
    }

    public JTable getjTable_dsChuyenBay() {
        return jT_dsVeMayBay;
    }

    public JTextField getjT_soHieuCB() {
        return jT_soHieuCB;
    }

    public JTextField getjT_diemDi() {
        return jT_diemDi;
    }

    public JTextField getjT_diemDen() {
        return jT_diemDen;
    }

    public JTextField getjT_soGhePT() {
        return jT_soGhePT;
    }

    public JTextField getjT_soGheTG() {
        return jT_soGheTG;
    }

    public JTextField getjT_giaPT() {
        return jT_giaPT;
    }

    public JTextField getjT_giaTG() {
        return jT_giaTG;
    }

    public JComboBox<String> getjComboBox_soHieuMB() {
        return jComboBox_soHieuCB;
    }

    public com.toedter.calendar.JDateChooser getjDateChooser_tgDi() {
        return jDateChooser1;
    }

    public com.toedter.calendar.JDateChooser getjDateChooser_tgDen() {
        return jDateChooser3;
    }

    // PHƯƠNG THỨC NẠP DỮ LIỆU VÀO BẢNG
    public void loadDataToTable(Object[][] data) {
        DefaultTableModel tableModel = (DefaultTableModel) jT_dsVeMayBay.getModel();
        tableModel.setRowCount(0);
        for (Object[] row : data) {
            tableModel.addRow(row);
        }
    }

    // PHƯƠNG THỨC XÓA DỮ LIỆU TRÊN CÁC TRƯỜNG NHẬP LIỆU
    public void clearFields() {
        getjT_soHieuCB().setText("");
        getjT_diemDi().setText("");
        getjT_diemDen().setText("");
        getjT_soGhePT().setText("");
        getjT_soGheTG().setText("");
        getjT_giaPT().setText("");
        getjT_giaTG().setText("");
        getjDateChooser_tgDi().setDate(null);
        getjDateChooser_tgDen().setDate(null);
        getjComboBox_soHieuMB().setSelectedIndex(-1);

        getjT_soHieuCB().setEnabled(true);
        getjB_them().setEnabled(true);
        getjB_sua().setEnabled(false);
        getjB_xoa().setEnabled(false);
    }

    // PHƯƠNG THỨC LẤY DỮ LIỆU TỪ CÁC TRƯỜNG NHẬP LIỆU
    public ChuyenBay getDataFromFields() {
        try {
            String soHieuCB = getjT_soHieuCB().getText();
            String soHieuMB = (String) getjComboBox_soHieuMB().getSelectedItem();
            String diemDi = getjT_diemDi().getText();
            String diemDen = getjT_diemDen().getText();

            Date tgDiDate = getjDateChooser_tgDi().getDate();
            Date tgDenDate = getjDateChooser_tgDen().getDate();

            // Kiểm tra các trường bắt buộc
            if (soHieuCB.isEmpty() || soHieuMB == null || diemDi.isEmpty() || diemDen.isEmpty() || tgDiDate == null || tgDenDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ các thông tin bắt buộc.", "Thiếu thông tin", JOptionPane.WARNING_MESSAGE);
                return null;
            }

            LocalDateTime tgDi = tgDiDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            LocalDateTime tgDen = tgDenDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

            // Tách riêng phần parse số để bắt lỗi chính xác
            int soGhePT = Integer.parseInt(getjT_soGhePT().getText());
            int soGheTG = Integer.parseInt(getjT_soGheTG().getText());
            double giaPT = Double.parseDouble(getjT_giaPT().getText());
            double giaTG = Double.parseDouble(getjT_giaTG().getText());

            return new ChuyenBay(soHieuCB, soHieuMB, diemDi, diemDen, tgDi, tgDen, soGheTG, soGhePT, giaPT, giaTG);

        } catch (NumberFormatException e) { // <-- SỬA Ở ĐÂY: Bắt lỗi nhập sai định dạng số
            JOptionPane.showMessageDialog(this, "Số ghế và giá vé phải là các con số hợp lệ.", "Lỗi định dạng số", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) { // Giữ lại để bắt các lỗi khác nếu có
            JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra. Vui lòng kiểm tra lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // PHƯƠNG THỨC ĐIỀN DỮ LIỆU VÀO CÁC TRƯỜNG KHI CHỌN HÀNG TRÊN BẢNG
    public void fillFieldsFromTable(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) jT_dsVeMayBay.getModel();
        getjT_soHieuCB().setText(model.getValueAt(rowIndex, 0).toString());
        getjComboBox_soHieuMB().setSelectedItem(model.getValueAt(rowIndex, 1).toString());
        getjT_diemDi().setText(model.getValueAt(rowIndex, 2).toString());
        getjT_diemDen().setText(model.getValueAt(rowIndex, 3).toString());

        LocalDateTime tgDi = (LocalDateTime) model.getValueAt(rowIndex, 4);
        LocalDateTime tgDen = (LocalDateTime) model.getValueAt(rowIndex, 5);
        getjDateChooser_tgDi().setDate(Date.from(tgDi.atZone(ZoneId.systemDefault()).toInstant()));
        getjDateChooser_tgDen().setDate(Date.from(tgDen.atZone(ZoneId.systemDefault()).toInstant()));

        getjT_soGhePT().setText(model.getValueAt(rowIndex, 6).toString());
        getjT_soGheTG().setText(model.getValueAt(rowIndex, 7).toString());
        getjT_giaPT().setText(model.getValueAt(rowIndex, 8).toString());
        getjT_giaTG().setText(model.getValueAt(rowIndex, 9).toString());

        getjT_soHieuCB().setEnabled(false);
        getjB_them().setEnabled(false);
        getjB_sua().setEnabled(true);
        getjB_xoa().setEnabled(true);
    }

    // PHƯƠNG THỨC NẠP SỐ HIỆU MÁY BAY VÀO JCOMBOBOX
    public void loadSoHieuMayBay(QuanLyChung quanLy) {
        List<String> soHieuMayBay = quanLy.getDanhSachMayBay().stream().map(MayBay::getSoHieuMayBay).collect(Collectors.toList());
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(soHieuMayBay.toArray(new String[0]));
        jComboBox_soHieuCB.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_lamMoi;
    private javax.swing.JButton jB_sua;
    private javax.swing.JButton jB_them;
    private javax.swing.JButton jB_xoa;
    private javax.swing.JComboBox<String> jComboBox_soHieuCB;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private java.awt.Label jL_diemDen;
    private java.awt.Label jL_diemDi;
    private java.awt.Label jL_giaPT;
    private java.awt.Label jL_giaTG;
    private java.awt.Label jL_soGhePT;
    private java.awt.Label jL_soGheTG;
    private java.awt.Label jL_soHieuCB;
    private java.awt.Label jL_soHieuMB;
    private java.awt.Label jL_thoiGianDen;
    private java.awt.Label jL_thoiGianDi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_diemDen;
    private javax.swing.JTextField jT_diemDi;
    private javax.swing.JTable jT_dsVeMayBay;
    private javax.swing.JTextField jT_giaPT;
    private javax.swing.JTextField jT_giaTG;
    private javax.swing.JTextField jT_soGhePT;
    private javax.swing.JTextField jT_soGheTG;
    private javax.swing.JTextField jT_soHieuCB;
    // End of variables declaration//GEN-END:variables
}
