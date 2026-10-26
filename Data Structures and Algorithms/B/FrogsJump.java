import java.util.*;

public class FrogsJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int k = 0;
            for(int i = 0; i < n; i++){
                if(s1.charAt(i)=='f') k++;
                if(s2.charAt(i)=='f') k++;
            }
            System.out.println(k%2);
        }
        sc.close();
    }
}
