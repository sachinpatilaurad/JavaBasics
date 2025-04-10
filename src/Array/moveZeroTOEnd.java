package Array;

import java.util.Arrays;

public class moveZeroTOEnd {
    public static void main(String[] args) {
        int[] a = {0,4,2,3,0,0,0,0,3,4,5,6,7};

        for(int i=0; i<a.length-1; i++)
        {
            if(a[i]==0)
            {
                int j=i+1;
                while (j+1<a.length && a[j] == 0 ) j++;
                a[i] = a[i] + a[j];
                a[j]= a[i] - a[j] ;
                a[i] = a[i] - a[j];
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
