package baiscquestion;

public class PrintNumber {
    public static void main(String[] args) {
        Recursion(3);
    }
//    int count = 0;
static void Recursion(int count) {
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        Recursion(count);
    }
}
