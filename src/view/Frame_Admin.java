package view;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import model.ChuyenBay;
import model.HangHangKhong;
import model.HanhKhach;
import model.MayBay;
import model.QuanLyChung;
import model.TaiKhoan;
import model.VeMayBay;

public class Frame_Admin extends javax.swing.JFrame {

    private CardLayout cardLayout;

    private view.PanelChuyenBay_Admin panelChuyenBay;
    private view.PanelHangHangKhong_Admin panelHangHangKhong;
    private view.PanelTaiKhoan_Admin panelTaiKhoan;
    private view.PanelThongKe_Admin panelThongKe;
    private view.PanelMayBay_Admin panelMayBay;
    private view.PanelVeMayBay_Admin panelVeMayBay;
    private view.PanelHanhKhach_Admin panelHanhKhach;
    private QuanLyChung quanLy;
    private TaiKhoan taiKhoanDangNhap;
    private ThayDoiMatKhauFrame thayDoiMatKhauFrame;
    private ThayDoiThongTinFrame thayDoiThongTinFrame;
    private DashboardThongKeVeFrame dashboardFrame;

    public Frame_Admin(QuanLyChung quanLy, TaiKhoan taiKhoan) {
        this.quanLy = quanLy;
        this.taiKhoanDangNhap = taiKhoan;
        initComponents();
        headerWrapperPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        headerWrapperPanel.setBorder(null);
        mainContentPanel.setBorder(null);
        setupAllPanelsAndEvents();
//        pack();
        setSize(1000, 700);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerWrapperPanel = new javax.swing.JPanel();
        panelHeader = new view.PanelHeader_Admin();
        mainContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout headerWrapperPanelLayout = new javax.swing.GroupLayout(headerWrapperPanel);
        headerWrapperPanel.setLayout(headerWrapperPanelLayout);
        headerWrapperPanelLayout.setHorizontalGroup(
            headerWrapperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerWrapperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerWrapperPanelLayout.setVerticalGroup(
            headerWrapperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerWrapperPanelLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(headerWrapperPanel, java.awt.BorderLayout.PAGE_START);

        mainContentPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(mainContentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerWrapperPanel;
    private javax.swing.JPanel mainContentPanel;
    private view.PanelHeader_Admin panelHeader;
    // End of variables declaration//GEN-END:variables
    private void setupAllPanelsAndEvents() {
        cardLayout = new CardLayout();
        mainContentPanel.setLayout(cardLayout);

        // Khởi tạo các panel chức năng
        panelChuyenBay = new PanelChuyenBay_Admin();
        panelHangHangKhong = new PanelHangHangKhong_Admin();
        panelMayBay = new PanelMayBay_Admin();
        panelTaiKhoan = new PanelTaiKhoan_Admin();
        panelThongKe = new PanelThongKe_Admin();
        panelVeMayBay = new PanelVeMayBay_Admin();
        panelHanhKhach = new PanelHanhKhach_Admin();

        // Thêm các panel chức năng vào CardLayout
        mainContentPanel.add(panelChuyenBay, "quanLyChuyenBay");
        mainContentPanel.add(panelHangHangKhong, "quanLyHangHangKhong");
        mainContentPanel.add(panelMayBay, "quanLyMayBay");
        mainContentPanel.add(panelTaiKhoan, "quanLyTaiKhoan");
        mainContentPanel.add(panelThongKe, "thongKe");
        mainContentPanel.add(panelHanhKhach, "quanLyHanhKhach");
        mainContentPanel.add(panelVeMayBay, "quanLyVe");

        // Gắn các sự kiện
        setupHeaderEvents();
        setupChuyenBayEvents();
        setupHangHangKhongEvents();
        setupMayBayEvents();
        setupTaiKhoanEvents();
        setupThongKeEvents();
        setupHanhKhachEvents();
        setupVeMayBayEvents();

        // Hiển thị màn hình quản lý chuyến bay đầu tiên
        cardLayout.show(mainContentPanel, "quanLyChuyenBay");
        panelChuyenBay.loadDataToTable(quanLy); // Nạp dữ liệu lần đầu
    }

    //Panel Header
    private void setupHeaderEvents() {
        panelHeader.getjB_qlChuyenBay().addActionListener(e -> {
            panelChuyenBay.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyChuyenBay");
        });

        panelHeader.getjB_qlHang().addActionListener(e -> {
            panelHangHangKhong.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyHangHangKhong");
        });

        panelHeader.getjB_qlMayBay().addActionListener(e -> {
            panelMayBay.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyMayBay");
        });

        panelHeader.getjB_qlTaiKhoan().addActionListener(e -> {
            panelTaiKhoan.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyTaiKhoan");
        });

        panelHeader.getjB_qlHanhKhach().addActionListener(e -> {
            panelHanhKhach.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyHanhKhach");
        });

        panelHeader.getjB_qlVe().addActionListener(e -> {
            panelVeMayBay.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyVe");
        });

        panelHeader.getjB_thongKe().addActionListener(e -> {
            panelThongKe.loadComboBoxes(quanLy);
            cardLayout.show(mainContentPanel, "thongKe");
        });

        panelHeader.getjB_dangXuat().addActionListener(e -> {
            this.dispose();
            new DangNhapFrame().setVisible(true);
        });

        panelHeader.getjB_doiMatKhau().addActionListener(e -> {
            if (thayDoiMatKhauFrame == null || !thayDoiMatKhauFrame.isShowing()) {
                thayDoiMatKhauFrame = new ThayDoiMatKhauFrame(quanLy, taiKhoanDangNhap, this);
                thayDoiMatKhauFrame.setVisible(true);
            } else {
                thayDoiMatKhauFrame.toFront();
            }
        });

        panelHeader.getjB_suaThongTin().addActionListener(e -> {
            if (thayDoiThongTinFrame == null || !thayDoiThongTinFrame.isShowing()) {
                thayDoiThongTinFrame = new ThayDoiThongTinFrame(quanLy, taiKhoanDangNhap, this);
                thayDoiThongTinFrame.setVisible(true);
            } else {
                thayDoiThongTinFrame.toFront();
            }
        });
    }

    //Panel Hang
    private void setupHangHangKhongEvents() {
        panelHangHangKhong.getjB_them().addActionListener(e -> {
            HangHangKhong hhk = panelHangHangKhong.getDataFromFields();
            if (hhk != null) {
                // KIỂM TRA THÊM: Mã hãng đã tồn tại hay chưa
                if (quanLy.timHang(hhk.getMaHang()) != null) {
                    JOptionPane.showMessageDialog(this, "Mã hãng '" + hhk.getMaHang() + "' đã tồn tại. Vui lòng nhập mã khác.", "Lỗi trùng lặp", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Chỉ thêm khi mã hãng chưa tồn tại
                    quanLy.themHang(hhk);
                    quanLy.luuToanBoDuLieuVaoFile();
                    panelHangHangKhong.loadDataToTable(quanLy);
                    panelMayBay.loadMaHang(quanLy);
                    JOptionPane.showMessageDialog(this, "Thêm hãng thành công!");
                    panelHangHangKhong.clearFields();
                }
            }
        });
        panelHangHangKhong.getjB_sua().addActionListener(e -> {
            HangHangKhong hhk = panelHangHangKhong.getDataFromFields();
            if (hhk != null) {
                quanLy.suaHang(hhk);
                quanLy.luuToanBoDuLieuVaoFile();
                panelHangHangKhong.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Sửa hãng thành công!");
                panelHangHangKhong.clearFields();
            }
        });
        panelHangHangKhong.getjB_xoa().addActionListener(e -> {
            String maHang = panelHangHangKhong.getjT_maHang().getText();
            if (maHang != null && !maHang.isEmpty()) {
                // Kiểm tra ràng buộc trước khi xóa
                boolean hangCoMayBay = quanLy.getDanhSachMayBay().stream().anyMatch(mb -> mb.getMaHang().equals(maHang));

                if (hangCoMayBay) {
                    JOptionPane.showMessageDialog(this,
                            "Không thể xóa hãng '" + maHang + "' vì vẫn còn máy bay thuộc hãng này.\n"
                            + "Vui lòng xóa hoặc di chuyển các máy bay liên quan trước.",
                            "Lỗi ràng buộc dữ liệu",
                            JOptionPane.ERROR_MESSAGE);
                    return; // Dừng hành động xóa
                }

                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa hãng '" + maHang + "' không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    quanLy.xoaHang(maHang);
                    quanLy.luuToanBoDuLieuVaoFile();
                    panelHangHangKhong.loadDataToTable(quanLy);
                    panelMayBay.loadMaHang(quanLy);
                    JOptionPane.showMessageDialog(this, "Xóa hãng thành công!");
                    panelHangHangKhong.clearFields();
                }
            }
        });
        panelHangHangKhong.getjB_lamMoi().addActionListener(e -> {
            panelHangHangKhong.clearFields();
        });
    }

    //Panel May bay
    private void setupMayBayEvents() {
        panelMayBay.getjB_them().addActionListener(e -> {
            MayBay mb = panelMayBay.getDataFromFields();
            if (mb != null) {
                quanLy.themMayBay(mb);
                quanLy.luuToanBoDuLieuVaoFile();
                panelMayBay.loadDataToTable(quanLy);
                panelChuyenBay.loadSoHieuMayBay(quanLy);
                JOptionPane.showMessageDialog(this, "Thêm máy bay thành công!");
                panelMayBay.clearFields();
            }
        });
        panelMayBay.getjB_sua().addActionListener(e -> {
            MayBay mb = panelMayBay.getDataFromFields();
            if (mb != null) {
                quanLy.suaMayBay(mb);
                quanLy.luuToanBoDuLieuVaoFile();
                panelMayBay.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Sửa máy bay thành công!");
                panelMayBay.clearFields();
            }
        });
        panelMayBay.getjB_xoa().addActionListener(e -> {
            String soHieu = panelMayBay.getjT_soHieuMB().getText();
            if (soHieu != null && !soHieu.isEmpty()) {

                boolean mayBayCoChuyenBay = quanLy.getDanhSachChuyenBay().stream().anyMatch(cb -> cb.getSoHieuMayBay().equals(soHieu));
                if (mayBayCoChuyenBay) {
                    JOptionPane.showMessageDialog(this,
                            "Không thể xóa máy bay '" + soHieu + "' vì vẫn còn chuyến bay thuộc máy bay này.\n"
                            + "Vui lòng xóa hoặc di chuyển các chuyến bay liên quan trước.",
                            "Lỗi ràng buộc dữ liệu",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa máy bay '" + soHieu + "' không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    quanLy.xoaMayBay(soHieu);
                    quanLy.luuToanBoDuLieuVaoFile();
                    panelMayBay.loadDataToTable(quanLy);
                    panelChuyenBay.loadSoHieuMayBay(quanLy);
                    panelChuyenBay.loadSoHieuMayBay(quanLy); // Cập nhật combobox
                    JOptionPane.showMessageDialog(this, "Xóa máy bay thành công!");
                    panelMayBay.clearFields();
                }
            }
        });
        panelMayBay.getjB_lamMoi().addActionListener(e -> {
            panelMayBay.clearFields();
        });

        panelMayBay.getjB_xuatExcel().addActionListener(e -> {
            // Gọi phương thức dùng chung để lấy đường dẫn
            String filePath = layDuongDanLuuFileExcel();

            // Nếu người dùng có chọn file (filePath không phải là null)
            if (filePath != null) {
                try {
                    List<MayBay> data = panelMayBay.getFilteredList();
                    util.ExcelUtil.xuatFileExcelMayBay(data, filePath);
                    JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!\nĐã lưu tại: " + filePath, "Thành công", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi xuất file: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    //Panel Chuyến bay
    private void setupChuyenBayEvents() {
        panelChuyenBay.getjB_them().addActionListener(e -> {
            ChuyenBay cb = panelChuyenBay.getDataFromFields();
            if (cb != null) {
                quanLy.themChuyenBay(cb);
                quanLy.luuToanBoDuLieuVaoFile();
                panelChuyenBay.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Thêm chuyến bay thành công!");
                panelChuyenBay.clearFields();
            }
        });
        panelChuyenBay.getjB_sua().addActionListener(e -> {
            ChuyenBay cb = panelChuyenBay.getDataFromFields();
            if (cb != null) {
                quanLy.suaChuyenBay(cb);
                quanLy.luuToanBoDuLieuVaoFile();
                panelChuyenBay.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Sửa chuyến bay thành công!");
                panelChuyenBay.clearFields();
            }
        });
        panelChuyenBay.getjB_xoa().addActionListener(e -> {
            String soHieu = panelChuyenBay.getjT_soHieuCB().getText();
            if (soHieu != null && !soHieu.isEmpty()) {
                int choice = JOptionPane.showConfirmDialog(
                        this,
                        "Bạn có chắc chắn muốn xóa chuyến bay '" + soHieu + "' không?",
                        "Xác nhận xóa",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );

                // Chỉ thực hiện xóa nếu người dùng chọn "Yes"
                if (choice == JOptionPane.YES_OPTION) {
                    quanLy.xoaChuyenBay(soHieu);
                    quanLy.luuToanBoDuLieuVaoFile();
                    panelChuyenBay.loadDataToTable(quanLy);
                    JOptionPane.showMessageDialog(this, "Xóa chuyến bay thành công!");
                    panelChuyenBay.clearFields();
                }
            }
        });
        panelChuyenBay.getjB_lamMoi().addActionListener(e -> {
            panelChuyenBay.clearFields();
        });
        panelChuyenBay.getjB_xemVeConLai().addActionListener(e -> {
            // KIỂM TRA: Nếu cửa sổ chưa được tạo HOẶC đã bị đóng
            if (dashboardFrame == null || !dashboardFrame.isShowing()) {
                // Thì mới tạo cửa sổ mới
                dashboardFrame = new DashboardThongKeVeFrame(this, quanLy);
                dashboardFrame.setVisible(true);
            } else {
                // Nếu cửa sổ đã tồn tại và đang hiển thị, chỉ cần đưa nó lên trên cùng
                dashboardFrame.toFront();
            }
        });

        panelChuyenBay.getjB_xuatExcel().addActionListener(e -> {
            // Gọi phương thức dùng chung để lấy đường dẫn
            String filePath = layDuongDanLuuFileExcel();

            // Nếu người dùng có chọn file (filePath không phải là null)
            if (filePath != null) {
                try {
                    List<ChuyenBay> data = panelChuyenBay.getFilteredList();
                    util.ExcelUtil.xuatFileExcelChuyenBay(data, filePath);
                    JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!\nĐã lưu tại: " + filePath, "Thành công", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi xuất file: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    //Panel Vé máy bay
    private void setupVeMayBayEvents() {
        // Sự kiện cho nút Sửa
        panelVeMayBay.getjB_sua().addActionListener(e -> {
            VeMayBay veSua = panelVeMayBay.getDataFromFields();
            if (veSua == null) {
                return;
            }

            try {
                // Lấy giá mới từ JTextField
                double giaMoi = Double.parseDouble(panelVeMayBay.getjT_giaVe().getText());

                // Cập nhật thông tin vé (chủ yếu là hạng vé)
                quanLy.suaVe(veSua);
                quanLy.luuToanBoDuLieuVaoFile();
                // Cập nhật giá của Chuyến bay tương ứng
                ChuyenBay cb = quanLy.timChuyenBay(veSua.getSoHieuChuyenBay());
                if (cb != null) {
                    if (veSua.getHangVe() == VeMayBay.HangVe.PHO_THONG) {
                        cb.setGiaPhoThong(giaMoi);
                    } else {
                        cb.setGiaThuongGia(giaMoi);
                    }
                    quanLy.suaChuyenBay(cb); // Lưu thay đổi giá của chuyến bay
                    quanLy.luuToanBoDuLieuVaoFile();
                }

                JOptionPane.showMessageDialog(this, "Cập nhật vé và giá chuyến bay thành công!");
                panelVeMayBay.loadDataToTable(quanLy);
                panelVeMayBay.clearFields();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Giá vé phải là một con số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Sự kiện cho nút Xóa
        panelVeMayBay.getjB_xoa().addActionListener(e -> {
            String maVe = panelVeMayBay.getjT_maVe().getText();
            if (maVe != null && !maVe.isEmpty()) {
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa vé '" + maVe + "' không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    quanLy.xoaVe(maVe);
                    quanLy.luuToanBoDuLieuVaoFile();
                    JOptionPane.showMessageDialog(this, "Xóa vé thành công!");
                    panelVeMayBay.loadDataToTable(quanLy);
                    panelVeMayBay.clearFields();
                }
            }
        });

        // Sự kiện cho nút Làm mới
        panelVeMayBay.getjB_lamMoi().addActionListener(e -> {
            panelVeMayBay.clearFields();
        });

        // Sự kiện cho nút Thêm (chỉ thông báo)
        panelVeMayBay.getjB_them().addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Chức năng Thêm vé chỉ nên thực hiện khi có thông tin Hành khách. Vui lòng đặt vé từ giao diện User.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        });
        //Xuất file Excel
        panelVeMayBay.getjB_xuatExcel().addActionListener(e -> {
            // Gọi phương thức dùng chung để lấy đường dẫn
            String filePath = layDuongDanLuuFileExcel();

            // Nếu người dùng có chọn file (filePath không phải là null)
            if (filePath != null) {
                try {
                    List<VeMayBay> data = panelVeMayBay.getFilteredList();
                    util.ExcelUtil.xuatFileExcelVeMayBay(data, quanLy, filePath);
                    JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!\nĐã lưu tại: " + filePath, "Thành công", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi xuất file: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    //Panel Hanh khach
    private void setupHanhKhachEvents() {
        // Sự kiện cho nút Thêm
//        panelHanhKhach.getjB_them().addActionListener(e -> {
//            HanhKhach hk = panelHanhKhach.getDataFromFields();
//            if (hk != null) {
//                if (quanLy.timHanhKhach(hk.getCccd()) != null) {
//                    JOptionPane.showMessageDialog(this, "CCCD đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//                } else {
//                    quanLy.themHanhKhach(hk);
//                    panelHanhKhach.loadDataToTable(quanLy); // Cập nhật lại bảng
//                    JOptionPane.showMessageDialog(this, "Thêm hành khách thành công!");
//                    panelHanhKhach.clearFields();
//                }
//            }
//        });
//
//        // Sự kiện cho nút Sửa
//        panelHanhKhach.getjB_sua().addActionListener(e -> {
//            HanhKhach hk = panelHanhKhach.getDataFromFields();
//            if (hk != null) {
//                quanLy.suaHanhKhach(hk);
//                panelHanhKhach.loadDataToTable(quanLy);
//                JOptionPane.showMessageDialog(this, "Sửa thông tin hành khách thành công!");
//                panelHanhKhach.clearFields();
//            }
//        });
//
//        // Sự kiện cho nút Xóa
//        panelHanhKhach.getjB_xoa().addActionListener(e -> {
//            String cccd = panelHanhKhach.getjT_soCCCD().getText();
//            if (!cccd.isEmpty()) {
//                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa hành khách này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
//                if (choice == JOptionPane.YES_OPTION) {
//                    quanLy.xoaHanhKhach(cccd);
//                    panelHanhKhach.loadDataToTable(quanLy);
//                    JOptionPane.showMessageDialog(this, "Xóa hành khách thành công!");
//                    panelHanhKhach.clearFields();
//                }
//            }
//        });

        // Sự kiện cho nút Làm mới
        panelHanhKhach.getjB_lamMoi().addActionListener(e -> {
            panelHanhKhach.loadDataToTable(quanLy);
            panelHanhKhach.clearFields();
            JOptionPane.showMessageDialog(this, "Đã làm mới danh sách hành khách!");
        });
        //Xuất file Excel
        panelHanhKhach.getjB_xuatExcel().addActionListener(e -> {
            // Gọi phương thức dùng chung để lấy đường dẫn
            String filePath = layDuongDanLuuFileExcel();

            // Nếu người dùng có chọn file (filePath không phải là null)
            if (filePath != null) {
                try {
                    List<HanhKhach> data = panelHanhKhach.getFilteredList();
                    util.ExcelUtil.xuatFileExcelHanhKhach(data, filePath);
                    JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!\nĐã lưu tại: " + filePath, "Thành công", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi xuất file: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    //Panel Thong ke
    private void setupThongKeEvents() {
        panelThongKe.getjB_thongKe().addActionListener(e -> {
            panelThongKe.thongKeDoanhThu(quanLy);
            JOptionPane.showMessageDialog(this, "Đã làm mới danh sách hành khách!");
        });
    }

    //Panel Tai khoan
    private void setupTaiKhoanEvents() {
        panelTaiKhoan.getjB_them().addActionListener(e -> {
            TaiKhoan tk = panelTaiKhoan.getDataFromFields();
            if (tk != null) {
                quanLy.themTaiKhoan(tk);
                quanLy.luuToanBoDuLieuVaoFile();
                panelTaiKhoan.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Thêm tài khoản thành công!");
                panelTaiKhoan.clearFields();
            }
        });
        panelTaiKhoan.getjB_sua().addActionListener(e -> {
            TaiKhoan tk = panelTaiKhoan.getDataFromFields();
            if (tk != null) {
                quanLy.suaTaiKhoan(tk);
                quanLy.luuToanBoDuLieuVaoFile();
                panelTaiKhoan.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Sửa tài khoản thành công!");
                panelTaiKhoan.clearFields();
            }
        });
        panelTaiKhoan.getjB_xoa().addActionListener(e -> {
            String tenDangNhap = panelTaiKhoan.getjT_dangNhap().getText();
            if (tenDangNhap != null && !tenDangNhap.isEmpty()) {
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa tài khoản '" + tenDangNhap + "' không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    quanLy.xoaTaiKhoan(tenDangNhap);
                    quanLy.luuToanBoDuLieuVaoFile();
                    panelTaiKhoan.loadDataToTable(quanLy);
                    JOptionPane.showMessageDialog(this, "Xóa tài khoản thành công!");
                    panelTaiKhoan.clearFields();
                }
            }
        });
        panelTaiKhoan.getjB_lamMoi().addActionListener(e -> {
            panelTaiKhoan.clearFields();
        });
        panelTaiKhoan.getjB_xuatExcel().addActionListener(e -> {
            // Gọi phương thức dùng chung để lấy đường dẫn
            String filePath = layDuongDanLuuFileExcel();

            // Nếu người dùng có chọn file (filePath không phải là null)
            if (filePath != null) {
                try {
                    List<TaiKhoan> data = panelTaiKhoan.getFilteredList();
                    util.ExcelUtil.xuatFileExcelTaiKhoan(data, filePath);
                    JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!\nĐã lưu tại: " + filePath, "Thành công", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi xuất file: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private String layDuongDanLuuFileExcel() {
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        fileChooser.setDialogTitle("Chọn nơi lưu file Excel");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Excel Files (*.xlsx)", "xlsx"));

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            // Tự động thêm đuôi .xlsx nếu cần
            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }
            return filePath;
        }

        // Trả về null nếu người dùng không chọn file
        return null;
    }
//    private Object[][] chuyenBayToArray(List<ChuyenBay> list) {
//        Object[][] data = new Object[list.size()][12];
//        for (int i = 0; i < list.size(); i++) {
//            ChuyenBay cb = list.get(i);
//            int soVeDaBan = cb.getSoVeDaBan();
//            int soVeConLai = cb.tongSoCho() - soVeDaBan;
//            data[i][0] = cb.getSoHieuChuyenBay();
//            data[i][1] = cb.getSoHieuMayBay();
//            data[i][2] = cb.getDiemDi();
//            data[i][3] = cb.getDiemDen();
//            data[i][4] = cb.getThoiGianDi();
//            data[i][5] = cb.getThoiGianDen();
//            data[i][6] = cb.getSoPhoThong();
//            data[i][7] = cb.getSoThuongGia();
//            data[i][8] = cb.getGiaPhoThong();
//            data[i][9] = cb.getGiaThuongGia();
//            data[i][10] = soVeDaBan;
//            data[i][11] = soVeConLai;
//        }
//        return data;
}
