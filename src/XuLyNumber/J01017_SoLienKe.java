package XuLyNumber;

import java.util.Scanner;

public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            SoLienKe(n);
        }
    }

    public static void SoLienKe(long n) {
        boolean ok = true;
        if(n < 10) return;
        while (n > 0) {
            long x1 = n % 10;
            long x2 = (n / 10) % 10;
            if (Math.abs(x1 - x2) != 1) {
                ok = false;
                break;
            }
            n /= 10;
        }
        if (ok) System.out.println("YES");
        else System.out.println("NO");
    }
}
