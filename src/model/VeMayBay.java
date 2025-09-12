package model;

import java.util.*;
import util.FileIOUtil;

public class VeMayBay {

    public enum HangVe {
        PHO_THONG,
        THUONG_GIA
    }

    private String maVe;
    private String soHieuChuyenBay;
    private HangVe hangVe;
    private String cccdHanhKhach;

    public VeMayBay() {
    }

    public VeMayBay(String maVe, String soHieuChuyenBay, HangVe hangVe, String cccdHanhKhach) {
        this.maVe = maVe;
        this.soHieuChuyenBay = soHieuChuyenBay;
        this.hangVe = hangVe;
        this.cccdHanhKhach = cccdHanhKhach;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getSoHieuChuyenBay() {
        return soHieuChuyenBay;
    }

    public void setSoHieuChuyenBay(String soHieuChuyenBay) {
        this.soHieuChuyenBay = soHieuChuyenBay;
    }

    public HangVe getHangVe() {
        return hangVe;
    }

    public void setHangVe(HangVe hangVe) {
        this.hangVe = hangVe;
    }

    public String getCccdHanhKhach() {
        return cccdHanhKhach;
    }

    public void setCccdHanhKhach(String cccdHanhKhach) {
        this.cccdHanhKhach = cccdHanhKhach;
    }

    public boolean laThuongGia() {
        return hangVe == HangVe.THUONG_GIA;
    }

    public boolean laPhoThong() {
        return hangVe == HangVe.PHO_THONG;
    }

    public void capNhatThongTin(VeMayBay moi) {
        this.soHieuChuyenBay = moi.getSoHieuChuyenBay();
        this.hangVe = moi.getHangVe();
    }

    @Override
    public String toString() {
        return "VeMayBay{"
                + "maVe='" + maVe + '\''
                + ", soHieuChuyenBay=" + soHieuChuyenBay
                + ", hangVe=" + hangVe
                + '}';
    }

    public static List<VeMayBay> docTuFile(String tenFile) {
        return FileIOUtil.docTuFile(tenFile, VeMayBay.class);
    }

    public static void ghiVaoFile(String tenFile, List<VeMayBay> danhSach) {
        FileIOUtil.ghiVaoFile(tenFile, danhSach);
    }
}
