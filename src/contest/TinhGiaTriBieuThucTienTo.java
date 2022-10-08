package contest;

import java.util.Scanner;
import java.util.Stack;

public class TinhGiaTriBieuThucTienTo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String bieu_thuc = in.next();
            tinhGiaTri(bieu_thuc);
        }
    }

    public static void tinhGiaTri(String bieu_thuc) {
        Stack<Long> stack = new Stack<>();
        long temp = 0;
        for (int i = bieu_thuc.length() - 1; i >= 0; i--) {
            if (bieu_thuc.charAt(i) == '-' || bieu_thuc.charAt(i) == '+'
                    || bieu_thuc.charAt(i) == '*' || bieu_thuc.charAt(i) == '/'
                    || bieu_thuc.charAt(i) == '%' || bieu_thuc.charAt(i) == '^') {
                long s1 = stack.pop();
                long s2 = stack.pop();
                if(bieu_thuc.charAt(i) == '+') {
                    temp = s1 + s2;
                }
                if(bieu_thuc.charAt(i) == '-') {
                    temp = s1 - s2;
                }
                if(bieu_thuc.charAt(i) == '*') {
                    temp = s1 * s2;
                }
                if(bieu_thuc.charAt(i) == '/') {
                    temp = s1 / s2;
                }
                if(bieu_thuc.charAt(i) == '%') {
                    temp = s1 % s2;
                }
                if(bieu_thuc.charAt(i) == '^') {
                    temp = (long) Math.pow(s1,s2);
                }
                stack.push(temp);
            } else {
                stack.push(Long.parseLong(String.valueOf(bieu_thuc.charAt(i))));
            }
        }
        System.out.println(stack.pop());
    }
}
