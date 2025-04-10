package baiscquestion;

import java.util.*;

public class subquestion {
    static void generatePermutations(List<Character> chosen, boolean[] used, char[] arr, int r) {
        if (chosen.size() == r) {
            // Print or store the permutation
            System.out.println(chosen);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;  // Mark as used
                chosen.add(arr[i]);  // Select the element
                generatePermutations(chosen, used, arr, r);  // Recur
                chosen.remove(chosen.size() - 1);  // Undo choice (Backtracking)
                used[i] = false;  // Unmark
            }
        }
    }

    public static void main(String[] args) {
        char[] elements = {'1', '2', '3', '4', '5'};  // Given set of elements
        int r = 3;  // Choose r elements
        boolean[] used = new boolean[elements.length];  // Track used elements
        generatePermutations(new ArrayList<>(), used, elements, r);
    }
}
