package OOP;

import java.util.Scanner;

public class ThuNhapGiaoVien {
    private String ma, ten;
    private Integer luongCB;

    public ThuNhapGiaoVien(String ma, String ten, Integer luongCB) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public Integer getLuongCB() {
        return luongCB;
    }

    public Integer thuNhap() {
        String bacLuong = getMa().substring(2);
        return Integer.parseInt(bacLuong) * this.luongCB + this.phuCap();
    }

    public Integer phuCap() {
        String chucVu = getMa().substring(0, 2);
        if (chucVu.equals("HT")) {
            return 2000000;
        }
        if (chucVu.equals("HP")) {
            return 900000;
        }
        return 500000;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + Integer.parseInt(ma.substring(2)) + " " + phuCap() + " " + thuNhap();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ThuNhapGiaoVien gv = new ThuNhapGiaoVien(in.nextLine(),in.nextLine(),in.nextInt());
        System.out.println(gv);
    }
}
