package CoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class J03014_TongSoNguyenLon2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.print(a.add(b));
    }
}
