package Array;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] a = {4,5,2};
        int j = a.length - 1;
        for (int i = 0; i <= a.length - 1; i++)
        {
            if(j>=i)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
