package LuyenTap;

import java.util.Scanner;

public class DaySoVoHan {
    static long F[][] = new long[2][2];
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(fibonacci_n(n));
        }
    }

    public static void Mul(long f[][],long m[][]) {

    }
    public static void Pow(long f[][],int n) {
        if(n <= 1) return ;
        Pow(f,n/2);
    }
    public static long fibonacci_n(int n) {
        if (n == 1 || n == 2) return 1;
        return (fibonacci_n(n - 1) % mod + fibonacci_n(n - 2) % mod) % mod;
    }
}
