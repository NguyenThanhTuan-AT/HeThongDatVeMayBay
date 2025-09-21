package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import util.FileIOUtil;

public class QuanLyChung {

    private Map<String, ChuyenBay> mapChuyenBay;
    private Map<String, VeMayBay> mapVe;
    private Map<String, HanhKhach> mapHanhKhach;
    private Map<String, HangHangKhong> mapHang;
    private Map<String, MayBay> mapMayBay;
    private Map<String, TaiKhoan> mapTaiKhoan;

    private int lastVeId;

    public QuanLyChung() {
        // Đọc dữ liệu từ các file
        List<ChuyenBay> listChuyenBay = FileIOUtil.docTuFile("chuyenbay.json", ChuyenBay.class);
        List<VeMayBay> listVe = FileIOUtil.docTuFile("ve.json", VeMayBay.class);
        List<HanhKhach> listHanhKhach = FileIOUtil.docTuFile("hanhkhach.json", HanhKhach.class);
        List<HangHangKhong> listHang = FileIOUtil.docTuFile("hang.json", HangHangKhong.class);
        List<MayBay> listMayBay = FileIOUtil.docTuFile("maybay.json", MayBay.class);
        List<TaiKhoan> listTaiKhoan = FileIOUtil.docTuFile("taikhoan.json", TaiKhoan.class);

        // Chuyển từ List sang Map để tối ưu tốc độ truy vấn
        mapChuyenBay = listChuyenBay.stream().collect(Collectors.toMap(ChuyenBay::getSoHieuChuyenBay, cb -> cb, (oldValue, newValue) -> oldValue, HashMap::new));
        mapVe = listVe.stream().collect(Collectors.toMap(VeMayBay::getMaVe, ve -> ve, (oldValue, newValue) -> oldValue, HashMap::new));
        mapHanhKhach = listHanhKhach.stream().collect(Collectors.toMap(HanhKhach::getCccd, hk -> hk, (oldValue, newValue) -> oldValue, HashMap::new));
        mapHang = listHang.stream().collect(Collectors.toMap(HangHangKhong::getMaHang, hhk -> hhk, (oldValue, newValue) -> oldValue, HashMap::new));
        mapMayBay = listMayBay.stream().collect(Collectors.toMap(MayBay::getSoHieuMayBay, mb -> mb, (oldValue, newValue) -> oldValue, HashMap::new));
        mapTaiKhoan = listTaiKhoan.stream().collect(Collectors.toMap(TaiKhoan::getTenDangNhap, tk -> tk, (oldValue, newValue) -> oldValue, HashMap::new));

        // Khởi tạo lastVeId để tạo mã vé không trùng lặp
        this.lastVeId = mapVe.keySet().stream()
                .mapToInt(maVe -> Integer.parseInt(maVe.replaceAll("[^0-9]", "")))
                .max()
                .orElse(0);

        dongBoDuLieu();
    }

    private void dongBoDuLieu() {
        for (VeMayBay ve : mapVe.values()) {
            ChuyenBay cb = mapChuyenBay.get(ve.getSoHieuChuyenBay());
            if (cb != null) {
                cb.themVe(ve);
            }
            HanhKhach hk = mapHanhKhach.get(ve.getCccdHanhKhach());
            if (hk != null) {
                hk.themMaVe(ve.getMaVe());
            }
        }

        for (MayBay mb : mapMayBay.values()) {
            HangHangKhong hhk = mapHang.get(mb.getMaHang());
            if (hhk != null) {
                hhk.themMayBay(mb);
            }
        }

        for (ChuyenBay cb : mapChuyenBay.values()) {
            MayBay mb = mapMayBay.get(cb.getSoHieuMayBay());
            if (mb != null) {
                HangHangKhong hhk = mapHang.get(mb.getMaHang());
                if (hhk != null) {
                    hhk.themChuyenBay(cb);
                }
            }
        }
    }

    // =============== QUẢN LÝ CHUYẾN BAY ===============
    public void themChuyenBay(ChuyenBay cb) {
        mapChuyenBay.put(cb.getSoHieuChuyenBay(), cb);
//        FileIOUtil.ghiVaoFile("chuyenbay.json", new ArrayList<>(mapChuyenBay.values()));
    }

    public void suaChuyenBay(ChuyenBay cbMoi) {
        ChuyenBay cbCu = timChuyenBay(cbMoi.getSoHieuChuyenBay());
        if (cbCu != null) {
            cbCu.capNhatThongTin(cbMoi);
//            FileIOUtil.ghiVaoFile("chuyenbay.json", new ArrayList<>(mapChuyenBay.values()));
        }
    }

    public void xoaChuyenBay(String soHieu) {
        ChuyenBay cb = timChuyenBay(soHieu);
        if (cb != null) {
            List<VeMayBay> veLienQuan = new ArrayList<>(cb.getDanhSachVe());
            for (VeMayBay ve : veLienQuan) {
                xoaVe(ve.getMaVe());
            }

            mapChuyenBay.remove(soHieu);
//            FileIOUtil.ghiVaoFile("chuyenbay.json", new ArrayList<>(mapChuyenBay.values()));
        }
    }

    public ChuyenBay timChuyenBay(String soHieu) {
        return mapChuyenBay.get(soHieu);
    }

    public List<ChuyenBay> locChuyenBayTheoNgay(LocalDate ngay) {
        return mapChuyenBay.values().stream()
                .filter(cb -> cb.getThoiGianDi() != null && cb.getThoiGianDi().toLocalDate().equals(ngay))
                .collect(Collectors.toList());
    }

    public List<ChuyenBay> locChuyenBayTheoHang(String maHang) {
        return mapChuyenBay.values().stream()
                .filter(cb -> {
                    MayBay mb = mapMayBay.get(cb.getSoHieuMayBay());
                    return mb != null && maHang.equals(mb.getMaHang());
                })
                .collect(Collectors.toList());
    }

    public List<ChuyenBay> locChuyenBayConTrongTheoNgay(LocalDate ngay) {
        return mapChuyenBay.values().stream()
                .filter(cb -> cb.getThoiGianDi() != null
                && cb.getThoiGianDi().toLocalDate().equals(ngay)
                && cb.getSoVeDaBan() < (cb.getSoPhoThong() + cb.getSoThuongGia()))
                .collect(Collectors.toList());
    }

    public List<ChuyenBay> locChuyenBayConTrongTheoKhoangGio(LocalDate ngay, int gioBatDau, int gioKetThuc) {
        return mapChuyenBay.values().stream()
                .filter(cb -> {
                    LocalDateTime tgDi = cb.getThoiGianDi();
                    return tgDi != null
                            && tgDi.toLocalDate().equals(ngay)
                            && tgDi.getHour() >= gioBatDau
                            && tgDi.getHour() <= gioKetThuc
                            && cb.getSoVeDaBan() < (cb.getSoPhoThong() + cb.getSoThuongGia());
                })
                .collect(Collectors.toList());
    }

    // ================= QUẢN LÝ VÉ ================
    private String taoMaVeMoi() {
        this.lastVeId++;
        return String.format("VE%03d", this.lastVeId);
    }

    public VeMayBay datVe(String cccd, String soHieuChuyenBay, VeMayBay.HangVe hangVe) {
        String maVeMoi = taoMaVeMoi();
        VeMayBay veMoi = new VeMayBay(maVeMoi, soHieuChuyenBay, hangVe, cccd);

        mapVe.put(maVeMoi, veMoi);
//        FileIOUtil.ghiVaoFile("ve.json", new ArrayList<>(mapVe.values()));

        ChuyenBay cb = timChuyenBay(soHieuChuyenBay);
        if (cb != null) {
            cb.themVe(veMoi);
        }

        HanhKhach hk = timHanhKhach(cccd);
        if (hk != null) {

            hk.themMaVe(maVeMoi);
            FileIOUtil.ghiVaoFile("hanhkhach.json", new ArrayList<>(mapHanhKhach.values()));
        }

        return veMoi;
    }

    public void themVe(VeMayBay ve, HanhKhach hk) {
        ChuyenBay cb = timChuyenBay(ve.getSoHieuChuyenBay());
        if (cb != null && cb.conChoTrong(ve.getHangVe())) {
            // Kiểm tra và thêm hành khách nếu chưa có
            if (timHanhKhach(hk.getCccd()) == null) {
                themHanhKhach(hk);
            }
            // Gắn CCCD của hành khách vào vé
            ve.setCccdHanhKhach(hk.getCccd());
            // Thêm mã vé vào danh sách của hành khách
            hk.themMaVe(ve.getMaVe());

            mapVe.put(ve.getMaVe(), ve);
            cb.themVe(ve);

//            FileIOUtil.ghiVaoFile("ve.json", new ArrayList<>(mapVe.values()));
//            FileIOUtil.ghiVaoFile("hanhkhach.json", new ArrayList<>(mapHanhKhach.values()));
            System.out.println("Thêm vé thành công!");
        } else {
            System.out.println("Chuyến bay không còn chỗ trống cho hạng vé này.");
        }
    }

    public void suaVe(VeMayBay veMoi) {
        VeMayBay veCu = timVe(veMoi.getMaVe());
        if (veCu != null) {
            veCu.capNhatThongTin(veMoi);
//            FileIOUtil.ghiVaoFile("ve.json", new ArrayList<>(mapVe.values()));
        }
    }

    public void xoaVe(String maVe) {
        VeMayBay veCanXoa = timVe(maVe);
        if (veCanXoa != null) {
            // SỬA LỖI: Xóa mã vé khỏi danh sách của Hành khách
            HanhKhach hk = timHanhKhach(veCanXoa.getCccdHanhKhach());
            if (hk != null) {
                hk.xoaMaVe(maVe);
//                FileIOUtil.ghiVaoFile("hanhkhach.json", new ArrayList<>(mapHanhKhach.values()));
            }

            ChuyenBay cb = timChuyenBay(veCanXoa.getSoHieuChuyenBay());
            if (cb != null) {
                cb.xoaVe(veCanXoa);
            }

            mapVe.remove(maVe);
//            FileIOUtil.ghiVaoFile("ve.json", new ArrayList<>(mapVe.values()));
        }
    }

    public VeMayBay timVe(String maVe) {
        return mapVe.get(maVe);
    }

    public List<VeMayBay> timVeTheoCccd(String cccd) {
        return mapVe.values().stream()
                .filter(ve -> ve.getCccdHanhKhach() != null && ve.getCccdHanhKhach().equals(cccd))
                .collect(Collectors.toList());
    }

    // ================= QUẢN LÝ THỐNG KÊ =============
    public double thongKeDoanhThuTheoThang(int thang, int nam) {
        return mapVe.values().stream()
                .filter(ve -> {
                    ChuyenBay cb = timChuyenBay(ve.getSoHieuChuyenBay());
                    return cb != null && cb.getThoiGianDi() != null
                            && cb.getThoiGianDi().getMonthValue() == thang
                            && cb.getThoiGianDi().getYear() == nam;
                })
                .mapToDouble(ve -> {
                    ChuyenBay cb = timChuyenBay(ve.getSoHieuChuyenBay());
                    return ve.getHangVe() == VeMayBay.HangVe.THUONG_GIA ? cb.getGiaThuongGia() : cb.getGiaPhoThong();
                })
                .sum();
    }

    public double thongKeDoanhThuTheoHang(String maHang, int thang, int nam) {
        return mapVe.values().stream()
                .filter(ve -> {
                    ChuyenBay cb = timChuyenBay(ve.getSoHieuChuyenBay());
                    if (cb == null) {
                        return false;
                    }
                    MayBay mb = mapMayBay.get(cb.getSoHieuMayBay());
                    return mb != null && maHang.equals(mb.getMaHang())
                            && cb.getThoiGianDi() != null
                            && cb.getThoiGianDi().getMonthValue() == thang
                            && cb.getThoiGianDi().getYear() == nam;
                })
                .mapToDouble(ve -> {
                    ChuyenBay cb = timChuyenBay(ve.getSoHieuChuyenBay());
                    return ve.getHangVe() == VeMayBay.HangVe.THUONG_GIA ? cb.getGiaThuongGia() : cb.getGiaPhoThong();
                })
                .sum();
    }

    // ================ QUẢN LÝ HÀNH KHÁCH =============
    public void themHanhKhach(HanhKhach hk) {
        mapHanhKhach.put(hk.getCccd(), hk);
//        FileIOUtil.ghiVaoFile("hanhkhach.json", new ArrayList<>(mapHanhKhach.values()));
    }

    public void suaHanhKhach(HanhKhach hkMoi) {
        HanhKhach hkCu = timHanhKhach(hkMoi.getCccd());
        if (hkCu != null) {
            hkCu.setHoTen(hkMoi.getHoTen()); // Giả định chỉ sửa họ tên
//            FileIOUtil.ghiVaoFile("hanhkhach.json", new ArrayList<>(mapHanhKhach.values()));
        }
    }

    public void xoaHanhKhach(String cccd) {
        HanhKhach hk = timHanhKhach(cccd);
        if (hk != null) {
            // Xóa tất cả vé liên quan
            new ArrayList<>(hk.getDanhSachMaVe()).forEach(this::xoaVe);
        }
        mapHanhKhach.remove(cccd);
//        FileIOUtil.ghiVaoFile("hanhkhach.json", new ArrayList<>(mapHanhKhach.values()));
    }

    public HanhKhach timHanhKhach(String cccd) {
        return mapHanhKhach.get(cccd);
    }

    public HanhKhach timHanhKhachTheoMaVe(String maVe) {
        VeMayBay ve = timVe(maVe);
        if (ve != null) {
            return timHanhKhach(ve.getCccdHanhKhach());
        }
        return null;
    }

    public List<HanhKhach> locHanhKhachTheoChuyenBay(String soHieu) {
        return mapVe.values().stream()
                .filter(ve -> ve.getSoHieuChuyenBay().equals(soHieu))
                .map(ve -> timHanhKhach(ve.getCccdHanhKhach()))
                .distinct()
                .collect(Collectors.toList());
    }

    public List<HanhKhach> locHanhKhachTheoNgay(LocalDate ngay) {
        List<String> cccdHanhKhach = mapVe.values().stream()
                .filter(ve -> {
                    ChuyenBay cb = mapChuyenBay.get(ve.getSoHieuChuyenBay());
                    return cb != null && cb.getThoiGianDi() != null && cb.getThoiGianDi().toLocalDate().equals(ngay);
                })
                .map(VeMayBay::getCccdHanhKhach)
                .distinct()
                .collect(Collectors.toList());

        return cccdHanhKhach.stream()
                .map(this::timHanhKhach)
                .collect(Collectors.toList());
    }

    public List<HanhKhach> locHanhKhachTheoThang(int thang, int nam) {
        List<String> cccdHanhKhach = mapVe.values().stream()
                .filter(ve -> {
                    ChuyenBay cb = mapChuyenBay.get(ve.getSoHieuChuyenBay());
                    return cb != null && cb.getThoiGianDi() != null
                            && cb.getThoiGianDi().getMonthValue() == thang
                            && cb.getThoiGianDi().getYear() == nam;
                })
                .map(VeMayBay::getCccdHanhKhach)
                .distinct()
                .collect(Collectors.toList());

        return cccdHanhKhach.stream()
                .map(this::timHanhKhach)
                .collect(Collectors.toList());
    }

    // ================ QUẢN LÝ HÃNG HÀNG KHÔNG =============
    public void themHang(HangHangKhong hhk) {
        mapHang.put(hhk.getMaHang(), hhk);
//        FileIOUtil.ghiVaoFile("hang.json", new ArrayList<>(mapHang.values()));
    }

    public void suaHang(HangHangKhong hhkMoi) {
        HangHangKhong hhkCu = timHang(hhkMoi.getMaHang());
        if (hhkCu != null) {
            hhkCu.capNhatThongTin(hhkMoi);
//            FileIOUtil.ghiVaoFile("hang.json", new ArrayList<>(mapHang.values()));
        }
    }

    public void xoaHang(String maHang) {
        mapHang.remove(maHang);
//        FileIOUtil.ghiVaoFile("hang.json", new ArrayList<>(mapHang.values()));
    }

    public HangHangKhong timHang(String maHang) {
        return mapHang.get(maHang);
    }

    // ================ QUẢN LÝ MÁY BAY =============
    public void themMayBay(MayBay mb) {
        mapMayBay.put(mb.getSoHieuMayBay(), mb);
//        FileIOUtil.ghiVaoFile("maybay.json", new ArrayList<>(mapMayBay.values()));
    }

    public void suaMayBay(MayBay mbMoi) {
        MayBay mbCu = timMayBay(mbMoi.getSoHieuMayBay());
        if (mbCu != null) {
            mbCu.capNhatThongTin(mbMoi);
//            FileIOUtil.ghiVaoFile("maybay.json", new ArrayList<>(mapMayBay.values()));
        }
    }

    public void xoaMayBay(String soHieu) {
        mapMayBay.remove(soHieu);
//        FileIOUtil.ghiVaoFile("maybay.json", new ArrayList<>(mapMayBay.values()));
    }

    public MayBay timMayBay(String soHieu) {
        return mapMayBay.get(soHieu);
    }

    // ================ QUẢN LÝ TÀI KHOẢN =============
    public void themTaiKhoan(TaiKhoan tk) {
        if (mapTaiKhoan.containsKey(tk.getTenDangNhap())) {
            System.out.println("Tên đăng nhập đã tồn tại.");
            return;
        }
        mapTaiKhoan.put(tk.getTenDangNhap(), tk);
        if (tk.getLoaiTaiKhoan() == TaiKhoan.LoaiTaiKhoan.USER) {
            // Khi tạo tài khoản user, tự động tạo một hành khách tương ứng
            HanhKhach hk = new HanhKhach(tk.getCccd(), tk.getHoTen());
            if (!mapHanhKhach.containsKey(hk.getCccd())) {
                themHanhKhach(hk);
            }
        }

//        FileIOUtil.ghiVaoFile("taikhoan.json", new ArrayList<>(mapTaiKhoan.values()));
        System.out.println("Thêm tài khoản thành công!");
    }

    public void suaTaiKhoan(TaiKhoan tkMoi) {
        TaiKhoan tkCu = timTaiKhoan(tkMoi.getTenDangNhap());
        if (tkCu != null) {
            tkCu.capNhatThongTin(tkMoi);
//            FileIOUtil.ghiVaoFile("taikhoan.json", new ArrayList<>(mapTaiKhoan.values()));
        }
    }

    public void xoaTaiKhoan(String tenDangNhap) {
        TaiKhoan tkCanXoa = mapTaiKhoan.get(tenDangNhap);

        if (tkCanXoa != null) {
            // Nếu tài khoản là USER, tìm và xóa hành khách tương ứng
            if (tkCanXoa.getLoaiTaiKhoan() == TaiKhoan.LoaiTaiKhoan.USER) {
                String cccd = tkCanXoa.getCccd();
                if (cccd != null && mapHanhKhach.containsKey(cccd)) {
                    mapHanhKhach.remove(cccd);
                    // Ghi lại file hành khách sau khi xóa
//                    FileIOUtil.ghiVaoFile("hanhkhach.json", new ArrayList<>(mapHanhKhach.values()));
                }
            }

            mapTaiKhoan.remove(tenDangNhap);
//            FileIOUtil.ghiVaoFile("taikhoan.json", new ArrayList<>(mapTaiKhoan.values()));
        }
    }

    public TaiKhoan timTaiKhoan(String tenDangNhap) {
        return mapTaiKhoan.get(tenDangNhap);
    }

    public boolean kiemTraDangNhap(String tenDangNhap, String matKhau) {
        TaiKhoan tk = timTaiKhoan(tenDangNhap);
        return tk != null && tk.getMatKhau().equals(matKhau);
    }

    // ============== TIỆN ÍCH =============
    public List<ChuyenBay> getDanhSachChuyenBay() {
        return new ArrayList<>(mapChuyenBay.values());
    }

    public List<VeMayBay> getDanhSachVe() {
        return new ArrayList<>(mapVe.values());
    }

    public List<HanhKhach> getDanhSachHanhKhach() {
        return new ArrayList<>(mapHanhKhach.values());
    }

    public List<HangHangKhong> getDanhSachHang() {
        return new ArrayList<>(mapHang.values());
    }

    public List<MayBay> getDanhSachMayBay() {
        return new ArrayList<>(mapMayBay.values());
    }

    public List<TaiKhoan> getDanhSachTaiKhoan() {
        return new ArrayList<>(mapTaiKhoan.values());
    }

    public void sapXepHanhKhachTheoTen() {
        getDanhSachHanhKhach().sort(Comparator.comparing(HanhKhach::getHoTen));
    }

    public void sapXepChuyenBayTheoMa() {
        getDanhSachChuyenBay().sort(Comparator.comparing(ChuyenBay::getSoHieuChuyenBay));
    }

    public void sapXepHangHangKhongTheoTen() {
        getDanhSachHang().sort(Comparator.comparing(HangHangKhong::getTenHang));
    }

    public void sapXepVeTheoMa() {
        getDanhSachVe().sort(Comparator.comparing(VeMayBay::getMaVe));
    }

    public List<String> goiYMaChuyenBay(String tuKhoa) {
        return mapChuyenBay.values().stream()
                .map(ChuyenBay::getSoHieuChuyenBay)
                .filter(ma -> ma.toLowerCase().contains(tuKhoa.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<String> goiYTenHangHangKhong(String tuKhoa) {
        return mapHang.values().stream()
                .map(HangHangKhong::getTenHang)
                .filter(ten -> ten.toLowerCase().contains(tuKhoa.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Map<String, Map<String, Integer>> thongKeSoVeConLaiTheoNgay(LocalDate ngay) {
        Map<String, Map<String, Integer>> ketQua = new HashMap<>();
        for (ChuyenBay cb : mapChuyenBay.values()) {
            if (cb.getThoiGianDi() != null && cb.getThoiGianDi().toLocalDate().equals(ngay)) {
                int phoThongCon = cb.getSoPhoThong() - cb.getSoVeDaBanPhoThong();
                int thuongGiaCon = cb.getSoThuongGia() - cb.getSoVeDaBanThuongGia();
                Map<String, Integer> thongTin = new HashMap<>();
                thongTin.put("PHO_THONG", phoThongCon);
                thongTin.put("THUONG_GIA", thuongGiaCon);
                ketQua.put(cb.getSoHieuChuyenBay(), thongTin);
            }
        }
        return ketQua;
    }

    public Map<String, Double> thongKeDoanhThuTheoTungHang(int thang, int nam) {
        Map<String, Double> doanhThuMoiHang = new HashMap<>();

        for (HangHangKhong hhk : mapHang.values()) {
            double tongDoanhThu = hhk.getDanhSachChuyenBay().stream()
                    .filter(cb -> cb.getThoiGianDi() != null
                    && cb.getThoiGianDi().getMonthValue() == thang
                    && cb.getThoiGianDi().getYear() == nam)
                    .mapToDouble(cb -> {
                        return cb.getDanhSachVe().stream()
                                .mapToDouble(ve -> {
                                    return (ve.getHangVe() == VeMayBay.HangVe.THUONG_GIA) ? cb.getGiaThuongGia() : cb.getGiaPhoThong();
                                }).sum();
                    }).sum();
            doanhThuMoiHang.put(hhk.getMaHang(), tongDoanhThu);
        }
        return doanhThuMoiHang;
    }

    public void luuToanBoDuLieuVaoFile() {
        FileIOUtil.ghiVaoFile("chuyenbay.json", new ArrayList<>(mapChuyenBay.values()));
        FileIOUtil.ghiVaoFile("ve.json", new ArrayList<>(mapVe.values()));
        FileIOUtil.ghiVaoFile("hanhkhach.json", new ArrayList<>(mapHanhKhach.values()));
        FileIOUtil.ghiVaoFile("hang.json", new ArrayList<>(mapHang.values()));
        FileIOUtil.ghiVaoFile("maybay.json", new ArrayList<>(mapMayBay.values()));
        FileIOUtil.ghiVaoFile("taikhoan.json", new ArrayList<>(mapTaiKhoan.values()));
    }

    @Override
    public String toString() {
        return "QuanLyHeThongDatVe{"
                + "\nChuyenBay=" + mapChuyenBay.values()
                + ",\nVe=" + mapVe.values()
                + ",\nHanhKhach=" + mapHanhKhach.values()
                + ",\nHangHangKhong=" + mapHang.values()
                + ",\nMayBay=" + mapMayBay.values()
                + ",\nTaiKhoan=" + mapTaiKhoan.values()
                + '}';
    }
}
