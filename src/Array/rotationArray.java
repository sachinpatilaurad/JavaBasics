package Array;

import java.util.Arrays;
import java.util.Scanner;

public class rotationArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of indexes: ");
        int k = in.nextInt();
        int[] a = {-1,-100,3,99};
        int[] b = new int[a.length];
        int count=0;
        int count1=0;
        int[] asn = rA(a,b,k,count,count1);
        System.out.println(Arrays.toString(asn));
    }
    public static int[] rA(int[] a, int[] b, int k, int count,int count1){
        for(int i=a.length-k; i<a.length; i++)
        {
            b[count] = a[i];
            count++;
        }
        while (count<b.length)
        {
            b[count] = a[count1];
            count++;
            count1++;
        }
        return b;

    }
}
