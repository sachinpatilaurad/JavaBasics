package Array;

public class secSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -5, -4, 5, -3, -2, -1};
        int INT_MAX = 9999;
        int smallest = arr[0];
        int SSmallest = INT_MAX;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                SSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < SSmallest) {
                SSmallest = arr[i];
            }
        }
        System.out.println(SSmallest);
    }
}
