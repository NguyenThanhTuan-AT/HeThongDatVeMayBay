package view;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.QuanLyChung;

public class DashboardThongKeVeFrame extends javax.swing.JFrame {

    private QuanLyChung quanLy;
    private DefaultTableModel tableModel;

    public DashboardThongKeVeFrame(javax.swing.JFrame parent, QuanLyChung quanLy) {
        this.quanLy = quanLy;
        initComponents();

        // 1. Lấy model của bảng để dễ dàng thao tác
        this.tableModel = (DefaultTableModel) jTable1.getModel();

        // 2. Thiết lập các thuộc tính cho Frame
        this.setTitle("Bảng điều khiển - Thống kê vé");
        this.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE); // QUAN TRỌNG: Đóng cửa sổ này không tắt cả chương trình
        this.setLocationRelativeTo(parent); // Hiển thị giữa màn hình cha

        // 3. Đặt ngày mặc định cho JDateChooser là hôm nay
        jDateChooser_ngayChon.setDate(new Date());

        // 4. Gắn sự kiện cho nút "Tải lại"
        jB_taiLai.addActionListener(e -> taiDuLieuThongKe());

        // 5. Tải dữ liệu lần đầu tiên ngay khi mở cửa sổ
        taiDuLieuThongKe();
    }

    private void taiDuLieuThongKe() {
        Date selectedDate = jDateChooser_ngayChon.getDate();
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một ngày hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LocalDate ngay = selectedDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        List<ChuyenBay> chuyenBayTrongNgay = quanLy.locChuyenBayTheoNgay(ngay);

        // Xóa dữ liệu cũ trên bảng
        tableModel.setRowCount(0);

        if (chuyenBayTrongNgay.isEmpty()) {
            // Reset thông tin tổng kết và thông báo
            jL_tongSoChuyenBay.setText("Tổng số chuyến bay: 0");
            jL_tongVeDaBan.setText("Tổng vé đã bán: 0");
            jL_tongTyLeLapDay.setText("Tỷ lệ trung bình: 0.00%");
            return;
        }

        int tongVeDaBan = 0;
        int tongSoGhe = 0;

        for (ChuyenBay cb : chuyenBayTrongNgay) {
            int daBan = cb.getSoVeDaBan();
            int tongGhe = cb.tongSoCho();
            int conTrong = tongGhe - daBan;
            double tyLe = (tongGhe > 0) ? ((double) daBan / tongGhe) * 100 : 0;

            tableModel.addRow(new Object[]{
                cb.getSoHieuChuyenBay(),
                tongGhe,
                daBan,
                conTrong,
                String.format("%.2f%%", tyLe)
            });

            tongVeDaBan += daBan;
            tongSoGhe += tongGhe;
        }

        // Cập nhật các label tổng kết
        double tyLeTrungBinh = (tongSoGhe > 0) ? ((double) tongVeDaBan / tongSoGhe) * 100 : 0;
        jL_tongSoChuyenBay.setText("Tổng số chuyến bay: " + chuyenBayTrongNgay.size());
        jL_tongVeDaBan.setText("Tổng vé đã bán: " + String.format("%,d", tongVeDaBan));
        jL_tongTyLeLapDay.setText(String.format("Tỷ lệ trung bình: %.2f%%", tyLeTrungBinh));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        jL_chonNgayThongKe = new javax.swing.JLabel();
        jDateChooser_ngayChon = new com.toedter.calendar.JDateChooser();
        jB_taiLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bottomPanel = new javax.swing.JPanel();
        jL_tongSoChuyenBay = new javax.swing.JLabel();
        jL_tongVeDaBan = new javax.swing.JLabel();
        jL_tongTyLeLapDay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL_chonNgayThongKe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_chonNgayThongKe.setText("Chọn ngày thống kê : ");
        jL_chonNgayThongKe.setPreferredSize(new java.awt.Dimension(114, 30));
        topPanel.add(jL_chonNgayThongKe);

        jDateChooser_ngayChon.setDateFormatString("d MMM yyyy");
        jDateChooser_ngayChon.setPreferredSize(new java.awt.Dimension(120, 30));
        topPanel.add(jDateChooser_ngayChon);

        jB_taiLai.setText("Tải lại");
        jB_taiLai.setPreferredSize(new java.awt.Dimension(72, 30));
        topPanel.add(jB_taiLai);

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Số hiệu CB", "Tổng số ghế", "Đã bán", "Còn trống", "Tỷ lệ lấp đầy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jL_tongSoChuyenBay.setText("Tổng số chuyến bay: ");
        jL_tongSoChuyenBay.setPreferredSize(new java.awt.Dimension(150, 30));
        bottomPanel.add(jL_tongSoChuyenBay);

        jL_tongVeDaBan.setText("Tổng vé đã bán: ");
        jL_tongVeDaBan.setPreferredSize(new java.awt.Dimension(130, 30));
        bottomPanel.add(jL_tongVeDaBan);

        jL_tongTyLeLapDay.setText("Tỷ lệ trung bình: ");
        jL_tongTyLeLapDay.setPreferredSize(new java.awt.Dimension(130, 30));
        bottomPanel.add(jL_tongTyLeLapDay);

        getContentPane().add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton jB_taiLai;
    private com.toedter.calendar.JDateChooser jDateChooser_ngayChon;
    private javax.swing.JLabel jL_chonNgayThongKe;
    private javax.swing.JLabel jL_tongSoChuyenBay;
    private javax.swing.JLabel jL_tongTyLeLapDay;
    private javax.swing.JLabel jL_tongVeDaBan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
