package baiscquestion;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for (int i = 0 ; i < t ; i++)
        {
            int n = inp.nextInt();

            int count = 0;
            for (int div = 1 ; div <= n ; div++)
            {
                if (n % div == 0)
                {
                    count++;
                }

            }
            if (count == 2)
            {
                System.out.println(n + " it is a prime number");
            }
            else
            {
                System.out.println("Not a prime");
            }
        }
    }
}
