package XuLyNumber;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02005_GiaoHaiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();
        while (n-- > 0) {
            a.add(in.nextInt());
        }
        while (m-- > 0) {
            b.add(in.nextInt());
        }
        a.retainAll(b);
        for(Integer i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
