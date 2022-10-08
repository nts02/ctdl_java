package XuLyString;

import java.util.Scanner;
import java.util.TreeSet;

public class JP007_LocEmailTrungNhau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<String> list = new TreeSet<>();
        while (in.hasNextLine()) {
            String s = in.nextLine();
            list.add(s.toLowerCase().trim());

        }
        for (String i : list) {
            System.out.println(i);
        }
    }
}
