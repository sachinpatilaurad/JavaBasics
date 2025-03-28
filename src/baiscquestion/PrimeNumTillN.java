package baiscquestion;

import java.util.Scanner;

public class PrimeNumTillN
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int low = inp.nextInt();
        int high = inp.nextInt();

        for (int i=low; i<=high; i++){
            int count = 0;

            for (int div = 2;
                 div * div <= i ; div++){
                if (i % div == 0){
                    count ++;
                    break;
                }

            }
            if (count == 0){
                System.out.println(i);
            }

        }

    }
}

