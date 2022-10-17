package CoBan;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TN05_ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            System.out.println(chuanHoa(in.nextLine()));
        }
    }

    public static String chuanHoa(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder res = new StringBuilder();
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            res.append(Character.toUpperCase(temp.charAt(0)));
            for(int i = 1 ; i < temp.length() ; i++) {
                res.append(Character.toLowerCase(temp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
}
