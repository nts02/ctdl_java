package CoBan;

import java.util.Scanner;

public class TN02_UocNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long i;
            long n = in.nextLong();
            for ( i = 2; i <= Math.sqrt(n); i++) {
                if (i*i==n) {
                    n/=i;
                    break;
                }
                while(n%i==0) n/=i;
            }
            System.out.println(n);
        }
    }
}
