package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenDanhSachKeSangDanhSachCanh {
    static int n;
    static ArrayList<Integer> dske[] = new ArrayList[50];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++) {
            dske[i] = new ArrayList<>();
            String a[] = sc.nextLine().split(" ");
            for(int j=0; j<a.length; j++)
                dske[i].add(Integer.parseInt(a[j]));
        }

        for(int i=1; i<=n; i++) {
            for(Integer x : dske[i]) {
                if(x > i) {
                    System.out.println(i + " " + x);
                }
            }
        }

    }
}
