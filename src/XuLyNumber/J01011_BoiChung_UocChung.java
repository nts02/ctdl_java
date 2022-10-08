package XuLyNumber;

import java.util.Scanner;

public class J01011_BoiChung_UocChung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            long a = in.nextInt();
            long b = in.nextInt();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
            t--;
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
