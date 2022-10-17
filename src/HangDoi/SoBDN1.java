package HangDoi;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class SoBDN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long n = sc.nextLong();
            Queue<Long> q = new ArrayDeque<>();

            q.add((long) 1);
            boolean c = true;
            int count = 0;
            while(c) {
                long tmp = q.poll();
                if(tmp <= n)
                    count++;
                else
                    c = false;

                q.add(tmp*10 + 0);
                q.add(tmp*10 + 1);
            }
            System.out.println(count);
        }
    }
}
