import java.util.*;

public class GoodContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int minSolved = n;
            for(int i = 0; i < 3; i++){
                int solved = sc.nextInt();
                minSolved = Math.min(minSolved, solved);
            }
            int weakPar = n - minSolved;
            System.out.println(weakPar);
        }
        sc.close();
    }
}
