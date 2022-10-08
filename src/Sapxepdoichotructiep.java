import java.util.Collections;
import java.util.Scanner;

public class Sapxepdoichotructiep {
    static int n, a[] = new int[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            n = sc.nextInt();
        }
    }

    public static void sapXep(int n, int a[]) {
        for(int i = 0 ;i < n - 1 ; i++ ) {
            for(int j = i+1 ; j< n ;j++) {
                if(a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}
