/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa06023;

import java.util.*;

/**
 *
 * @author William
 */
public class J01011 {
    public static void main(String[] args) {
        int t;
        long a,b;
        Scanner sc = new Scanner(System.in);
        t= sc.nextInt();
        while(t-- > 0){
            a = sc.nextLong();
            b = sc.nextLong();
            long gcd = GCD(a, b);
            long lcm = (long) (a*b) / (long)gcd;
            System.out.print(lcm + " ");
            System.out.println(gcd);
        }
    }

    private static long GCD(long a, long b) {
        while(b != 0){
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
