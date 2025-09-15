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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.QuanLyChung;
import model.VeMayBay;

public class PanelVeMayBay_Admin extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    private QuanLyChung quanLy;

    public PanelVeMayBay_Admin() {
        initComponents();
        tableModel = (DefaultTableModel) jTable1.getModel();

        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jTable1.getSelectedRow();
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
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jT_maVe = new javax.swing.JTextField();
        jL_hangVe = new javax.swing.JLabel();
        jComboBox_hangVe = new javax.swing.JComboBox<>();
        jL_chuyenBay = new javax.swing.JLabel();
        jComboBox_soHieuCB = new javax.swing.JComboBox<>();
        jL_maVe = new javax.swing.JLabel();
        jL_giaVe = new javax.swing.JLabel();
        jL_hienThiGia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 86;
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 55;
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 78;
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
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 187, 0, 0);
        jPanel2.add(jL_giaVe, gridBagConstraints);

        jL_hienThiGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hienThiGia.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jL_hienThiGia, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout());

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
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.ipadx = 247;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách vé máy bay");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 47, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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

    public JLabel getjL_hienThiGia() {
        return jL_hienThiGia;
    }

    public JTable getjTable() {
        return jTable1;
    }

    // Phương thức nạp dữ liệu vào bảng
    public void loadDataToTable(QuanLyChung quanLy) {
        tableModel.setRowCount(0);
        for (VeMayBay ve : quanLy.getDanhSachVe()) {
            ChuyenBay cb = quanLy.timChuyenBay(ve.getSoHieuChuyenBay());
            double giaVe = 0;
            if (cb != null) {
                giaVe = (ve.getHangVe() == VeMayBay.HangVe.THUONG_GIA) ? cb.getGiaThuongGia() : cb.getGiaPhoThong();
            }
            Object[] row = new Object[]{
                ve.getMaVe(),
                ve.getSoHieuChuyenBay(),
                ve.getHangVe().toString(),
                String.format("%,.0f VNĐ", giaVe)
            };
            tableModel.addRow(row);
        }
    }

    // Phương thức nạp số hiệu chuyến bay vào JComboBox
    public void loadSoHieuChuyenBay(QuanLyChung quanLy) {
        List<String> soHieuChuyenBayList = quanLy.getDanhSachChuyenBay().stream()
                .map(ChuyenBay::getSoHieuChuyenBay).collect(Collectors.toList());
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(soHieuChuyenBayList.toArray(new String[0]));
        jComboBox_soHieuCB.setModel(model);
    }

    // Phương thức cập nhật giá vé hiển thị
    private void capNhatGiaVe() {
        // Đảm bảo đối tượng quanLy đã được truyền vào trước khi sử dụng
        if (this.quanLy == null) {
            return;
        }

        String soHieuCB = (String) jComboBox_soHieuCB.getSelectedItem();
        String hangVe = (String) jComboBox_hangVe.getSelectedItem();

        ChuyenBay cb = this.quanLy.timChuyenBay(soHieuCB);

        if (cb != null && hangVe != null) {
            double gia = 0;
            if (hangVe.equals("Phổ thông")) {
                gia = cb.getGiaPhoThong();
            } else if (hangVe.equals("Thương gia")) {
                gia = cb.getGiaThuongGia();
            }
            jL_hienThiGia.setText(String.format("%,.0f VNĐ", gia));
        } else {
            jL_hienThiGia.setText("0 VNĐ");
        }
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

        VeMayBay.HangVe hangVe = VeMayBay.HangVe.valueOf(hangVeStr.equals("Phổ thông") ? "PHO_THONG" : "THUONG_GIA");
        return new VeMayBay(maVe, soHieuCB, hangVe, null); // CCCD sẽ được gán sau
    }

    // Phương thức xóa các trường nhập liệu
    public void clearFields() {
        jT_maVe.setText("");
        jComboBox_soHieuCB.setSelectedIndex(-1);
        jComboBox_hangVe.setSelectedIndex(0);
        jL_hienThiGia.setText("0 VNĐ");
        jT_maVe.setEnabled(true);
        getjB_them().setEnabled(true);
        getjB_sua().setEnabled(false);
        getjB_xoa().setEnabled(false);
    }

    // Phương thức điền dữ liệu vào các trường khi chọn hàng trên bảng
    public void fillFieldsFromTable(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jT_maVe.setText(model.getValueAt(rowIndex, 0).toString());
        jComboBox_soHieuCB.setSelectedItem(model.getValueAt(rowIndex, 1).toString());

        String hangVeStr = model.getValueAt(rowIndex, 2).toString();
        jComboBox_hangVe.setSelectedItem(hangVeStr.equals("PHO_THONG") ? "Phổ thông" : "Thương gia");

        capNhatGiaVe();

        jT_maVe.setEnabled(false);
        getjB_them().setEnabled(false);
        getjB_sua().setEnabled(true);
        getjB_xoa().setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox_hangVe;
    private javax.swing.JComboBox<String> jComboBox_soHieuCB;
    private javax.swing.JLabel jL_chuyenBay;
    private javax.swing.JLabel jL_giaVe;
    private javax.swing.JLabel jL_hangVe;
    private javax.swing.JLabel jL_hienThiGia;
    private javax.swing.JLabel jL_maVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_maVe;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
