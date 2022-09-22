package buoi6;

public class KhachHangList extends KhachHangViet {
    public KhachHang[] kh = new KhachHang[50];
    public int CountKH = 0;
    public int sum1 = 0;
    public int sum2 = 0;
    public int dem = 0;
    public int sumtien = 0;

    public KhachHangList() {
        for(int i = 0; i < 50; ++i) {
            this.kh[i] = new KhachHang();
        }

    }

    public void ThemKH(int temp) {
        if (this.CountKH > 50) {
            System.out.println("Bộ nhớ đầy.");
        } else {
            if (temp == 1) {
                this.kh[this.CountKH] = new KhachHangViet();
                KhachHangViet khv = new KhachHangViet();
                khv.Nhap();
                khv.ThanhTien = khv.TTien();
                this.kh[this.CountKH] = khv;
                this.sum1 += khv.SoLuong;
            } else {
                this.kh[this.CountKH] = new KhachHangNuocNgoai();
                KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
                khnn.Nhap();
                khnn.ThanhTien = khnn.TTien();
                this.kh[this.CountKH] = khnn;
                this.sum2 += khnn.SoLuong;
                this.sumtien = (int)((double)this.sumtien + khnn.ThanhTien);
            }

            ++this.dem;
            ++this.CountKH;
        }

    }

    public void HienThi() {
        for(int i = 0; i < this.CountKH; ++i) {
            System.out.println("Sô TT" + (i + 1));
            System.out.println(this.kh[i].toString());
        }

    }

    public void TongSL() {
        System.out.println("Tổng số lượng (kw) điện của khách hàng Việt Nam" + this.sum1);
        System.out.println("Tổng số lượng (kw) điện của khách hàng Nước Ngoài" + this.sum2);
    }
}
