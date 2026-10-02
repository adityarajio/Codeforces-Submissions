import java.util.*;

public class PrefixAndSuffixCanBeSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(n==0) break;
            String s = sc.next();
            int k = 0;
            for(int l = n - 1; l >= 1; l--){
                if(s.substring(0, l).equals(s.substring(n - l))){
                    k = l;
                    break;
                }
            }
            System.out.println(s + s.substring(k));
        }
        sc.close();
    }
}
