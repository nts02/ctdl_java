package OOP;

import java.util.Scanner;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo() {

    }

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static long USCLN(long a, long b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long tu = a / USCLN(a,b);
        long mau  = b / USCLN(a,b);
        PhanSo ps = new PhanSo(tu,mau);
        System.out.println(ps.toString());
    }
}
