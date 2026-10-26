import java.util.*;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            if(n>2){
                Arrays.sort(a);
                boolean possible = false;
                int blue = 0;
                int red = 0;
                for(int i = 0; i < n; i++){
                    for(int k = 0; k <= i; k++){
                        blue += a[k];
                    }
                    for(int j = i+1; j < n; j++){
                        red += a[j];
                    }
                    if(i==n-1){
                        continue;
                    }
                    if((blue+red)%2==0){
                        possible = true;
                        break;
                    }

                    blue = 0;
                    red = 0;
                }
                if(possible){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                if(n==2){
                    if(allEven(a) || allOdd(a)){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
    public static boolean allEven(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2!=0) return false;
        }
        return true;
    }
    public static boolean allOdd(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2==0) return false;
        }
        return true;
    }
}