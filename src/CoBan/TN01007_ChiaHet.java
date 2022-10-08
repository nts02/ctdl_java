package CoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class TN01007_ChiaHet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger check = new BigInteger("0");
            if(a.mod(b).equals(check) | b.mod(a).equals(check)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
