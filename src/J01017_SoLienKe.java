import java.util.Scanner;

public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.valueOf(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            int i;
            for (i = 1; i < s.length(); i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1) {
                    System.out.println("NO");
                    break;
                }
            }
            if (i == s.length()) {
                System.out.println("YES");
            }
        }
    }
}
