package XuLyString;

import java.util.Scanner;

public class J01016_ChuSo47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        DemChuSo(n);
    }

    public static void DemChuSo(long n) {
        int res = 0;
        while (n > 0) {
            long a = n % 10;
            if (a == 4 || a == 7) {
                res += 1;
            }
            n /= 10;
        }
        if (res == 4 || res == 7) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
