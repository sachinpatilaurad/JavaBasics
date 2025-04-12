package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int[] a = {1,2,3,5,3,2,4};
        int ans = LS(a,num);
        System.out.println(ans);
    }
    public static int LS(int[] a,int num)
    {
        for (int i =0 ; i<a.length; i++)
        {
            if (a[i] == num)
            {
                return i;
            }
        }
        return -1;
    }


}
