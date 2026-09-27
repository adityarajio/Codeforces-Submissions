import java.util.*;

public class DoremysPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            if(isGoodArray(a)){
                System.out.println("Yes");
            }else{
                if(canArrangeAdjacentSum(a)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }

    public static boolean canArrangeAdjacentSum(int[] arr){
        if (arr == null || arr.length == 0) return false;
        if(arr.length==1) return true;
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num: arr){
            counts.put(num, counts.getOrDefault(num, 0)+1);
        }
        if(counts.size()>2){
            return false;
        }
        if (counts.size() == 1) {
            return true;
        }
        Integer[] uniqueNums = counts.keySet().toArray(new Integer[0]);
        int x = uniqueNums[0];
        int y = uniqueNums[1];
        int countX = counts.get(x);
        int countY = counts.get(y);
        return Math.abs(countX - countY) <= 1;
    }
    public static boolean isGoodArray(int arr[]){
        int k = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int sum = arr[i] + arr[i==arr.length-1?0:i+1];
            if(k==Integer.MIN_VALUE) k = sum;
            if(k!=sum){
                return false;
            }
        }
        return true;
    }
}
