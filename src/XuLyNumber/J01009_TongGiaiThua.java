package XuLyNumber;

import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(TongGiaiThua(n));
    }

    public static long giaiThua(int n) {
        if (n == 0) return 1;
        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }

    public static long TongGiaiThua(int n) {
        if (n == 0) return 1;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += giaiThua(i);
        }
        return sum;
    }
}
