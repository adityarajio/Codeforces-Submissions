import java.util.*;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            if(isSorted(a)){
                int d = Integer.MAX_VALUE;
                Arrays.sort(a);
                for(int i = 1; i < n; i++){
                    d =  Math.min(Math.abs(a[i]-a[i-1]), d);
                }

                System.out.println(d/2 + 1);

            }else{
                System.out.println(0);
            }

        }
        sc.close();
    }

    public static boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
