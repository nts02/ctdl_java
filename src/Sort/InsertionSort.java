package Sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        insertionSort(a, n);
    }

    public static void insertionSort(int[] a, int n) {
        for(int i = 0; i < n;i++){
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1]= key;
            System.out.print("Buoc " + (i) + ": ");
            for (int k = 0; k <= i; k++)
                System.out.print(a[k] + " ");
            System.out.println();
        }
    }
}
