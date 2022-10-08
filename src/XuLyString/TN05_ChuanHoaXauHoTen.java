package XuLyString;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TN05_ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            String s = in.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    public static String chuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            kq.append(Character.toUpperCase(word.charAt(0)));
            for (int i = 1; i < word.length(); i++) {
                kq.append(Character.toLowerCase(word.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
