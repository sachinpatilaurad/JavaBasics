package Array;

import java.util.Scanner;

public class string
{
    public static void main(String[] args) {
        String input = "ttfc@##4grswrf";
        int vowelCount = 0;
        int consCount = 0;
        int specialChar = 0;

        input = input.toLowerCase(); // to handle A, E, I, O, U also

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Ignore space and check only vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowelCount++;
            }
            else if(ch == ' '|| ch == '!' || ch == '@' || ch == '#' || ch == '$') {
                specialChar++;
            }
            else {
                consCount++;
            }

        }
        System.out.println("Ovels: "+vowelCount);
        System.out.println("Cons: "+consCount);
        System.out.println("Special Char: "+ specialChar);
    }
}
