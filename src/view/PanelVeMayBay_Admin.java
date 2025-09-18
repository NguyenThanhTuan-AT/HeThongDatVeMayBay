package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import model.HanhKhach;
import model.QuanLyChung;
import model.VeMayBay;

public class PanelVeMayBay_Admin extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    private QuanLyChung quanLy;
    private TableRowSorter<DefaultTableModel> sorter;

    public PanelVeMayBay_Admin() {
        initComponents();
        tableModel = (DefaultTableModel) jTable_dsVeMayBay.getModel();

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

        jTable_dsVeMayBay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jTable_dsVeMayBay.getSelectedRow();
                if (selectedRow != -1) {
                    fillFieldsFromTable(selectedRow);
                }
            }
        });

        jComboBox_hangVe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                capNhatGiaVe();
            }
        });

        // Thêm sự kiện lắng nghe cho ComboBox chuyến bay
        jComboBox_soHieuCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                capNhatGiaVe();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dsVeMayBay = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jT_maVe = new javax.swing.JTextField();
        jL_hangVe = new javax.swing.JLabel();
        jComboBox_hangVe = new javax.swing.JComboBox<>();
        jL_chuyenBay = new javax.swing.JLabel();
        jComboBox_soHieuCB = new javax.swing.JComboBox<>();
        jL_maVe = new javax.swing.JLabel();
        jL_giaVe = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jT_giaVe = new javax.swing.JTextField();
        jL_timKiem = new javax.swing.JLabel();
        jComboBox_tieuChi = new javax.swing.JComboBox<>();
        jT_timKiem = new javax.swing.JTextField();
        jPanel_South = new javax.swing.JPanel();
        jB_dau = new javax.swing.JButton();
        jB_truoc = new javax.swing.JButton();
        jL_trang = new javax.swing.JLabel();
        jB_sau = new javax.swing.JButton();
        jB_cuoi = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTable_dsVeMayBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã vé", "Số hiệu chuyến bay", "Hạng vé", "Giá vé"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_dsVeMayBay);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jT_maVe.setPreferredSize(new java.awt.Dimension(69, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jT_maVe, gridBagConstraints);

        jL_hangVe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hangVe.setText("Hạng vé : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 145, 0, 0);
        jPanel2.add(jL_hangVe, gridBagConstraints);

        jComboBox_hangVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phổ thông", "Thương gia", " " }));
        jComboBox_hangVe.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_hangVe, gridBagConstraints);

        jL_chuyenBay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_chuyenBay.setText("Chuyến bay : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 145, 0, 0);
        jPanel2.add(jL_chuyenBay, gridBagConstraints);

        jComboBox_soHieuCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_soHieuCB.setMinimumSize(new java.awt.Dimension(200, 22));
        jComboBox_soHieuCB.setPreferredSize(new java.awt.Dimension(165, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_soHieuCB, gridBagConstraints);

        jL_maVe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maVe.setText("Mã vé : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 148, 0, 0);
        jPanel2.add(jL_maVe, gridBagConstraints);

        jL_giaVe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_giaVe.setText("Giá vé : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 145, 0, 0);
        jPanel2.add(jL_giaVe, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton1.setText("Sửa");
        jPanel3.add(jButton1);

        jButton3.setText("Xoá");
        jPanel3.add(jButton3);

        jButton4.setText("Làm mới");
        jPanel3.add(jButton4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.ipadx = 247;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách vé máy bay");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jT_giaVe.setPreferredSize(new java.awt.Dimension(69, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jT_giaVe, gridBagConstraints);

        jL_timKiem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_timKiem.setText("Tìm kiếm theo : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 80, 0, 0);
        jPanel2.add(jL_timKiem, gridBagConstraints);

        jComboBox_tieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã vé", "Số hiệu chuyến bay", "CCCD hành khách" }));
        jComboBox_tieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tieuChiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -36;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jComboBox_tieuChi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jT_timKiem, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel_South.setLayout(new java.awt.GridBagLayout());

        jB_dau.setText("|<");
        jB_dau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dauActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 150, 5, 0);
        jPanel_South.add(jB_dau, gridBagConstraints);

        jB_truoc.setText("<");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 5, 0);
        jPanel_South.add(jB_truoc, gridBagConstraints);

        jL_trang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_trang.setText("Trang 1 / X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel_South.add(jL_trang, gridBagConstraints);

        jB_sau.setText(">");
        jB_sau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_sauActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 5, 0);
        jPanel_South.add(jB_sau, gridBagConstraints);

        jB_cuoi.setText(">|");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 5, 141);
        jPanel_South.add(jB_cuoi, gridBagConstraints);

        add(jPanel_South, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox_tieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tieuChiActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_tieuChiActionPerformed

    private void jB_dauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_dauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_dauActionPerformed

    private void jB_sauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_sauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_sauActionPerformed

    public void setQuanLy(QuanLyChung quanLy) {
        this.quanLy = quanLy;
    }

    public JButton getjB_them() {
        return jButton2;
    }

    public JButton getjB_sua() {
        return jButton1;
    }

    public JButton getjB_xoa() {
        return jButton3;
    }

    public JButton getjB_lamMoi() {
        return jButton4;
    }

    public JTextField getjT_maVe() {
        return jT_maVe;
    }

    public JComboBox<String> getjComboBox_hangVe() {
        return jComboBox_hangVe;
    }

    public JComboBox<String> getjComboBox_soHieuCB() {
        return jComboBox_soHieuCB;
    }

    public JTextField getjT_giaVe() {
        return jT_giaVe;
    }

    public JTable getjTable() {
        return jTable_dsVeMayBay;
    }

    private void capNhatGiaVe() {
        if (this.quanLy == null) {
            return; // Đảm bảo quanLy đã được gán
        }

        String soHieuCB = (String) jComboBox_soHieuCB.getSelectedItem();
        String hangVeStr = (String) jComboBox_hangVe.getSelectedItem();
        ChuyenBay cb = quanLy.timChuyenBay(soHieuCB);

        if (cb != null && hangVeStr != null) {
            double gia = 0;
            if (hangVeStr.equals("Phổ thông")) {
                gia = cb.getGiaPhoThong();
            } else if (hangVeStr.equals("Thương gia")) {
                gia = cb.getGiaThuongGia();
            }
            // Cập nhật vào JTextField mới
            jT_giaVe.setText(String.format("%.0f", gia));
        } else {
            jT_giaVe.setText("");
        }
    }

    // Phương thức nạp dữ liệu vào bảng
    public void loadDataToTable(QuanLyChung quanLy) {
        this.quanLy = quanLy; // Gán đối tượng quanLy
        DefaultTableModel model = (DefaultTableModel) jTable_dsVeMayBay.getModel();
        model.setRowCount(0);

        // Cập nhật lại các cột cho đúng
        model.setColumnIdentifiers(new String[]{
            "Mã vé", "Số hiệu CB", "Hạng vé", "Giá vé", "CCCD Hành khách", "Họ tên Hành khách"
        });

        for (VeMayBay ve : quanLy.getDanhSachVe()) {
            ChuyenBay cb = quanLy.timChuyenBay(ve.getSoHieuChuyenBay());
            HanhKhach hk = quanLy.timHanhKhach(ve.getCccdHanhKhach());

            double giaVe = 0;
            if (cb != null) {
                giaVe = (ve.getHangVe() == VeMayBay.HangVe.THUONG_GIA) ? cb.getGiaThuongGia() : cb.getGiaPhoThong();
            }

            String cccd = (hk != null) ? hk.getCccd() : "Không rõ";
            String hoTen = (hk != null) ? hk.getHoTen() : "Không rõ";

            Object[] row = new Object[]{
                ve.getMaVe(),
                ve.getSoHieuChuyenBay(),
                ve.getHangVe().toString(),
                String.format("%,.0f VNĐ", giaVe),
                cccd,
                hoTen
            };
            model.addRow(row);
        }
    }

    // Phương thức nạp số hiệu chuyến bay vào JComboBox
    public void loadSoHieuChuyenBay(QuanLyChung quanLy) {
        List<String> soHieuChuyenBayList = quanLy.getDanhSachChuyenBay().stream()
                .map(ChuyenBay::getSoHieuChuyenBay).collect(Collectors.toList());
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(soHieuChuyenBayList.toArray(new String[0]));
        jComboBox_soHieuCB.setModel(model);
    }

    // Phương thức lấy dữ liệu từ các trường nhập liệu
    public VeMayBay getDataFromFields() {
        String maVe = jT_maVe.getText();
        String soHieuCB = (String) jComboBox_soHieuCB.getSelectedItem();
        String hangVeStr = (String) jComboBox_hangVe.getSelectedItem();

        if (maVe.isEmpty() || soHieuCB == null || hangVeStr == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        VeMayBay.HangVe hangVe = hangVeStr.equals("Phổ thông") ? VeMayBay.HangVe.PHO_THONG : VeMayBay.HangVe.THUONG_GIA;
        return new VeMayBay(maVe, soHieuCB, hangVe, null); // CCCD tạm thời để null khi admin thêm vé
    }

    // Phương thức xóa các trường nhập liệu
    public void clearFields() {
        jT_maVe.setText("");
        jComboBox_soHieuCB.setSelectedIndex(-1);
        jComboBox_hangVe.setSelectedIndex(0);
        jT_giaVe.setText("");
        jT_maVe.setEnabled(true);
        getjB_them().setEnabled(true);
        getjB_sua().setEnabled(false);
        getjB_xoa().setEnabled(false);
    }

    // Phương thức điền dữ liệu vào các trường khi chọn hàng trên bảng
    public void fillFieldsFromTable(int modelRowIndex) {
        DefaultTableModel model = (DefaultTableModel) jTable_dsVeMayBay.getModel();
        jT_maVe.setText(model.getValueAt(modelRowIndex, 0).toString());
        jComboBox_soHieuCB.setSelectedItem(model.getValueAt(modelRowIndex, 1).toString());

        String hangVeStr = model.getValueAt(modelRowIndex, 2).toString();
        jComboBox_hangVe.setSelectedItem(hangVeStr.equals("PHO_THONG") ? "Phổ thông" : "Thương gia");

        String giaVeStr = model.getValueAt(modelRowIndex, 3).toString().replace(" VNĐ", "").replace(",", "");
        jT_giaVe.setText(giaVeStr);

        jT_maVe.setEnabled(false);
        getjB_them().setEnabled(false);
        getjB_sua().setEnabled(true);
        getjB_xoa().setEnabled(true);
    }

    private void filterTable() {
        String text = jT_timKiem.getText();
        String tieuChi = (String) jComboBox_tieuChi.getSelectedItem();

        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            int columnIndex = -1;
            if ("Mã vé".equals(tieuChi)) {
                columnIndex = 0;
            } else if ("Số hiệu CB".equals(tieuChi)) {
                columnIndex = 1;
            } else if ("CCCD Hành khách".equals(tieuChi)) {
                columnIndex = 4; // Cột CCCD có chỉ số 4
            }

            if (columnIndex == -1) {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, columnIndex));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_cuoi;
    private javax.swing.JButton jB_dau;
    private javax.swing.JButton jB_sau;
    private javax.swing.JButton jB_truoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox_hangVe;
    private javax.swing.JComboBox<String> jComboBox_soHieuCB;
    private javax.swing.JComboBox<String> jComboBox_tieuChi;
    private javax.swing.JLabel jL_chuyenBay;
    private javax.swing.JLabel jL_giaVe;
    private javax.swing.JLabel jL_hangVe;
    private javax.swing.JLabel jL_maVe;
    private javax.swing.JLabel jL_timKiem;
    private javax.swing.JLabel jL_trang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_South;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_giaVe;
    private javax.swing.JTextField jT_maVe;
    private javax.swing.JTextField jT_timKiem;
    private javax.swing.JTable jTable_dsVeMayBay;
    // End of variables declaration//GEN-END:variables
}
