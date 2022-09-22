package buoi6;

public class KhachHangViet extends KhachHang {
    public int LoaiKH;
    public int DinhMuc;

    public KhachHangViet() {
    }

    public KhachHangViet(int LoaiKH, int DinhMuc, int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayLHD, String HoTenKH) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayLHD, HoTenKH);
        this.LoaiKH = LoaiKH;
        this.DinhMuc = DinhMuc;
    }

    public int getLoaiKH() {
        return this.LoaiKH;
    }

    public void setLoaiKH(int LoaiKH) {
    }

    public int getDinhMuc() {
        return this.DinhMuc;
    }

    public void setDinhMuc(int DinhMuc) {
    }

    public void Nhap() {
        super.Nhap();
        System.out.println("Loại khách hànng (1. Sinh hoạt. 2. Kinh Doanh. 3.Sản xuất.)");
        this.LoaiKH = this.sc.nextInt();
        System.out.println("Định mức: ");
        this.DinhMuc = this.sc.nextInt();
    }

    public double TTien() {
        return this.SoLuong <= this.DinhMuc ? this.DonGia * (double)this.SoLuong : (double)this.DinhMuc * this.DonGia + (double)(this.SoLuong - this.DinhMuc) * this.DonGia * 2.5;
    }

    public String toString() {
        String temp;
        if (this.LoaiKH == 1) {
            temp = "Sinh Hoạt";
        } else if (this.LoaiKH == 2) {
            temp = "Kinh Doanh";
        } else {
            temp = "Sản Xuất";
        }

        return "KhachHangViet{" + super.toString() + "LoaiKH=" + temp + ",DinhMuc=" + this.DinhMuc + "}";
    }
}
