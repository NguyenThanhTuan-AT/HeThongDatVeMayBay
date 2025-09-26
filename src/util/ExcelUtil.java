package util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import model.ChuyenBay;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    public static void xuatFileExcelChuyenBay(List<ChuyenBay> danhSach, String tenFile) {
        // Định dạng thời gian để hiển thị trong Excel
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Tạo một workbook (file Excel) mới
        try (Workbook workbook = new XSSFWorkbook()) {
            // Tạo một trang tính (sheet) trong file Excel
            Sheet sheet = workbook.createSheet("Danh Sách Chuyến Bay");

            // --- Tạo Tiêu đề cho các cột ---
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Số Hiệu CB", "Số Hiệu MB", "Điểm Đi", "Điểm Đến",
                "Thời Gian Đi", "Thời Gian Đến", "Ghế Thường", "Ghế TG",
                "Giá Phổ Thông", "Giá Thương Gia", "Vé Đã Bán"};

            // --- SỬA LỖI TẠI ĐÂY ---
            // 1. Tạo CellStyle
            CellStyle headerCellStyle = workbook.createCellStyle();
            // 2. Tạo đối tượng Font từ workbook, khai báo đúng kiểu của thư viện POI
            org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            // 3. Gán font vào style
            headerCellStyle.setFont(headerFont);

            // Ghi tên các cột vào dòng đầu tiên và áp dụng style
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerCellStyle);
            }

            // --- Ghi dữ liệu của từng chuyến bay ---
            int rowNum = 1;
            for (ChuyenBay cb : danhSach) {
                Row row = sheet.createRow(rowNum++);

                row.createCell(0).setCellValue(cb.getSoHieuChuyenBay());
                row.createCell(1).setCellValue(cb.getSoHieuMayBay());
                row.createCell(2).setCellValue(cb.getDiemDi());
                row.createCell(3).setCellValue(cb.getDiemDen());
                row.createCell(4).setCellValue(cb.getThoiGianDi().format(formatter));
                row.createCell(5).setCellValue(cb.getThoiGianDen().format(formatter));
                row.createCell(6).setCellValue(cb.getSoPhoThong());
                row.createCell(7).setCellValue(cb.getSoThuongGia());
                row.createCell(8).setCellValue(cb.getGiaPhoThong());
                row.createCell(9).setCellValue(cb.getGiaThuongGia());
                row.createCell(10).setCellValue(cb.getSoVeDaBan());
            }

            // Tự động điều chỉnh kích thước các cột cho vừa với nội dung
            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Ghi workbook ra file
            try (FileOutputStream fileOut = new FileOutputStream(tenFile)) {
                workbook.write(fileOut);
                System.out.println("Xuất file Excel '" + tenFile + "' thành công!");
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Có lỗi khi xuất file Excel: " + e.getMessage(), e);
        }
    }

    public static void xuatFileExcelHanhKhach(List<model.HanhKhach> danhSach, String tenFile) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Danh Sách Hành Khách");

            // --- Tạo Tiêu đề ---
            Row headerRow = sheet.createRow(0);
            String[] columns = {"CCCD", "Họ Tên", "Danh sách Mã vé"};

            CellStyle headerCellStyle = workbook.createCellStyle();
            org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerCellStyle.setFont(headerFont);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerCellStyle);
            }

            // --- Ghi dữ liệu ---
            int rowNum = 1;
            for (model.HanhKhach hk : danhSach) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(hk.getCccd());
                row.createCell(1).setCellValue(hk.getHoTen());
                // Gộp danh sách mã vé thành một chuỗi duy nhất
                row.createCell(2).setCellValue(String.join(", ", hk.getDanhSachMaVe()));
            }

            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Ghi ra file
            try (FileOutputStream fileOut = new FileOutputStream(tenFile)) {
                workbook.write(fileOut);
                System.out.println("Xuất file Excel '" + tenFile + "' thành công!");
            }
        } catch (IOException e) {
            throw new RuntimeException("Có lỗi khi xuất file Excel: " + e.getMessage(), e);
        }
    }

    public static void xuatFileExcelVeMayBay(List<model.VeMayBay> danhSach, model.QuanLyChung quanLy, String tenFile) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Danh Sách Vé Máy Bay");

            // --- Tạo Tiêu đề ---
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Mã Vé", "Số Hiệu CB", "Hạng Vé", "CCCD Hành Khách", "Tên Hành Khách", "Giá Vé"};

            CellStyle headerCellStyle = workbook.createCellStyle();
            org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerCellStyle.setFont(headerFont);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerCellStyle);
            }

            // --- Ghi dữ liệu ---
            int rowNum = 1;
            for (model.VeMayBay ve : danhSach) {
                Row row = sheet.createRow(rowNum++);

                // Tra cứu thông tin liên quan
                model.HanhKhach hk = quanLy.timHanhKhach(ve.getCccdHanhKhach());
                model.ChuyenBay cb = quanLy.timChuyenBay(ve.getSoHieuChuyenBay());

                String tenHanhKhach = (hk != null) ? hk.getHoTen() : "Không tìm thấy";
                double giaVe = 0;
                if (cb != null) {
                    giaVe = (ve.getHangVe() == model.VeMayBay.HangVe.THUONG_GIA) ? cb.getGiaThuongGia() : cb.getGiaPhoThong();
                }

                row.createCell(0).setCellValue(ve.getMaVe());
                row.createCell(1).setCellValue(ve.getSoHieuChuyenBay());
                row.createCell(2).setCellValue(ve.getHangVe().toString());
                row.createCell(3).setCellValue(ve.getCccdHanhKhach());
                row.createCell(4).setCellValue(tenHanhKhach);
                row.createCell(5).setCellValue(giaVe);
            }

            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Ghi ra file
            try (FileOutputStream fileOut = new FileOutputStream(tenFile)) {
                workbook.write(fileOut);
                System.out.println("Xuất file Excel '" + tenFile + "' thành công!");
            }
        } catch (IOException e) {
            throw new RuntimeException("Có lỗi khi xuất file Excel: " + e.getMessage(), e);
        }
    }

    public static void xuatFileExcelMayBay(List<model.MayBay> danhSach, String tenFile) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Danh Sách Máy Bay");

            // --- Tạo Tiêu đề ---
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Số Hiệu Máy Bay", "Mã Hãng"};

            CellStyle headerCellStyle = workbook.createCellStyle();
            org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerCellStyle.setFont(headerFont);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerCellStyle);
            }

            // --- Ghi dữ liệu ---
            int rowNum = 1;
            for (model.MayBay mb : danhSach) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(mb.getSoHieuMayBay());
                row.createCell(1).setCellValue(mb.getMaHang());
            }

            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Ghi ra file
            try (FileOutputStream fileOut = new FileOutputStream(tenFile)) {
                workbook.write(fileOut);
                System.out.println("Xuất file Excel '" + tenFile + "' thành công!");
            }
        } catch (IOException e) {
            throw new RuntimeException("Có lỗi khi xuất file Excel: " + e.getMessage(), e);
        }
    }

    public static void xuatFileExcelTaiKhoan(List<model.TaiKhoan> danhSach, String tenFile) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Danh Sách Tài Khoản");

            // --- Tạo Tiêu đề ---
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Tên đăng nhập", "Mật khẩu", "Loại tài khoản", "Họ tên", "CCCD"};

            CellStyle headerCellStyle = workbook.createCellStyle();
            org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerCellStyle.setFont(headerFont);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerCellStyle);
            }

            // --- Ghi dữ liệu ---
            int rowNum = 1;
            for (model.TaiKhoan tk : danhSach) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(tk.getTenDangNhap());
                row.createCell(1).setCellValue(tk.getMatKhau()); // Lưu ý: Trong thực tế không nên xuất mật khẩu ra file
                row.createCell(2).setCellValue(tk.getLoaiTaiKhoan().toString());
                // Kiểm tra null cho họ tên và cccd vì tài khoản admin có thể không có
                row.createCell(3).setCellValue(tk.getHoTen() != null ? tk.getHoTen() : "");
                row.createCell(4).setCellValue(tk.getCccd() != null ? tk.getCccd() : "");
            }

            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Ghi ra file
            try (FileOutputStream fileOut = new FileOutputStream(tenFile)) {
                workbook.write(fileOut);
                System.out.println("Xuất file Excel '" + tenFile + "' thành công!");
            }
        } catch (IOException e) {
            throw new RuntimeException("Có lỗi khi xuất file Excel: " + e.getMessage(), e);
        }
    }
}
