package CoBan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TN06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        while (n-- > 0) {
            String[] s = in.nextLine().toLowerCase().trim().split("\\W+");
            String ho = "";
            for (int i = 0; i < s.length - 1; i++) {
                if (s[i].isEmpty() || s[i].equals("")) {
                    continue;
                } else {
                    ho += s[i].charAt(0);
                }
            }
            arrayList.add(s[s.length - 1] + ho);
        }
    }
}
