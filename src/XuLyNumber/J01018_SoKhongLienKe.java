package XuLyNumber;

import java.util.Scanner;

public class J01018_SoKhongLienKe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            char[] arrayNumber = in.nextBigInteger().toString().toCharArray();
            if (tongCS(arrayNumber) && distance(arrayNumber)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }

    public static boolean tongCS(char[] arrayNumber) {
        int sum = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            sum += Integer.parseInt(String.valueOf(arrayNumber[i]));
        }
        if (sum % 10 != 0) {
            return false;
        }
        return true;
    }

    public static boolean distance(char[] arrayNumber) {
        for (int i = 0; i < arrayNumber.length - 1; i++) {
            if (Math.abs(arrayNumber[i] - arrayNumber[i + 1]) != 2) {
                return false;
            }
        }
        return true;
    }
}

