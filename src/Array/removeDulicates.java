package Array;

import java.util.Arrays;

public class removeDulicates {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2,3,3,4,4,6,7,8};
        int ans = rd(arr);
        System.out.println((ans));
    }
    static int rd(int[] arr){
        int i = 0;
        for (int j = 0; j < arr.length; j++ )
        {
            if(arr[j] != arr[i])
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
