package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HanhKhach {

    private String cccd;
    private String hoTen;
    private List<String> danhSachMaVe; // Danh sách các mã vé mà hành khách này đã mua

    public HanhKhach() {
        this.danhSachMaVe = new ArrayList<>();
    }

    public HanhKhach(String cccd, String hoTen) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.danhSachMaVe = new ArrayList<>();
    }

    // --- Getters và Setters ---
    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public List<String> getDanhSachMaVe() {
        return danhSachMaVe;
    }

    public void setDanhSachMaVe(List<String> danhSachMaVe) {
        this.danhSachMaVe = danhSachMaVe;
    }

    public void themMaVe(String maVe) {
        if (this.danhSachMaVe == null) {
            this.danhSachMaVe = new ArrayList<>();
        }
        if (!this.danhSachMaVe.contains(maVe)) {
            this.danhSachMaVe.add(maVe);
        }
    }

    public boolean xoaMaVe(String maVe) {
        if (this.danhSachMaVe != null) {
            return this.danhSachMaVe.remove(maVe);
        }
        return false;
    }

    @Override
    public String toString() {
        return "HanhKhach{" + "cccd='" + cccd + '\'' + ", hoTen='" + hoTen + '\'' + ", danhSachMaVe=" + danhSachMaVe + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HanhKhach hanhKhach = (HanhKhach) o;
        return Objects.equals(cccd, hanhKhach.cccd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cccd);
    }
}
