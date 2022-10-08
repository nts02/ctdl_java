package Sort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        selectionSort(a, n);
    }

    public static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx])
                    min_idx = j;
            }
            if(min_idx != i) {
                int temp = a[min_idx];
                a[min_idx] = a[i];
                a[i] = temp;
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++)
                System.out.print(a[k] + " ");
            System.out.println();
        }
    }
}
