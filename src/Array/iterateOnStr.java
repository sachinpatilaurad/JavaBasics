package Array;

public class iterateOnStr {
    public static void main(String[] args) {
        String ch = "sachin patil";
        int cnt =0 ;
        int ans = count(cnt,ch);
        System.out.println(ans);
    }
    static int count(int cnt,String ch) {
        for (int i = ch.length() - 1; i > 0; i--) {
            if (ch.charAt(i) == ' ')
                cnt++;
        }
        return cnt;
    }
}
