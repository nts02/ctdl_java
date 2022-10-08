/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa06023;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author William
 */
public class J03033 {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        BigInteger num1 = null, num2 = null;
        while(t-- > 0){
            num1 = new BigInteger(sc.next());
            num2 = new BigInteger(sc.next());
            System.out.println((num1.multiply(num2)).divide(num1.gcd(num2)));
        }
    }
}
