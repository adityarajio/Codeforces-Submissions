import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GrapefruitJuice {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            int a[] = new int[n];
            st = new StringTokenizer(bf.readLine());
            for(int i = 0; i < n; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            long alls = allSum(a);
            long allp = allP(a, n, p, k);

            long max = Math.max(alls, allp);
            StringBuilder sb = new StringBuilder();
            sb.append(max);
            System.out.println(max);

        }
        bf.close();
    }

    public static long allSum(int arr[]){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static long allSum(int arr[], int start, int end){
        long sum = 0;
        for(int i = start; i < end; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static long allP(int arr[], int n, int p, int k){
        Arrays.sort(arr);
        int remain = n%k;
        int cur = n/k;
        int idx = 0;
        long sum = 0;
        for(int i = 1; i <= cur; i++){
            if(p > allSum(arr, idx, idx+k)){
                sum += p;
            }else{
                sum += allSum(arr, idx, idx+k);
            }
            idx += k;
        }
        for (int i = n - remain; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
