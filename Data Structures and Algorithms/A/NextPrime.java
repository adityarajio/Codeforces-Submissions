import java.util.*;
public class NextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean hasPrime = false;
        for(int i = n+1; i < m; i++){
            if(isPrime(i)){
                hasPrime = true;
                break;
            }
        }
        if(hasPrime){
            System.out.println("NO");
        }else{
            if(isPrime(m)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    static boolean isPrime(int x){
        if(x<= 1){
            return false;
        }
        for(int i = 2; i < x; i++){
            if(x%i==0) return false;
        }
        return true;
    }
}
