package view;

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
import model.HanhKhach;
import model.QuanLyChung;
import model.VeMayBay;

public class PanelHanhKhach_Admin extends javax.swing.JPanel {

    private DefaultTableModel tableModel; // Khai báo biến tableModel tại đây
    private TableRowSorter<DefaultTableModel> sorter;

    public PanelHanhKhach_Admin() {
        initComponents();

        DefaultTableModel model = (DefaultTableModel) jTable_dsHanhKhach.getModel();
        sorter = new TableRowSorter<>(model);
        jTable_dsHanhKhach.setRowSorter(sorter);
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
        tableModel = (DefaultTableModel) jTable_dsHanhKhach.getModel();
        jTable_dsHanhKhach.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jTable_dsHanhKhach.getSelectedRow();
                if (selectedRow != -1) {
                    fillFieldsFromTable(selectedRow);
                }
            }
        });
        jT_hoTen.setEditable(false);
        jT_soCCCD.setEditable(false);

        jB_them.setEnabled(false);
        jB_sua.setEnabled(false);
        jB_xoa.setEnabled(false);
        jB_them.setToolTipText("Hành khách được tạo tự động khi người dùng đăng ký tài khoản mới.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jL_hoTen = new javax.swing.JLabel();
        jT_hoTen = new javax.swing.JTextField();
        jL_soCCCD = new javax.swing.JLabel();
        jT_soCCCD = new javax.swing.JTextField();
        jL_maVe = new javax.swing.JLabel();
        jComboBox_maVe = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jB_them = new javax.swing.JButton();
        jB_sua = new javax.swing.JButton();
        jB_xoa = new javax.swing.JButton();
        jB_lamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jL_timKiem = new javax.swing.JLabel();
        jComboBox_tieuChi = new javax.swing.JComboBox<>();
        jT_timKiem = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dsHanhKhach = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jL_hoTen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hoTen.setText("Họ tên : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 124, 0, 0);
        jPanel2.add(jL_hoTen, gridBagConstraints);

        jT_hoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_hoTen.setPreferredSize(new java.awt.Dimension(70, 20));
        jT_hoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_hoTenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel2.add(jT_hoTen, gridBagConstraints);

        jL_soCCCD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_soCCCD.setText("Số CCCD : ");
        jL_soCCCD.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 124, 0, 0);
        jPanel2.add(jL_soCCCD, gridBagConstraints);

        jT_soCCCD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_soCCCD.setPreferredSize(new java.awt.Dimension(70, 20));
        jT_soCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_soCCCDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jT_soCCCD, gridBagConstraints);

        jL_maVe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maVe.setText(" Mã vé : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 124, 0, 0);
        jPanel2.add(jL_maVe, gridBagConstraints);

        jComboBox_maVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_maVe.setPreferredSize(new java.awt.Dimension(77, 20));
        jComboBox_maVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_maVeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 140;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_maVe, gridBagConstraints);

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

        jB_xoa.setText("Xoá");
        jPanel3.add(jB_xoa);

        jB_lamMoi.setText("Làm mới");
        jPanel3.add(jB_lamMoi);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách hành khách");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 106, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jL_timKiem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_timKiem.setText("Tìm kiếm theo : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 106, 0, 0);
        jPanel2.add(jL_timKiem, gridBagConstraints);

        jComboBox_tieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Họ tên", "CCCD" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_tieuChi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jT_timKiem, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jTable_dsHanhKhach.setModel(new javax.swing.table.DefaultTableModel(
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
                "CCCD", "Họ tên", "Mã vé", "Chuyến bay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_dsHanhKhach);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jT_hoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_hoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_hoTenActionPerformed

    private void jT_soCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_soCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_soCCCDActionPerformed

    private void jB_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_themActionPerformed

    private void jComboBox_maVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_maVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_maVeActionPerformed

    public JButton getjB_lamMoi() {
        return jB_lamMoi;
    }

////    public JButton getjB_sua() {
//        return jB_sua;
//    }
//
//    public JButton getjB_them() {
//        return jB_them;
//    }
//
//    public JButton getjB_xoa() {
//        return jB_xoa;
//    }
    public JComboBox<String> getjComboBox_maVe() {
        return jComboBox_maVe;
    }

    public JTextField getjT_hoTen() {
        return jT_hoTen;
    }

    public JTextField getjT_soCCCD() {
        return jT_soCCCD;
    }

    public JTable getjTable_dsHanhKhach() {
        return jTable_dsHanhKhach;
    }

    public void loadMaVeToComboBox(QuanLyChung quanLy) {
        List<String> maVeList = quanLy.getDanhSachVe().stream()
                .map(VeMayBay::getMaVe)
                .collect(Collectors.toList());

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(maVeList.toArray(new String[0]));
        jComboBox_maVe.setModel(model);
    }

    // Phương thức nạp dữ liệu vào bảng
    public void loadDataToTable(QuanLyChung quanLy) {
        DefaultTableModel model = (DefaultTableModel) jTable_dsHanhKhach.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        // Đảm bảo bảng có đúng số cột
        model.setColumnCount(0);
        model.addColumn("CCCD");
        model.addColumn("Họ tên");
        model.addColumn("Danh sách vé");

        for (HanhKhach hk : quanLy.getDanhSachHanhKhach()) {
            // Chuyển List<String> thành một chuỗi String duy nhất, ngăn cách bởi dấu phẩy
            String danhSachVe = String.join(", ", hk.getDanhSachMaVe());

            Object[] row = new Object[]{
                hk.getCccd(),
                hk.getHoTen(),
                danhSachVe // Hiển thị danh sách vé
            };
            model.addRow(row);
        }
    }

    // Phương thức xóa các trường nhập liệu
    public void clearFields() {
        getjT_soCCCD().setText("");
        getjT_hoTen().setText("");
        getjT_soCCCD().setEnabled(true);
//        getjB_them().setEnabled(true);
//        getjB_sua().setEnabled(false);
//        getjB_xoa().setEnabled(false);
    }

    // Phương thức lấy dữ liệu từ các trường nhập liệu
    public HanhKhach getDataFromFields() {
        String cccd = getjT_soCCCD().getText();
        String hoTen = getjT_hoTen().getText();

        if (cccd.isEmpty() || hoTen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền CCCD và Họ tên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        // Khi thêm mới, hành khách chưa có vé nào. Danh sách vé sẽ tự khởi tạo là rỗng.
        return new HanhKhach(cccd, hoTen);
    }

    // Phương thức điền dữ liệu vào các trường khi chọn hàng trên bảng
    public void fillFieldsFromTable(int modelRowIndex) {
        DefaultTableModel model = (DefaultTableModel) jTable_dsHanhKhach.getModel();
        getjT_soCCCD().setText(model.getValueAt(modelRowIndex, 0).toString());
        getjT_hoTen().setText(model.getValueAt(modelRowIndex, 1).toString());
    }

    private void filterTable() {
        String text = jT_timKiem.getText();
        String tieuChi = (String) jComboBox_tieuChi.getSelectedItem();

        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            int columnIndex = -1;
            if ("CCCD".equals(tieuChi)) {
                columnIndex = 0;
            } else if ("Họ tên".equals(tieuChi)) {
                columnIndex = 1;
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
    private javax.swing.JComboBox<String> jComboBox_maVe;
    private javax.swing.JComboBox<String> jComboBox_tieuChi;
    private javax.swing.JLabel jL_hoTen;
    private javax.swing.JLabel jL_maVe;
    private javax.swing.JLabel jL_soCCCD;
    private javax.swing.JLabel jL_timKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_hoTen;
    private javax.swing.JTextField jT_soCCCD;
    private javax.swing.JTextField jT_timKiem;
    private javax.swing.JTable jTable_dsHanhKhach;
    // End of variables declaration//GEN-END:variables
}
