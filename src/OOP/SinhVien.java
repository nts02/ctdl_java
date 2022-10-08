package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    private String maSV, hoTen, lop;
    private Date ngaySinh;
    private float gpa;

    public SinhVien(String maSV, String hoTen, String lop, String ngaySinh, float gpa) throws ParseException {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("B20DCCN001 %s %s %s %.2f", hoTen, lop, new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh), gpa);
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SinhVien sv = new SinhVien("",in.nextLine(),in.nextLine(),in.nextLine(),in.nextFloat());
        System.out.println(sv);
    }
}
