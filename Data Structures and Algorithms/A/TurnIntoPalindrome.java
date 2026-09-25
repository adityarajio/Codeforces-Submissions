import java.util.*;

public class TurnIntoPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            if(isPalindrone(s)){
                System.out.println(0);
            }else{
                char[] p = s.toCharArray();
                int coins = 0;
                for(int i = 0; i < n/2; i++){
                    if(p[i]!=p[n-i-1]){
                        if(p[n-i-1]==c || p[i]==c){
                            coins++;
                        }else{
                            coins += 2;
                        }
                    }
                }
                System.out.println(coins);
            }

        }
        sc.close();
    }
    public static boolean isPalindrone(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
