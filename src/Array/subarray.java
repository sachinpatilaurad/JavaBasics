package Array;

import java.util.Arrays;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] ans = array(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] array(int[] arr){
        for (int i=0; i<arr.length;i++){
            for (int j=i; j<arr.length; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        return arr;
    }
}
