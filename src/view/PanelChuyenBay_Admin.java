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
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.ChuyenBay;
import model.MayBay;
import model.QuanLyChung;

public class PanelChuyenBay_Admin extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    private TableRowSorter<DefaultTableModel> sorter;

    public PanelChuyenBay_Admin() {
        initComponents();
        tableModel = (DefaultTableModel) jTable_dsVeMayBay.getModel();
        ((java.awt.BorderLayout) this.getLayout()).setVgap(0);

        sorter = new TableRowSorter<>(tableModel);
        jTable_dsVeMayBay.setRowSorter(sorter);

        jT_timKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }
        });

        // Thêm sự kiện click chuột vào bảng để tự động điền dữ liệu
        jTable_dsVeMayBay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jTable_dsVeMayBay.getSelectedRow();
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dsVeMayBay = new javax.swing.JTable();
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
        jB_lamMoi = new javax.swing.JButton();
        jB_xoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jL_timKiem = new javax.swing.JLabel();
        jComboBox_tieuChi = new javax.swing.JComboBox<>();
        jT_timKiem = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jTable_dsVeMayBay.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable_dsVeMayBay);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jL_soHieuCB.setAlignment(java.awt.Label.RIGHT);
        jL_soHieuCB.setPreferredSize(new java.awt.Dimension(20, 22));
        jL_soHieuCB.setText("Số hiệu chuyến bay : ");

        jL_soHieuMB.setAlignment(java.awt.Label.RIGHT);
        jL_soHieuMB.setMinimumSize(new java.awt.Dimension(34, 20));
        jL_soHieuMB.setPreferredSize(new java.awt.Dimension(20, 20));
        jL_soHieuMB.setText("Số hiệu máy bay : ");

        jL_soGhePT.setAlignment(java.awt.Label.RIGHT);
        jL_soGhePT.setPreferredSize(new java.awt.Dimension(20, 20));
        jL_soGhePT.setText("Số ghế phổ thông : ");

        jL_diemDi.setAlignment(java.awt.Label.RIGHT);
        jL_diemDi.setPreferredSize(new java.awt.Dimension(44, 22));
        jL_diemDi.setText("Điểm đi : ");

        jL_diemDen.setAlignment(java.awt.Label.RIGHT);
        jL_diemDen.setPreferredSize(new java.awt.Dimension(54, 22));
        jL_diemDen.setText("Điểm đến : ");

        jL_soGheTG.setAlignment(java.awt.Label.RIGHT);
        jL_soGheTG.setText("Số ghế thương gia : ");

        jL_thoiGianDi.setAlignment(java.awt.Label.RIGHT);
        jL_thoiGianDi.setPreferredSize(new java.awt.Dimension(65, 22));
        jL_thoiGianDi.setText(" Thời gian đi : ");

        jL_thoiGianDen.setAlignment(java.awt.Label.RIGHT);
        jL_thoiGianDen.setText("Thời gian đến : ");

        jL_giaPT.setAlignment(java.awt.Label.RIGHT);
        jL_giaPT.setText("Giá : ");

        jL_giaTG.setAlignment(java.awt.Label.RIGHT);
        jL_giaTG.setText("Giá : ");

        jComboBox_soHieuCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_soHieuCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_soHieuCBActionPerformed(evt);
            }
        });

        jDateChooser1.setPreferredSize(new java.awt.Dimension(88, 30));

        jT_soHieuCB.setPreferredSize(new java.awt.Dimension(64, 30));

        jT_diemDi.setPreferredSize(new java.awt.Dimension(64, 30));

        jT_diemDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_diemDenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jL_soGhePT, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jT_soGhePT, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jL_giaPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_giaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_soGheTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jT_soGheTG, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jL_giaTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jT_giaTG, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jL_soHieuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_soHieuMB, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox_soHieuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jL_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jT_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jL_thoiGianDen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jT_soHieuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jL_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jT_diemDi, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jL_thoiGianDi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jT_soHieuCB, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jL_soHieuCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jL_diemDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jT_diemDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jL_thoiGianDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_soHieuMB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_soHieuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_diemDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_thoiGianDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_soGhePT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_soGhePT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_giaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_giaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_soGheTG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_soGheTG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_giaTG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_giaTG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jB_them.setText("Thêm");
        jB_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_themActionPerformed(evt);
            }
        });
        jPanel3.add(jB_them);

        jB_sua.setText("Sửa");
        jPanel3.add(jB_sua);

        jB_lamMoi.setText("Làm mới");
        jPanel3.add(jB_lamMoi);

        jB_xoa.setText("Xoá");
        jB_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_xoaActionPerformed(evt);
            }
        });
        jPanel3.add(jB_xoa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 572;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách chuyến bay");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 72, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jL_timKiem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_timKiem.setText("Tìm kiếm theo : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 88, 0, 0);
        jPanel1.add(jL_timKiem, gridBagConstraints);

        jComboBox_tieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Số hiệu chuyến bay", "Số hiệu máy bay", "Điểm đi", "Điểm đến" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -36;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(jComboBox_tieuChi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(jT_timKiem, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_soHieuCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_soHieuCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_soHieuCBActionPerformed

    private void jB_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_xoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_xoaActionPerformed

    private void jT_diemDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_diemDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_diemDenActionPerformed

    private void jB_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_themActionPerformed

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
        return jTable_dsVeMayBay;
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
        DefaultTableModel tableModel = (DefaultTableModel) jTable_dsVeMayBay.getModel();
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

            if (soGhePT <= 0 || soGheTG <= 0 || giaPT <= 0 || giaTG <= 0) {
                JOptionPane.showMessageDialog(this, "Số ghế và giá vé phải là số dương.", "Lỗi dữ liệu", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            if (tgDen.isBefore(tgDi)) {
                JOptionPane.showMessageDialog(this, "Thời gian đến phải sau thời gian đi.", "Lỗi logic thời gian", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            return new ChuyenBay(soHieuCB, soHieuMB, diemDi, diemDen, tgDi, tgDen, soGheTG, soGhePT, giaPT, giaTG);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số ghế và giá vé phải là các con số hợp lệ.", "Lỗi định dạng số", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) { // Giữ lại để bắt các lỗi khác nếu có
            JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra. Vui lòng kiểm tra lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // PHƯƠNG THỨC ĐIỀN DỮ LIỆU VÀO CÁC TRƯỜNG KHI CHỌN HÀNG TRÊN BẢNG
    public void fillFieldsFromTable(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) jTable_dsVeMayBay.getModel();
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

    private void filterTable() {
        String text = jT_timKiem.getText();
        String tieuChi = (String) jComboBox_tieuChi.getSelectedItem();

        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            int columnIndex = -1;
            switch (tieuChi) {
                case "Số hiệu CB":
                    columnIndex = 0;
                    break;
                case "Số hiệu MB":
                    columnIndex = 1;
                    break;
                case "Điểm đi":
                    columnIndex = 2;
                    break;
                case "Điểm đến":
                    columnIndex = 3;
                    break;
                default: // Trường hợp "Tất cả"
                    columnIndex = -1;
                    break;
            }

            if (columnIndex == -1) {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, columnIndex));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_lamMoi;
    private javax.swing.JButton jB_sua;
    private javax.swing.JButton jB_them;
    private javax.swing.JButton jB_xoa;
    private javax.swing.JComboBox<String> jComboBox_soHieuCB;
    private javax.swing.JComboBox<String> jComboBox_tieuChi;
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
    private javax.swing.JLabel jL_timKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_diemDen;
    private javax.swing.JTextField jT_diemDi;
    private javax.swing.JTextField jT_giaPT;
    private javax.swing.JTextField jT_giaTG;
    private javax.swing.JTextField jT_soGhePT;
    private javax.swing.JTextField jT_soGheTG;
    private javax.swing.JTextField jT_soHieuCB;
    private javax.swing.JTextField jT_timKiem;
    private javax.swing.JTable jTable_dsVeMayBay;
    // End of variables declaration//GEN-END:variables
}
