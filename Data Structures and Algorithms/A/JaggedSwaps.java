import java.util.*;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            if(isPermutation(a)){
                if(isSorted(a)){
                    System.out.println("YES");
                }else{
                    boolean sorted = false;
                    for(int j = 0; j < n; j++){
                        for(int i = 1; i < n-1; i++){
                            if(a[i-1]<a[i] && a[i]>a[i+1]){
                                int temp = a[i+1];
                                a[i+1] = a[i];
                                a[i] = temp;
                                if(isSorted(a)){
                                    sorted = true;
                                    break;
                                }
                            }
                        }
                        if(sorted){
                            break;
                        }
                    }
                    if(isSorted(a)){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }else{
                System.out.println("NO");
            }

        }
        sc.close();
    }

    public static boolean isSorted(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutation(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i]>arr.length || arr[i]==arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
