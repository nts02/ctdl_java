package XuLyNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015_HieuSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        System.out.println(a.subtract(b));
    }
}

