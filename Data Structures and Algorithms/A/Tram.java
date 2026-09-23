import java.util.*;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cap = 0;
        int maxCapacity = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            cap += b - a;
            if(cap>maxCapacity){
                maxCapacity = cap;
            }
        }
        System.out.println(maxCapacity);
        sc.close();
    }
}
