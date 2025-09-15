package view;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import model.ChuyenBay;
import model.HangHangKhong;
import model.MayBay;
import model.QuanLyChung;
import model.TaiKhoan;

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

    public Frame_Admin(QuanLyChung quanLy, TaiKhoan taiKhoan) {
        this.quanLy = quanLy;
        this.taiKhoanDangNhap = taiKhoan;
        initComponents();
        headerWrapperPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        headerWrapperPanel.setBorder(null);
        mainContentPanel.setBorder(null);
        setupAllPanelsAndEvents();
        pack();
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
        panelChuyenBay = new view.PanelChuyenBay_Admin();
        panelHangHangKhong = new view.PanelHangHangKhong_Admin();
        panelMayBay = new view.PanelMayBay_Admin();
        panelTaiKhoan = new view.PanelTaiKhoan_Admin();
        panelThongKe = new view.PanelThongKe_Admin();
        panelVeMayBay = new view.PanelVeMayBay_Admin();
        panelHanhKhach = new view.PanelHanhKhach_Admin();
        panelVeMayBay.setQuanLy(this.quanLy);
        // Thêm các panel chức năng vào CardLayout
        mainContentPanel.add(panelChuyenBay, "quanLyChuyenBay");
        mainContentPanel.add(panelHangHangKhong, "quanLyHangHangKhong");
        mainContentPanel.add(panelMayBay, "quanLyMayBay");
        mainContentPanel.add(panelTaiKhoan, "quanLyTaiKhoan");
        mainContentPanel.add(panelThongKe, "thongKe");
        mainContentPanel.add(panelHanhKhach, "quanLyHanhKhach");
        mainContentPanel.add(panelVeMayBay, "quanLyVe");

        // Hiển thị màn hình quản lý chuyến bay đầu tiên
        cardLayout.show(mainContentPanel, "quanLyChuyenBay");
        panelChuyenBay.loadSoHieuMayBay(quanLy);
        panelChuyenBay.loadDataToTable(chuyenBayToArray(quanLy.getDanhSachChuyenBay()));
        // Gắn các sự kiện cho các nút trên header và các panel con
        setupHeaderEvents();
        setupChuyenBayEvents();
        setupHangHangKhongEvents();
        setupMayBayEvents();
        setupTaiKhoanEvents();
        setupThongKeEvents();
        setupHanhKhachEvents();
        setupVeMayBayEvents();
    }

    //Panel Header
    private void setupHeaderEvents() {
        panelHeader.getjB_qlChuyenBay().addActionListener(e -> {
            panelChuyenBay.loadSoHieuMayBay(quanLy);
            panelChuyenBay.loadDataToTable(chuyenBayToArray(quanLy.getDanhSachChuyenBay()));
            cardLayout.show(mainContentPanel, "quanLyChuyenBay");
        });

        panelHeader.getjB_qlHang().addActionListener(e -> {
            panelHangHangKhong.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyHangHangKhong");
        });

        panelHeader.getjB_qlMayBay().addActionListener(e -> {
            panelMayBay.loadMaHang(quanLy);
            panelMayBay.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyMayBay");
        });

        panelHeader.getjB_qlTaiKhoan().addActionListener(e -> {
            panelTaiKhoan.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyTaiKhoan");
        });

        panelHeader.getjB_thongKe().addActionListener(e -> {
            panelThongKe.loadComboBoxes(quanLy);
            cardLayout.show(mainContentPanel, "thongKe");
        });

        panelHeader.getjB_dangXuat().addActionListener(e -> {
            this.dispose();
            new DangNhapFrame().setVisible(true);
        });

        // Sự kpanelHeader_Admin1 Đổi mật khẩu
        panelHeader.getjB_doiMatKhau().addActionListener(e -> {
            // Tạo và hiển thị Frame đổi mật khẩu
            // Truyền vào đối tượng quanLy và taiKhoan hiện tại
            ThayDoiMatKhauFrame doiMKFrame = new ThayDoiMatKhauFrame(quanLy, taiKhoanDangNhap, this);
            doiMKFrame.setVisible(true);
        });

        // Sự kiện cho nút Sửa thông tin
        panelHeader.getjB_suaThongTin().addActionListener(e -> {
            // Tạo và hiển thị Frame sửa thông tin
            ThayDoiThongTinFrame doiTTFrame = new ThayDoiThongTinFrame(quanLy, taiKhoanDangNhap, this);
            doiTTFrame.setVisible(true);
        });

        // Sự kiện cho nút Quản lý Hành khách
        panelHeader.getjB_qlHanhKhach().addActionListener(e -> {
            panelHanhKhach.loadDataToTable(quanLy);
            cardLayout.show(mainContentPanel, "quanLyHanhKhach");
        });
        // Sự kiện cho nút Quản lý Vé
        panelHeader.getjB_qlVe().addActionListener(e -> {
            panelVeMayBay.loadSoHieuChuyenBay(quanLy); // Nạp danh sách chuyến bay vào combobox
            panelVeMayBay.loadDataToTable(quanLy); // Nạp dữ liệu vé vào bảng
            cardLayout.show(mainContentPanel, "quanLyVe");
        });
    }

    //Panel Hang
    private void setupHangHangKhongEvents() {
        panelHangHangKhong.getjB_them().addActionListener(e -> {
            HangHangKhong hhk = panelHangHangKhong.getDataFromFields();
            if (hhk != null) {
                quanLy.themHang(hhk);
                panelHangHangKhong.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Thêm hãng hàng không thành công!");
                panelHangHangKhong.clearFields();
            }
        });
        panelHangHangKhong.getjB_sua().addActionListener(e -> {
            HangHangKhong hhk = panelHangHangKhong.getDataFromFields();
            if (hhk != null) {
                quanLy.suaHang(hhk);
                panelHangHangKhong.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Sửa hãng hàng không thành công!");
                panelHangHangKhong.clearFields();
            }
        });
        panelHangHangKhong.getjB_xoa().addActionListener(e -> {
            String maHang = panelHangHangKhong.getjT_maHang().getText();
            if (maHang != null && !maHang.isEmpty()) {
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa hãng '" + maHang + "' không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    quanLy.xoaHang(maHang);
                    panelHangHangKhong.loadDataToTable(quanLy);
                    JOptionPane.showMessageDialog(this, "Xóa hãng hàng không thành công!");
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
                panelMayBay.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Thêm máy bay thành công!");
                panelMayBay.clearFields();
            }
        });
        panelMayBay.getjB_sua().addActionListener(e -> {
            MayBay mb = panelMayBay.getDataFromFields();
            if (mb != null) {
                quanLy.suaMayBay(mb);
                panelMayBay.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Sửa máy bay thành công!");
                panelMayBay.clearFields();
            }
        });
        panelMayBay.getjB_xoa().addActionListener(e -> {
            String soHieu = panelMayBay.getjT_soHieuMB().getText();
            if (soHieu != null && !soHieu.isEmpty()) {
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa máy bay '" + soHieu + "' không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    quanLy.xoaMayBay(soHieu);
                    panelMayBay.loadDataToTable(quanLy);
                    JOptionPane.showMessageDialog(this, "Xóa máy bay thành công!");
                    panelMayBay.clearFields();
                }
            }
        });
        panelMayBay.getjB_lamMoi().addActionListener(e -> {
            panelMayBay.clearFields();
        });
    }

    //Panel Chuyến bay
    private void setupChuyenBayEvents() {
        panelChuyenBay.getjB_them().addActionListener(e -> {
            ChuyenBay cb = panelChuyenBay.getDataFromFields();
            if (cb != null) {
                quanLy.themChuyenBay(cb);
                panelChuyenBay.loadDataToTable(chuyenBayToArray(quanLy.getDanhSachChuyenBay()));
                JOptionPane.showMessageDialog(this, "Thêm chuyến bay thành công!");
                panelChuyenBay.clearFields();
            }
        });
        panelChuyenBay.getjB_sua().addActionListener(e -> {
            ChuyenBay cb = panelChuyenBay.getDataFromFields();
            if (cb != null) {
                quanLy.suaChuyenBay(cb);
                panelChuyenBay.loadDataToTable(chuyenBayToArray(quanLy.getDanhSachChuyenBay()));
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
                    panelChuyenBay.loadDataToTable(chuyenBayToArray(quanLy.getDanhSachChuyenBay()));
                    JOptionPane.showMessageDialog(this, "Xóa chuyến bay thành công!");
                    panelChuyenBay.clearFields();
                }
            }
        });
        panelChuyenBay.getjB_lamMoi().addActionListener(e -> {
            panelChuyenBay.clearFields();
        });
    }

    //Panel Vé máy bay
    private void setupVeMayBayEvents() {
        panelVeMayBay.getjB_lamMoi().addActionListener(e -> {
            panelVeMayBay.clearFields();
        });
    }

    //Panel Hanh khach
    private void setupHanhKhachEvents() {
        panelHanhKhach.getjB_lamMoi().addActionListener(e -> {
            panelHanhKhach.clearFields();
        });
    }

    //Panel Thong ke
    private void setupThongKeEvents() {
        panelThongKe.getjB_thongKe().addActionListener(e -> {
            panelThongKe.thongKeDoanhThu(quanLy);
        });
    }

    //Panel Tai khoan
    private void setupTaiKhoanEvents() {
        panelTaiKhoan.getjB_them().addActionListener(e -> {
            TaiKhoan tk = panelTaiKhoan.getDataFromFields();
            if (tk != null) {
                quanLy.themTaiKhoan(tk);
                panelTaiKhoan.loadDataToTable(quanLy);
                JOptionPane.showMessageDialog(this, "Thêm tài khoản thành công!");
                panelTaiKhoan.clearFields();
            }
        });
        panelTaiKhoan.getjB_sua().addActionListener(e -> {
            TaiKhoan tk = panelTaiKhoan.getDataFromFields();
            if (tk != null) {
                quanLy.suaTaiKhoan(tk);
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
                    panelTaiKhoan.loadDataToTable(quanLy);
                    JOptionPane.showMessageDialog(this, "Xóa tài khoản thành công!");
                    panelTaiKhoan.clearFields();
                }
            }
        });
        panelTaiKhoan.getjB_lamMoi().addActionListener(e -> {
            panelTaiKhoan.clearFields();
        });
    }

    private Object[][] chuyenBayToArray(List<ChuyenBay> list) {
        Object[][] data = new Object[list.size()][12];
        for (int i = 0; i < list.size(); i++) {
            ChuyenBay cb = list.get(i);
            int soVeDaBan = cb.getSoVeDaBan();
            int soVeConLai = cb.tongSoCho() - soVeDaBan;
            data[i][0] = cb.getSoHieuChuyenBay();
            data[i][1] = cb.getSoHieuMayBay();
            data[i][2] = cb.getDiemDi();
            data[i][3] = cb.getDiemDen();
            data[i][4] = cb.getThoiGianDi();
            data[i][5] = cb.getThoiGianDen();
            data[i][6] = cb.getSoPhoThong();
            data[i][7] = cb.getSoThuongGia();
            data[i][8] = cb.getGiaPhoThong();
            data[i][9] = cb.getGiaThuongGia();
            data[i][10] = soVeDaBan;
            data[i][11] = soVeConLai;
        }
        return data;
    }
}
