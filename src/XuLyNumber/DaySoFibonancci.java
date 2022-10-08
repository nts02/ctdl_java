package XuLyNumber;

import java.util.Scanner;

public class DaySoFibonancci {
    static long f[] = new long[100];

    public static void main(String[] args) {
        f[0] = 0; f[1] = 1;
        for (int i = 2; i <= 92; i++) f[i] = f[i - 1] + f[i - 2];
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            System.out.println(tinh(n, k));
        }
    }

    public static String tinh(int n, long k) {
        if (n == 1) return "B";
        if (n == 2) return "A";
        if (k < f[n - 2]) return tinh(n - 2, k);
        return tinh(n - 1, k - f[n - 2]);
    }
}
