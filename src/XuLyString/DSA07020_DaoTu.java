package XuLyString;

import java.util.Scanner;

public class DSA07020_DaoTu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            String res = "";
            String[] word = s.split(" ");
            for (String c : word) {
                res += " " + new StringBuilder(c).reverse();
            }
            System.out.println(res.trim());
        }
    }
}
