import java.util.*;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int eff[] = new int[n-1];
            for(int i = 0; i < n-1; i++){
                eff[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i = 0; i < n-1; i++){
                sum+=eff[i];
            }

            int result = -sum;
            System.out.println(result);
        }
        sc.close();
    }
}
