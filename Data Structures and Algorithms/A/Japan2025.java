import java.util.*;

public class Japan2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            int sum = ((n*n)*((n+1)*(n+1)))/4;
            System.out.println(sum);
        }
        sc.close();
    }
}
