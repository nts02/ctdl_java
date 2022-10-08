package LuyenTap;

import java.util.Scanner;

public class BacThang {
    static int mod = 1000000007;
    static int res[] = new int[100003];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(solve(n, k));
        }
    }

    public static long solve(int n, int k) {
        res[0] = 1;
        for (int i = 1; i <= n; i++) {
            res[i] = 0;
            for (int j = i - 1; j >= 0 && j >= i - k; j--) {
                res[i] += res[j];
                res[i] %= mod;
            }
        }
        return res[n];
    }
}
