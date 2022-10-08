package XuLyNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int i = 0;
        int length = list.size();
        while (i < length - 1) {
            if ((list.get(i) + list.get(i + 1)) % 2 == 0) {
                list.remove(i);
                list.remove(i);
                length = list.size();
                i = 0;
            } else i++;
        }
        System.out.println(list.size());
    }
}
