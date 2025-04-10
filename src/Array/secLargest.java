package Array;

public class secLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,6,-5,-2};
        int largest = arr[0];
        int secLargest = -1;

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secLargest)
            {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);

    }
}
