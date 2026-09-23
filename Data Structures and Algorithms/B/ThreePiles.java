import java.util.*;

public class ThreePiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long score;
            if(a>=b){
                score = (a-b) + c;
            }else{
                long diff = b - a;
                score = Math.max(diff, c - diff);
            }
            System.out.println(score);

        }
        sc.close();
    }
}