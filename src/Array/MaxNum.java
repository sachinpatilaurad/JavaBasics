package Array;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,5,3,6,7};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        Scanner in = new Scanner(System.in);
        int low = in.nextInt();
        int high = in.nextInt();
         int maxVal = arr[0];
        for (int i = low; i<=high; i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }

    }
        return maxVal;
}
}
