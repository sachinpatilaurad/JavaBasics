package Array;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int k = in.nextInt();
        int k = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        rotateArray(arr, k, n);

        System.out.print("After rotating " + k + " elements to the left: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Rotates array to the left by k positions
    public static int[] rotateArray(int[] arr, int k, int n) {
        reverseArray(arr, 0, k - 1);     // Reverse first k elements
        reverseArray(arr, k-1+1, n - 1);     // Reverse remaining elements
        reverseArray(arr, 0, n - 1);     // Reverse the whole array
        return arr;
    }

    // Helper method to reverse array from st to en
    public static int[] reverseArray(int[] arr, int st, int en) {
        while (st < en) {
            int temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;
        }
        return arr;
    }
}
