public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien[] =new NhanVien[3];
        nhanVien[0] = new NhanVien();
        nhanVien[1] = new NhanVienChinhThuc();
        nhanVien[2] = new NhanvienThoiVu();

        for (NhanVien a: nhanVien
             ) {
            a.tinhLuong();
        }

        for (int i = 0; i < nhanVien.length; i++) {
            if(nhanVien[i] instanceof NhanvienThoiVu)
            {
                NhanvienThoiVu a = (NhanvienThoiVu)nhanVien[i];
//                Muon truy cap phuong thuc rieng cua class con
                a.nvthoivu();
            }
        }


//        NhanVien a = new NhanvienThoiVu();
//        a.m1();
//        Kieu khai bao
//        Kieu Object, kieu thuc te
//        Ep kieu tu kieu con -> kieu cha

    }
}
