package Array;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -7,5,7,-4,6,-15};
        int[] arr1 = new int[arr.length];
        int l = 0;
        int r = arr1.length-1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i]<0)
               arr1[l++]=arr[i];
            else
                arr1[r--] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
