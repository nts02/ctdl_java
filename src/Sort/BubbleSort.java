package Sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        bubbleSort(a, n);
    }

    public static void bubbleSort(int[] a, int n) {
        int i, j, check = 0;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    check = 1;
                }
            }

            if(check == 1) {
                System.out.print("Buoc " + (i + 1) + ": ");
                for (int k = 0; k < n; k++)
                    System.out.print(a[k] + " ");
                System.out.println();
                check = 0;
            }

        }
    }
}
