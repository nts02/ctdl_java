package XuLyNumber;

import java.util.Scanner;

public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- >0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++) {
                a[i] = in.nextInt();
            }
            int l = 0,r = n - 1;
            int ok = 1;
            while (r > l) {
                if(a[r] == a[l]) {
                    ok = 1;
                    r--;
                    l++;
                } else {
                    ok = 0;
                    break;
                }
            }
            if(ok == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
