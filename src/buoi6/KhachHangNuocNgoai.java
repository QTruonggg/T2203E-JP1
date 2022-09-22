package buoi6;

public class KhachHangNuocNgoai extends KhachHang {
    public String QuocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String QuocTich, int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayLHD, String HoTenKH) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayLHD, HoTenKH);
        this.QuocTich = QuocTich;
    }

    public String getQuocTich() {
        return this.QuocTich;
    }

    public void setQuocTich(String QuocTich) {
    }

    public void Nhap() {
        super.Nhap();
        System.out.println("Nhập quốc tịch: ");
        this.QuocTich = this.sc.nextLine();
    }

    public double TTien() {
        return (double)this.SoLuong * this.DonGia;
    }

    public String toString() {
        String var10000 = super.toString();
        return "KhachHangNuocNgoai{" + var10000 + "QuocTich='" + this.QuocTich + "'}";
    }
}
