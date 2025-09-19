package util;

import java.util.List;
import model.ChuyenBay;

public class TableDataConverter {

    public static Object[][] chuyenBayToArray(List<ChuyenBay> list) {
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
