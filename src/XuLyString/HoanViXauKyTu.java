package XuLyString;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HoanViXauKyTu {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0 ;i < n;i++) {
                a[i] = sc.nextInt();
            }
            hoanVi(a,n);
        }
    }

    public static void inArray(int a[],int n) {
        for(int i = 0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println(" ");
    }

    public static void hoanVi(int a[],int n) {
        Arrays.sort(a);
        for(int i = 0 ; i< n;i++) {
            System.out.print(a[i]);
        }
    }
}
