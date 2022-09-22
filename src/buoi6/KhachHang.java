package buoi6;

import java.util.Scanner;

public class KhachHang {
    public int MaKH;
    public int SoLuong;
    public double DonGia;
    public double ThanhTien;
    public String NgayLHD;
    public String HoTenKH;
    Scanner sc;

    public KhachHang() {
        this.sc = new Scanner(System.in);
    }

    public KhachHang(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayLHD, String HoTenKH) {
        this.sc = new Scanner(System.in);
    }

    public int getMaKH() {
        return this.MaKH;
    }

    public void setMaKH(int MaKH) {
    }

    public int getSoLuong() {
        return this.SoLuong;
    }

    public void setSoLuong(int SoLuong) {
    }

    public double getDonGia() {
        return this.DonGia;
    }

    public void setDonGia(double DonGia) {
    }

    public double getThanhTien() {
        return this.ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
    }

    public String getNgayLHD() {
        return this.NgayLHD;
    }

    public void setNgayLHD(String NgayLHD) {
    }

    public String getHoTenKH() {
        return this.HoTenKH;
    }

    public void setHoTenKH(String HoTenKH) {
    }

    public void Nhap() {
        System.out.println("Nhập mã khách hàng: ");
        this.MaKH = this.sc.nextInt();
        System.out.println("Nhập họ và tên khách hàng: ");
        this.HoTenKH = this.sc.nextLine();
        System.out.println("Nhập ngày lập hoá đơn: ");
        this.NgayLHD = this.sc.nextLine();
        System.out.println("Số lương kw: ");
        this.SoLuong = this.sc.nextInt();
        System.out.println("Đơn giá: ");
        this.DonGia = this.sc.nextDouble();
    }

    public String toString() {
        return "MaKH=" + this.MaKH + ", SoLuong=" + this.SoLuong + ", DonGia=" + this.DonGia + ", ThanhTien=" + this.ThanhTien + ", NgayLHD='" + this.NgayLHD + "', HoTenKH='" + this.HoTenKH;
    }
}

