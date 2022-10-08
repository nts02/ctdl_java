package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
// ()(())))) => -1 2
    // res = 2
    public static int check(String s) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.size() > 0) {
                    res = Math.max(res, i - stack.peek());
                }
                if (stack.isEmpty()) {
                    stack.push(i);
                }
            }
        }
        return res;
    }
}
