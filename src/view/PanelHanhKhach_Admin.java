package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.HanhKhach;
import model.QuanLyChung;

public class PanelHanhKhach_Admin extends javax.swing.JPanel {

    private DefaultTableModel tableModel; // Khai báo biến tableModel tại đây

    public PanelHanhKhach_Admin() {
        initComponents();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dsHanhKhach = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jL_hoTen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hoTen.setText("Họ tên : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 124, 0, 0);
        jPanel2.add(jL_hoTen, gridBagConstraints);

        jT_hoTen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jT_hoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_hoTenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel2.add(jT_hoTen, gridBagConstraints);

        jL_soCCCD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_soCCCD.setText("Số CCCD : ");
        jL_soCCCD.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 124, 0, 0);
        jPanel2.add(jL_soCCCD, gridBagConstraints);

        jT_soCCCD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_soCCCD.setPreferredSize(new java.awt.Dimension(64, 26));
        jT_soCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_soCCCDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jT_soCCCD, gridBagConstraints);

        jL_maVe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maVe.setText(" Mã vé : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 124, 0, 0);
        jPanel2.add(jL_maVe, gridBagConstraints);

        jComboBox_maVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.ipady = 13;
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
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 6, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách hành khách");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 23, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

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
        ));
        jScrollPane3.setViewportView(jTable_dsHanhKhach);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_themActionPerformed

    private void jT_hoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_hoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_hoTenActionPerformed

    private void jT_soCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_soCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_soCCCDActionPerformed

    public JButton getjB_lamMoi() {
        return jB_lamMoi;
    }

    public JButton getjB_sua() {
        return jB_sua;
    }

    public JButton getjB_them() {
        return jB_them;
    }

    public JButton getjB_xoa() {
        return jB_xoa;
    }

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
        getjB_them().setEnabled(true);
        getjB_sua().setEnabled(false);
        getjB_xoa().setEnabled(false);
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
    public void fillFieldsFromTable(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) jTable_dsHanhKhach.getModel();
        getjT_soCCCD().setText(model.getValueAt(rowIndex, 0).toString());
        getjT_hoTen().setText(model.getValueAt(rowIndex, 1).toString());
        getjT_soCCCD().setEnabled(false); // Không cho phép sửa CCCD (là khóa chính)
        getjB_them().setEnabled(false);
        getjB_sua().setEnabled(true);
        getjB_xoa().setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_lamMoi;
    private javax.swing.JButton jB_sua;
    private javax.swing.JButton jB_them;
    private javax.swing.JButton jB_xoa;
    private javax.swing.JComboBox<String> jComboBox_maVe;
    private javax.swing.JLabel jL_hoTen;
    private javax.swing.JLabel jL_maVe;
    private javax.swing.JLabel jL_soCCCD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_hoTen;
    private javax.swing.JTextField jT_soCCCD;
    private javax.swing.JTable jTable_dsHanhKhach;
    // End of variables declaration//GEN-END:variables
}
