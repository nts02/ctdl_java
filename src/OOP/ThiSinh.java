package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThiSinh {
    private String hoTen;
    private Date ngaySinh;
    private float diem1, diem2, diem3;
    private float tongDiem;

    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) throws ParseException {
        this.hoTen = hoTen;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }


    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public float tinhTong() {
        return (diem1 + diem2 + diem3);
    }

    @Override
    public String toString() {
        return hoTen + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + tinhTong();
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
        System.out.println(ts.toString());
    }
}
