package Array;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {2,3,5,2,3,4,6,3,7,2,5,4,6,8};
//        bS(a);
        Insertion(a);
    }

    public static void bS(int[] a){
        for(int i = a.length-1; i>=1 ; i--)
        {
            int didSwap = 0;
            for(int j=0 ; j<=i-1; j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) break;
        }

        System.out.println(Arrays.toString(a));

    }

    public static void Insertion(int[] a){
        for (int i=0;i<=a.length-1;i++)
        {
            int j=i;
            while(j>0 && a[j-1]>a[j])
            {
                int temp = a[j];
                a[j] =a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
