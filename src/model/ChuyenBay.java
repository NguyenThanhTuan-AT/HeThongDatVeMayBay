package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.VeMayBay.HangVe;
import util.FileIOUtil;

public class ChuyenBay {

    private String soHieuChuyenBay;
    private String soHieuMayBay; // Sửa từ MayBay thành String
    private String diemDi;
    private String diemDen;
    private LocalDateTime thoiGianDi;
    private LocalDateTime thoiGianDen;
    private int soThuongGia;
    private int soPhoThong;
    private double giaPhoThong;
    private double giaThuongGia;
    private List<VeMayBay> danhSachVe = new ArrayList<>();

    public ChuyenBay() {
    }

    public ChuyenBay(String soHieuChuyenBay, String soHieuMayBay, String diemDi, String diemDen, LocalDateTime thoiGianDi, LocalDateTime thoiGianDen, int soThuongGia, int soPhoThong, double giaPhoThong, double giaThuongGia) {
        this.soHieuChuyenBay = soHieuChuyenBay;
        this.soHieuMayBay = soHieuMayBay;
        this.diemDi = diemDi;
        this.diemDen = diemDen;
        this.thoiGianDi = thoiGianDi;
        this.thoiGianDen = thoiGianDen;
        this.soThuongGia = soThuongGia;
        this.soPhoThong = soPhoThong;
        this.giaPhoThong = giaPhoThong;
        this.giaThuongGia = giaThuongGia;
    }

    public void themVe(VeMayBay ve) {
        danhSachVe.add(ve);
    }

    public void xoaVe(VeMayBay ve) {
        danhSachVe.remove(ve);
    }

    public List<VeMayBay> getDanhSachVe() {
        return danhSachVe;
    }

    public int getSoVeDaBan() {
        return danhSachVe.size();
    }

    public int getSoVeDaBanPhoThong() {
        return (int) danhSachVe.stream().filter(VeMayBay::laPhoThong).count();
    }

    public int getSoVeDaBanThuongGia() {
        return (int) danhSachVe.stream().filter(VeMayBay::laThuongGia).count();
    }

    public String getSoHieuChuyenBay() {
        return soHieuChuyenBay;
    }

    public void setSoHieuChuyenBay(String soHieuChuyenBay) {
        this.soHieuChuyenBay = soHieuChuyenBay;
    }

    public String getSoHieuMayBay() {
        return soHieuMayBay;
    }

    public void setSoHieuMayBay(String soHieuMayBay) {
        this.soHieuMayBay = soHieuMayBay;
    }

    public String getDiemDi() {
        return diemDi;
    }

    public void setDiemDi(String diemDi) {
        this.diemDi = diemDi;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public LocalDateTime getThoiGianDi() {
        return thoiGianDi;
    }

    public void setThoiGianDi(LocalDateTime thoiGianDi) {
        this.thoiGianDi = thoiGianDi;
    }

    public LocalDateTime getThoiGianDen() {
        if (thoiGianDi != null && thoiGianDen.isBefore(thoiGianDi)) {
            throw new IllegalArgumentException("Thời gian đến phải sau thời gian đi");
        }
        return thoiGianDen;
    }

    public void setThoiGianDen(LocalDateTime thoiGianDen) {
        this.thoiGianDen = thoiGianDen;
    }

    public int getSoThuongGia() {
        return soThuongGia;
    }

    public void setSoThuongGia(int soThuongGia) {
        this.soThuongGia = soThuongGia;
    }

    public int getSoPhoThong() {
        return soPhoThong;
    }

    public void setSoPhoThong(int soPhoThong) {
        this.soPhoThong = soPhoThong;
    }

    public double getGiaPhoThong() {
        return giaPhoThong;
    }

    public void setGiaPhoThong(double giaPhoThong) {
        this.giaPhoThong = giaPhoThong;
    }

    public double getGiaThuongGia() {
        return giaThuongGia;
    }

    public void setGiaThuongGia(double giaThuongGia) {
        this.giaThuongGia = giaThuongGia;
    }

    public boolean conChoTrong(HangVe hangVe) {
        if (hangVe == HangVe.THUONG_GIA) {
            return getSoVeDaBanThuongGia() < soThuongGia;
        } else {
            return getSoVeDaBanPhoThong() < soPhoThong;
        }
    }

    public int tongSoCho() {
        return soThuongGia + soPhoThong;
    }

    public void capNhatThongTin(ChuyenBay moi) {
        this.diemDi = moi.getDiemDi();
        this.diemDen = moi.getDiemDen();
        this.thoiGianDi = moi.getThoiGianDi();
        this.thoiGianDen = moi.getThoiGianDen();
        this.soPhoThong = moi.getSoPhoThong();
        this.soThuongGia = moi.getSoThuongGia();
        this.giaPhoThong = moi.getGiaPhoThong();
        this.giaThuongGia = moi.getGiaThuongGia();
        this.soHieuMayBay = moi.getSoHieuMayBay();
    }

    @Override
    public String toString() {
        return "ChuyenBay{" + "soHieuChuyenBay='" + soHieuChuyenBay + "', soHieuMayBay="
                + soHieuMayBay + ", diemDi='" + diemDi + "', diemDen='" + diemDen + "', thoiGianDi="
                + thoiGianDi + ", thoiGianDen=" + thoiGianDen + ", soThuongGia=" + soThuongGia
                + ", soPhoThong=" + soPhoThong + ", soVeDaBan=" + getSoVeDaBan() + '}';
    }

    public static List<ChuyenBay> docTuFile(String tenFile) {
        return FileIOUtil.docTuFile(tenFile, ChuyenBay.class);
    }

    public static void ghiVaoFile(String tenFile, List<ChuyenBay> danhSach) {
        FileIOUtil.ghiVaoFile(tenFile, danhSach);
    }
}
