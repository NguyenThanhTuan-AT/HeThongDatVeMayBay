package model;

import java.util.*;
import util.FileIOUtil;

public class TaiKhoan {

    public enum LoaiTaiKhoan {
        ADMIN,
        USER
    }

    private String tenDangNhap;
    private String matKhau;
    private LoaiTaiKhoan loaiTaiKhoan;
    private String hoTen;
    private String cccd;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenDangNhap, String matKhau, LoaiTaiKhoan loaiTaiKhoan) {
//Chưa cần thiết
//        if (matKhau == null || matKhau.length() < 6) {
//            throw new IllegalArgumentException("Mật khẩu phải có ít nhất 6 ký tự");
//        }
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public TaiKhoan(String tenDangNhap, String matKhau, LoaiTaiKhoan loaiTaiKhoan, String hoTen, String cccd) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
        this.hoTen = hoTen;
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
//        Chưa cần thiết
//        if (matKhau == null || matKhau.length() < 6) {
//            throw new IllegalArgumentException("Mật khẩu phải có ít nhất 6 ký tự");
//        }
        this.matKhau = matKhau;
    }

    public LoaiTaiKhoan getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(LoaiTaiKhoan loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public boolean laAdmin() {
        return loaiTaiKhoan == LoaiTaiKhoan.ADMIN;
    }

    public boolean kiemTraMatKhau(String matKhauNhapVao) {
        return this.matKhau.equals(matKhauNhapVao);
    }

    public void doiMatKhau(String matKhauMoi) {
        setMatKhau(matKhauMoi);
    }

    public void capNhatThongTin(TaiKhoan moi) {
        this.matKhau = moi.getMatKhau();
        this.loaiTaiKhoan = moi.getLoaiTaiKhoan();
        this.hoTen = moi.getHoTen();
        this.cccd = moi.getCccd();
    }

    @Override
    public String toString() {
        return "TaiKhoan{"
                + "tenDangNhap='" + tenDangNhap + '\''
                + ", loaiTaiKhoan=" + loaiTaiKhoan
                + '}';
    }

    public static List<TaiKhoan> docTuFile(String tenFile) {
        return FileIOUtil.docTuFile(tenFile, TaiKhoan.class);
    }

    public static void ghiVaoFile(String tenFile, List<TaiKhoan> danhSach) {
        FileIOUtil.ghiVaoFile(tenFile, danhSach);
    }
}
