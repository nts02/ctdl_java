package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DSA07110_KiemTraNgoacDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean check(String s) {
        if(s.charAt(s.length()-1) != '.') {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length()-1; i++) {
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || s.charAt(i) == ' '){
                continue;
            }
            if (s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    if (s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                    else if (s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                    else return false;
                } else
                    return false;
            }
        }
        return stack.isEmpty();
    }

}


