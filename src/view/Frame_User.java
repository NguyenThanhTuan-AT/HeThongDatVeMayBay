package view;

import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.QuanLyChung;
import model.TaiKhoan;
import model.VeMayBay;

public class Frame_User extends javax.swing.JFrame {

    private CardLayout cardLayout;

    private view.PanelTimKiem_User panelTimKiem;
    private view.PanelKetQuaTimKiem_User panelKetQuaTimKiem;
    private view.PanelThongTinDatVe_User panelThongTinDatVe;
    private view.PanelVeCuaToi_User panelVeCuaToi;

    // Các đối tượng logic
    private QuanLyChung quanLy;
    private TaiKhoan taiKhoanDangNhap;

    // Biến để lưu thông tin chuyến bay đã chọn
    private String soHieuChuyenBayDaChon;

    public Frame_User(QuanLyChung quanLy, TaiKhoan taiKhoan) {
        this.quanLy = quanLy;
        this.taiKhoanDangNhap = taiKhoan;
        initComponents();

        setupAllPanelsAndEvents();

        panelHeader.getjL_xinChao().setText("Xin chào, " + taiKhoanDangNhap.getHoTen());

        pack();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new view.PanelHeader_User();
        mainContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout mainContentPanelLayout = new javax.swing.GroupLayout(mainContentPanel);
        mainContentPanel.setLayout(mainContentPanelLayout);
        mainContentPanelLayout.setHorizontalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        mainContentPanelLayout.setVerticalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        getContentPane().add(mainContentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainContentPanel;
    private view.PanelHeader_User panelHeader;
    // End of variables declaration//GEN-END:variables

    private void setupAllPanelsAndEvents() {
        cardLayout = new CardLayout();
        mainContentPanel.setLayout(cardLayout);

        // Khởi tạo các panel chức năng
        panelTimKiem = new view.PanelTimKiem_User();
        panelKetQuaTimKiem = new view.PanelKetQuaTimKiem_User();
        panelThongTinDatVe = new view.PanelThongTinDatVe_User();
        panelVeCuaToi = new view.PanelVeCuaToi_User();

        // Thêm các panel chức năng vào CardLayout
        mainContentPanel.add(panelTimKiem, "timKiem");
        mainContentPanel.add(panelKetQuaTimKiem, "ketQuaTimKiem");
        mainContentPanel.add(panelThongTinDatVe, "thongTinDatVe");
        mainContentPanel.add(panelVeCuaToi, "veCuaToi");

        // Hiển thị màn hình tìm kiếm đầu tiên
        cardLayout.show(mainContentPanel, "timKiem");

        // Gắn các sự kiện cho các nút
        setupEvents();
    }

    private void setupEvents() {
        // Sự kiện trên header
        panelHeader.getJbTrangChu().addActionListener(e -> {
            cardLayout.show(mainContentPanel, "timKiem");
            pack();
            setLocationRelativeTo(null);
        });
        panelHeader.getJbVeCuaToi().addActionListener(e -> {
            hienThiVeCuaToi();
            cardLayout.show(mainContentPanel, "veCuaToi");
            pack();
            setLocationRelativeTo(null);
        });
        panelHeader.getJbDangXuat().addActionListener(e -> {
            this.dispose();
            new DangNhapFrame().setVisible(true);
        });

        // Sự kiện trên panel tìm kiếm
        panelTimKiem.getjB_timKiem().addActionListener(e -> {
            timKiemChuyenBay();
            cardLayout.show(mainContentPanel, "ketQuaTimKiem");
            pack();
            setLocationRelativeTo(null);
        });

        // Sự kiện trên panel kết quả tìm kiếm
        panelKetQuaTimKiem.getJbQuayLai().addActionListener(e -> {
            cardLayout.show(mainContentPanel, "timKiem");
            pack();
            setLocationRelativeTo(null);
        });
        panelKetQuaTimKiem.getJbChonCB().addActionListener(e -> {
            int selectedRow = panelKetQuaTimKiem.getJTable_KetQua().getSelectedRow();
            if (selectedRow != -1) {
                String soHieuChuyenBayDaChon = (String) panelKetQuaTimKiem.getJTable_KetQua().getValueAt(selectedRow, 0);
                ChuyenBay cb = quanLy.timChuyenBay(soHieuChuyenBayDaChon);
                if (cb != null) {
                    panelThongTinDatVe.setThongTinChuyenBay(cb, quanLy);
                    panelThongTinDatVe.getjT_hoTen().setText(taiKhoanDangNhap.getHoTen());
                    panelThongTinDatVe.getjT_CCCD().setText(taiKhoanDangNhap.getCccd());
                    cardLayout.show(mainContentPanel, "thongTinDatVe");
                    pack();
                    setLocationRelativeTo(null);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một chuyến bay.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Sự kiện trên panel thông tin đặt vé
        panelThongTinDatVe.getjB_quayLai().addActionListener(e -> {
            cardLayout.show(mainContentPanel, "ketQuaTimKiem");
            pack();
            setLocationRelativeTo(null);
        });
        panelThongTinDatVe.getjB_xacNhan().addActionListener(e -> {
            datVe();
        });

        // Sự kiện cho nút Đổi mật khẩu
        panelHeader.getjB_doiMatKhau().addActionListener(e -> {
            // Tạo và hiển thị Frame đổi mật khẩu
            // Truyền vào đối tượng quanLy và taiKhoan hiện tại
            ThayDoiMatKhauFrame doiMKFrame = new ThayDoiMatKhauFrame(quanLy, taiKhoanDangNhap);
            doiMKFrame.setVisible(true);
        });

        // Sự kiện cho nút Sửa thông tin
        panelHeader.getjB_suaThongTin().addActionListener(e -> {
            // Tạo và hiển thị Frame sửa thông tin
            ThayDoiThongTinFrame doiTTFrame = new ThayDoiThongTinFrame(quanLy, taiKhoanDangNhap);
            doiTTFrame.setVisible(true);
        });
    }

    private void timKiemChuyenBay() {
        String diemDi = panelTimKiem.getjT_diemDi().getText().trim();
        String diemDen = panelTimKiem.getjT_diemDen().getText().trim();
        java.util.Date date = panelTimKiem.getjDateChooser1().getDate();

        if (diemDi.isEmpty() || diemDen.isEmpty() || date == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ Điểm đi, Điểm đến và Ngày đi.", "Thiếu thông tin", JOptionPane.ERROR_MESSAGE);
            return;
        }
        LocalDate ngayDi = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Lọc danh sách chuyến bay bằng Java Stream
        List<ChuyenBay> ketQuaTimKiem = quanLy.getDanhSachChuyenBay().stream()
                .filter(cb -> cb.getDiemDi().equalsIgnoreCase(diemDi))
                .filter(cb -> cb.getDiemDen().equalsIgnoreCase(diemDen))
                .filter(cb -> cb.getThoiGianDi().toLocalDate().equals(ngayDi))
                .collect(Collectors.toList());

        if (ketQuaTimKiem.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy chuyến bay nào phù hợp.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

        // Cập nhật thông tin tìm kiếm trên panel kết quả
        panelKetQuaTimKiem.getjL_diaDiem().setText(diemDi + " -> " + diemDen);
        panelKetQuaTimKiem.getjL_thoiGian().setText("Ngày: " + ngayDi.toString());

        // Hiển thị kết quả lên bảng
        DefaultTableModel model = (DefaultTableModel) panelKetQuaTimKiem.getJTable_KetQua().getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        for (ChuyenBay cb : ketQuaTimKiem) {
            Object[] row = new Object[]{
                cb.getSoHieuChuyenBay(),
                quanLy.timMayBay(cb.getSoHieuMayBay()).getMaHang(),
                cb.getThoiGianDi().toLocalTime(),
                cb.getThoiGianDen().toLocalTime(),
                String.format("%,.0f VNĐ", cb.getGiaPhoThong()),
                String.format("%,.0f VNĐ", cb.getGiaThuongGia())
            };
            model.addRow(row);
        }
    }

    private void datVe() {
        ChuyenBay cb = panelThongTinDatVe.getChuyenBayHienTai();
        if (cb != null) {
            String hangVe = (String) panelThongTinDatVe.getjComboBox_hangVe().getSelectedItem();
            VeMayBay.HangVe hangVeEnum = hangVe.equals("Phổ thông") ? VeMayBay.HangVe.PHO_THONG : VeMayBay.HangVe.THUONG_GIA;

            quanLy.datVe(taiKhoanDangNhap.getCccd(), cb.getSoHieuChuyenBay(), hangVeEnum);

            JOptionPane.showMessageDialog(this, "Đặt vé thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            hienThiVeCuaToi();
            cardLayout.show(mainContentPanel, "veCuaToi");
            pack();
            setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin chuyến bay đã chọn. Vui lòng quay lại màn hình tìm kiếm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void hienThiVeCuaToi() {
        panelVeCuaToi.loadDataToTable(quanLy, taiKhoanDangNhap.getCccd());
    }
}
