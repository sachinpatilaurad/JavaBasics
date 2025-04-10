package Array;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Enter the element that you want to delete: ");
        int n = in.nextInt();
//        int ans = search();
    }
    static int search(int[] arr,int n){
        if (arr[0] == n ){
            System.out.println(n);
        }
        return n;
    }
}
