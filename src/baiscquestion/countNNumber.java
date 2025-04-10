package baiscquestion;

import java.util.Scanner;

public class countNNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int count = 0;
        while (n>0){
           int rem =  n % 10;
           n = n / 10;
           count++;
        }
        System.out.println("The Digits in the given number is: " +count);
    }
}
