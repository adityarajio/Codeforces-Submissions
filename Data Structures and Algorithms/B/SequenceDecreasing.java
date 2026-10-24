import java.util.*;

public class SequenceDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                if(a[i]<min){
                    min = a[i];
                }
            }

            if(min<=n-1){
                System.out.println(n);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }


}
