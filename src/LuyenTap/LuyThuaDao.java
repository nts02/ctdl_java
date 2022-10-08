package LuyenTap;

import java.util.Scanner;

public class LuyThuaDao {
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            System.out.println(powerMod(n,reverse(n)));
        }
    }

    //Luy Thua
    public static long powerMod(long n, long k) {
        if (k == 0) return 1;
        long x = powerMod(n, k / 2);
        if (k % 2 == 0) {
            return x * x % mod;
        } else return n * (x * x % mod) % mod;
    }

    public static long reverse(long n) {
        long res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res;
    }

    public static String convertNumberToString(long n) {
        String res = String.valueOf(n);
        StringBuilder res1 = new StringBuilder();
        res1.append(res);
        return res1.reverse().toString();
    }
}
