package CoBan;

import java.util.Scanner;

public class TN07_RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(rutGonKyTu(s));
    }

    public static String rutGonKyTu(String s) {
        boolean check = false;
        String res = s;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                check = true;
                res = s.substring(0, i) + s.substring(i + 2, s.length());
            }
        }
        if (s.length() == 0) {
            return "Empty String";
        }
        if (!check) {
            return s;
        }
        else {
            return rutGonKyTu(res);
        }
    }
}
