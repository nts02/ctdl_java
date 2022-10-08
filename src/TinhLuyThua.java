import java.util.Scanner;

public class TinhLuyThua {
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
//            int k = in.nextInt();
            long k = in.nextLong();
            System.out.println(tinh(n, k));
        }
    }

    //Luy Thua
    public static long powerMod(int n, int k) {
        if (k == 0) return 1;
        long x = powerMod(n, k / 2);
        if (k % 2 == 0) {
            return x * x % mod;
        } else return n * (x * x % mod) % mod;
    }

    //Gap doi day so
    public static long tinh(int n, long k) {
        long x =(long) Math.pow(2,n-1);
        if(k==x) return n;
        if(k < x ) return tinh(n-1,k);
        else return tinh(n-1,k-x);
    }
}
