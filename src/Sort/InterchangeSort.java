package Sort;

import java.util.Scanner;

public class InterchangeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        SapXep(a, n);
    }

    public static void SapXep(int[] a, int n) {
        int i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int value : a) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
