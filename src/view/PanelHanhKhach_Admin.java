package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
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

public class PanelHanhKhach_Admin extends BaseAdminPanel<HanhKhach> {

    private DefaultTableModel tableModel;
    private QuanLyChung quanLy;

    // Biến cho phân trang và tìm kiếm
    private int currentPage = 1;
    private final int ITEMS_PER_PAGE = 20;
    private List<HanhKhach> filteredList;

    public PanelHanhKhach_Admin() {
        initComponents();
        this.tableModel = (DefaultTableModel) jTable_dsHanhKhach.getModel();
        this.filteredList = new ArrayList<>();

        // Gắn sự kiện cho ô tìm kiếm
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

        // Gắn sự kiện cho các nút phân trang
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

        // Sự kiện click chuột
        jTable_dsHanhKhach.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRowOnView = jTable_dsHanhKhach.getSelectedRow();
                if (selectedRowOnView != -1) {
                    fillFieldsFromTable(selectedRowOnView);
                }
            }
        });
        jComboBox_locChuyenBay.addActionListener(e -> {
            currentPage = 1; // Reset về trang đầu tiên mỗi khi lọc
            updateTableAndPagination();
        });
        // Vô hiệu hóa các trường và nút không dùng đến
        jT_hoTen.setEditable(false);
        jT_soCCCD.setEditable(false);
        jComboBox_maVe.setEnabled(false);
        jB_them.setEnabled(false);
        jB_sua.setEnabled(false);
        jB_xoa.setEnabled(false);
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
        jL_locTheoChuyenBay = new javax.swing.JLabel();
        jComboBox_locChuyenBay = new javax.swing.JComboBox<>();
        jB_xuatExcel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dsHanhKhach = new javax.swing.JTable();
        jPanel_South = new javax.swing.JPanel();
        jB_dau = new javax.swing.JButton();
        jB_truoc = new javax.swing.JButton();
        jL_trang = new javax.swing.JLabel();
        jB_sau = new javax.swing.JButton();
        jB_cuoi = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jL_hoTen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_hoTen.setText("Họ tên : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 124, 0, 0);
        jPanel2.add(jL_hoTen, gridBagConstraints);

        jT_hoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_hoTen.setPreferredSize(new java.awt.Dimension(70, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 168;
        gridBagConstraints.ipady = 4;
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
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 124, 0, 0);
        jPanel2.add(jL_soCCCD, gridBagConstraints);

        jT_soCCCD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_soCCCD.setPreferredSize(new java.awt.Dimension(70, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 168;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jT_soCCCD, gridBagConstraints);

        jL_maVe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_maVe.setText(" Mã vé : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 124, 0, 0);
        jPanel2.add(jL_maVe, gridBagConstraints);

        jComboBox_maVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_maVe.setPreferredSize(new java.awt.Dimension(77, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_maVe, gridBagConstraints);

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
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Danh sách hành khách");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 106, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jL_timKiem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_timKiem.setText("Tìm kiếm theo : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 74, 0, 0);
        jPanel2.add(jL_timKiem, gridBagConstraints);

        jComboBox_tieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Họ tên", "CCCD" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_tieuChi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jT_timKiem, gridBagConstraints);

        jL_locTheoChuyenBay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_locTheoChuyenBay.setText("Lọc theo chuyến bay : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 74, 0, 0);
        jPanel2.add(jL_locTheoChuyenBay, gridBagConstraints);

        jComboBox_locChuyenBay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_locChuyenBay.setPreferredSize(new java.awt.Dimension(80, 22));
        jComboBox_locChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_locChuyenBayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jComboBox_locChuyenBay, gridBagConstraints);

        jB_xuatExcel.setText("Xuất Excel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 17, 0, 0);
        jPanel2.add(jB_xuatExcel, gridBagConstraints);

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

    private void jComboBox_locChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_locChuyenBayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_locChuyenBayActionPerformed

    private void updateTableAndPagination() {
        if (this.quanLy == null) {
            return;
        }

        String chuyenBayDuocChon = (String) jComboBox_locChuyenBay.getSelectedItem();
        List<HanhKhach> danhSachGoc;

        // Nếu người dùng chọn một chuyến bay cụ thể
        if (chuyenBayDuocChon != null && !chuyenBayDuocChon.equals("Tất cả chuyến bay")) {
            // Sử dụng phương thức đã có sẵn trong QuanLyChung
            danhSachGoc = this.quanLy.locHanhKhachTheoChuyenBay(chuyenBayDuocChon);
        } else {
            // Nếu không, lấy toàn bộ danh sách hành khách như cũ
            danhSachGoc = this.quanLy.getDanhSachHanhKhach();
        }

        // Lọc dữ liệu
        String tuKhoa = jT_timKiem.getText().toLowerCase().trim();
        String tieuChi = (String) jComboBox_tieuChi.getSelectedItem();

        if (tuKhoa.isEmpty()) {
            filteredList = new ArrayList<>(danhSachGoc);
        } else {
            filteredList = danhSachGoc.stream().filter(hk -> {
                if (hk == null) {
                    return false;
                }
                switch (tieuChi) {
                    case "CCCD":
                        return hk.getCccd() != null && hk.getCccd().toLowerCase().contains(tuKhoa);
                    case "Họ tên":
                        return hk.getHoTen() != null && hk.getHoTen().toLowerCase().contains(tuKhoa);
                    default: // "Tất cả"
                        boolean cccdMatch = hk.getCccd() != null && hk.getCccd().toLowerCase().contains(tuKhoa);
                        boolean hoTenMatch = hk.getHoTen() != null && hk.getHoTen().toLowerCase().contains(tuKhoa);
                        return cccdMatch || hoTenMatch;
                }
            }).collect(Collectors.toList());
        }

        // Tính toán phân trang
        int totalItems = filteredList.size();
        int totalPages = (int) Math.ceil((double) totalItems / ITEMS_PER_PAGE);
        totalPages = totalPages > 0 ? totalPages : 1;
        if (currentPage > totalPages) {
            currentPage = totalPages;
        }

        int startIndex = (currentPage - 1) * ITEMS_PER_PAGE;
        int endIndex = Math.min(startIndex + ITEMS_PER_PAGE, totalItems);
        List<HanhKhach> pagedList = filteredList.subList(startIndex, endIndex);

        // Hiển thị
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(new String[]{"CCCD", "Họ tên", "Danh sách vé"});
        for (HanhKhach hk : pagedList) {
            String danhSachVe = String.join(", ", hk.getDanhSachMaVe());
            tableModel.addRow(new Object[]{hk.getCccd(), hk.getHoTen(), danhSachVe});
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
        // Nạp dữ liệu cho JComboBox chuyến bay
        loadChuyenBayComboBox(quanLy);

        if (jT_timKiem != null) {
            jT_timKiem.setText("");
        }
        updateTableAndPagination();
    }

    @Override
    public void fillFieldsFromTable(int viewIndex) {
        int actualIndex = (currentPage - 1) * ITEMS_PER_PAGE + viewIndex;
        if (actualIndex < filteredList.size()) {
            HanhKhach hk = filteredList.get(actualIndex);
            jT_soCCCD.setText(hk.getCccd());
            jT_hoTen.setText(hk.getHoTen());
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(hk.getDanhSachMaVe().toArray(new String[0]));
            jComboBox_maVe.setModel(model);
        }
    }

    @Override
    public void clearFields() {
        jT_soCCCD.setText("");
        jT_hoTen.setText("");
        jComboBox_maVe.setModel(new DefaultComboBoxModel<>());
    }

    @Override
    public HanhKhach getDataFromFields() {
        return null;
    }

    public void loadChuyenBayComboBox(QuanLyChung quanLy) {
        // Lấy mô hình của JComboBox
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jComboBox_locChuyenBay.getModel();
        // Xóa các mục cũ
        model.removeAllElements();
        // Thêm một mục mặc định để có thể xem tất cả hành khách
        model.addElement("Tất cả chuyến bay");
        // Lấy danh sách số hiệu chuyến bay từ QuanLyChung và thêm vào model
        quanLy.getDanhSachChuyenBay().stream()
                .map(ChuyenBay::getSoHieuChuyenBay)
                .sorted() // Sắp xếp theo Alphabet
                .forEach(model::addElement);

        // Đặt lại mục được chọn là mục mặc định
        jComboBox_locChuyenBay.setSelectedIndex(0);
    }

    public JButton getjB_lamMoi() {
        return jB_lamMoi;
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

    public javax.swing.JButton getjB_xuatExcel() {
        return jB_xuatExcel;
    }

    public List<model.HanhKhach> getFilteredList() {
        return filteredList;
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
    private javax.swing.JButton jB_xuatExcel;
    private javax.swing.JComboBox<String> jComboBox_locChuyenBay;
    private javax.swing.JComboBox<String> jComboBox_maVe;
    private javax.swing.JComboBox<String> jComboBox_tieuChi;
    private javax.swing.JLabel jL_hoTen;
    private javax.swing.JLabel jL_locTheoChuyenBay;
    private javax.swing.JLabel jL_maVe;
    private javax.swing.JLabel jL_soCCCD;
    private javax.swing.JLabel jL_timKiem;
    private javax.swing.JLabel jL_trang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_South;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT_hoTen;
    private javax.swing.JTextField jT_soCCCD;
    private javax.swing.JTextField jT_timKiem;
    private javax.swing.JTable jTable_dsHanhKhach;
    // End of variables declaration//GEN-END:variables
}
