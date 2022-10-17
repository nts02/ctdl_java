package CoBan;

import java.util.Scanner;

public class TN04_SoDep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            if(thuanNghich(s) && checkEvenNumber(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean thuanNghich(String s) {
        StringBuilder sb = new StringBuilder(s);
        String result = sb.reverse().toString();
        return s.equals(result);
    }

    public static boolean checkEvenNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - '0';
            if (tmp % 2 == 1) return false;
        }
        return true;
    }
}
