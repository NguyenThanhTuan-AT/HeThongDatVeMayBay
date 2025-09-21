package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.HanhKhach;
import model.QuanLyChung;
import model.VeMayBay;

public class PanelVeMayBay_Admin extends BaseAdminPanel<VeMayBay> {

    private DefaultTableModel tableModel;
    private QuanLyChung quanLy;

    private int currentPage = 1;
    private final int ITEMS_PER_PAGE = 20;
    private List<VeMayBay> filteredList;

    public PanelVeMayBay_Admin() {
        initComponents();
        this.tableModel = (DefaultTableModel) jTable_dsVeMayBay.getModel();
        this.filteredList = new ArrayList<>();

        jComboBox_tieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Tất cả", "Mã vé", "Số hiệu CB", "CCCD Hành khách"}));

        jT_timKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                currentPage = 1;
                updateTableAndPagination();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                currentPage = 1;
                updateTableAndPagination();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                currentPage = 1;
                updateTableAndPagination();
            }
        });

        jB_dau.addActionListener(e -> {
            currentPage = 1;
            updateTableAndPagination();
        });
        jB_truoc.addActionListener(e -> {
            if (currentPage > 1) {
                currentPage--;
                updateTableAndPagination();
            }
        });
        jB_sau.addActionListener(e -> {
            int totalPages = (int) Math.ceil((double) filteredList.size() / ITEMS_PER_PAGE);
            if (currentPage < totalPages) {
                currentPage++;
                updateTableAndPagination();
            }
        });
        jB_cuoi.addActionListener(e -> {
            int totalPages = (int) Math.ceil((double) filteredList.size() / ITEMS_PER_PAGE);
            currentPage = totalPages > 0 ? totalPages : 1;
            updateTableAndPagination();
        });

        jTable_dsVeMayBay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRowOnView = jTable_dsVeMayBay.getSelectedRow();
                if (selectedRowOnView != -1) {
                    fillFieldsFromTable(selectedRowOnView);
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
        jPanel2 = new javax.swing.JPanel();
        jT_maVe = new javax.swing.JTextField();
        jL_hangVe = new javax.swing.JLabel();
        jComboBox_hangVe = new javax.swing.JComboBox<>();
        jL_chuyenBay = new javax.swing.JLabel();
        jComboBox_soHieuCB = new javax.swing.JComboBox<>();
        jL_maVe = new javax.swing.JLabel();
        jL_giaVe = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jB_them = new javax.swing.JButton();
        jB_sua = new javax.swing.JButton();
        jB_xoa = new javax.swing.JButton();
        jB_lamMoi = new javax.swing.JButton();
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

        jB_them.setText("Thêm");
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

        jB_dau.setText("|<");
        jB_dau.setPreferredSize(new java.awt.Dimension(85, 28));
        jPanel_South.add(jB_dau);

        jB_truoc.setText("<");
        jPanel_South.add(jB_truoc);

        jL_trang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_trang.setText("Trang 1 / X");
        jPanel_South.add(jL_trang);

        jB_sau.setText(">");
        jPanel_South.add(jB_sau);

        jB_cuoi.setText(">|");
        jB_cuoi.setPreferredSize(new java.awt.Dimension(85, 28));
        jPanel_South.add(jB_cuoi);

        add(jPanel_South, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void updateTableAndPagination() {
        if (this.quanLy == null) {
            return;
        }
        String tuKhoa = jT_timKiem.getText().toLowerCase().trim();
        String tieuChi = (String) jComboBox_tieuChi.getSelectedItem();
        List<VeMayBay> danhSachGoc = this.quanLy.getDanhSachVe();

        if (tuKhoa.isEmpty()) {
            filteredList = new ArrayList<>(danhSachGoc);
        } else {
            filteredList = danhSachGoc.stream().filter(ve -> {
                if (ve == null) {
                    return false;
                }
                switch (tieuChi) {
                    case "Mã vé":
                        return ve.getMaVe() != null && ve.getMaVe().toLowerCase().contains(tuKhoa);
                    case "Số hiệu CB":
                        return ve.getSoHieuChuyenBay() != null && ve.getSoHieuChuyenBay().toLowerCase().contains(tuKhoa);
                    case "CCCD Hành khách":
                        return ve.getCccdHanhKhach() != null && ve.getCccdHanhKhach().toLowerCase().contains(tuKhoa);
                    default:
                        return (ve.getMaVe() != null && ve.getMaVe().toLowerCase().contains(tuKhoa))
                                || (ve.getSoHieuChuyenBay() != null && ve.getSoHieuChuyenBay().toLowerCase().contains(tuKhoa))
                                || (ve.getCccdHanhKhach() != null && ve.getCccdHanhKhach().toLowerCase().contains(tuKhoa));
                }
            }).collect(Collectors.toList());
        }

        int totalItems = filteredList.size();
        int totalPages = Math.max(1, (int) Math.ceil((double) totalItems / ITEMS_PER_PAGE));
        if (currentPage > totalPages) {
            currentPage = totalPages;
        }

        int startIndex = (currentPage - 1) * ITEMS_PER_PAGE;
        int endIndex = Math.min(startIndex + ITEMS_PER_PAGE, totalItems);
        List<VeMayBay> pagedList = filteredList.subList(startIndex, endIndex);

        tableModel.setRowCount(0);
        for (VeMayBay ve : pagedList) {
            ChuyenBay cb = quanLy.timChuyenBay(ve.getSoHieuChuyenBay());
            HanhKhach hk = quanLy.timHanhKhach(ve.getCccdHanhKhach());
            double giaVe = (cb != null) ? (ve.getHangVe() == VeMayBay.HangVe.THUONG_GIA ? cb.getGiaThuongGia() : cb.getGiaPhoThong()) : 0;
            tableModel.addRow(new Object[]{ve.getMaVe(), ve.getSoHieuChuyenBay(), ve.getHangVe(), String.format("%,.0f VNĐ", giaVe), ve.getCccdHanhKhach(), (hk != null ? hk.getHoTen() : "N/A")});
        }

        jL_trang.setText("Trang " + currentPage + " / " + totalPages);
        jB_dau.setEnabled(currentPage > 1);
        jB_truoc.setEnabled(currentPage > 1);
        jB_sau.setEnabled(currentPage < totalPages);
        jB_cuoi.setEnabled(currentPage < totalPages);
    }

    @Override
    public void loadDataToTable(QuanLyChung quanLy) {
        this.quanLy = quanLy;
        this.currentPage = 1;
        if (jT_timKiem != null) {
            jT_timKiem.setText("");
        }
        updateTableAndPagination();
    }

    @Override
    public void fillFieldsFromTable(int viewIndex) {
        // Chức năng sửa vé ở panel này khá phức tạp, tạm thời chỉ hiển thị
        int actualIndex = (currentPage - 1) * ITEMS_PER_PAGE + viewIndex;
        if (actualIndex < filteredList.size()) {
            VeMayBay ve = filteredList.get(actualIndex);
            // Có thể điền thông tin vé ra các JTextField nếu bạn muốn
        }
    }

    @Override
    public VeMayBay getDataFromFields() {
        return null;
    }

    @Override
    public void clearFields() {
    }

    public void setQuanLy(QuanLyChung quanLy) {
        this.quanLy = quanLy;
    }

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_cuoi;
    private javax.swing.JButton jB_dau;
    private javax.swing.JButton jB_lamMoi;
    private javax.swing.JButton jB_sau;
    private javax.swing.JButton jB_sua;
    private javax.swing.JButton jB_them;
    private javax.swing.JButton jB_truoc;
    private javax.swing.JButton jB_xoa;
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
