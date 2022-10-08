package Stack;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcsd123";
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ;i++) {
            stack.push(s.charAt(i));
            stack.push(s.charAt(i));
        }
        System.out.println(stack.peek());
    }
}
