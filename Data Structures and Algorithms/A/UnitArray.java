import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class UnitArray {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(bf.readLine());
            StringBuilder sb = new StringBuilder();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            int product = 1;
            for(int i = 0; i < n; i++){
                sum += arr[i];
                product *= arr[i];
            }

            if(sum >= 0 && product == 1) sb.append(0);
            else {
                int c1 = Integer.MAX_VALUE;
                int c2 = Integer.MAX_VALUE;
                int i = 0;
                
                List<Integer> l = new ArrayList<>();
                while (sum<0 || product!=1) {
                    
                    if(i>=arr.length) break;
                    if(arr[i]==-1){
                        arr[i] = 1;
                        l.add(i);
                        if(c1==Integer.MAX_VALUE)c1=0;
                        c1++;
                    }
                    sum = 0; product = 1;
                    for(int k = 0; k < arr.length; k++){
                        sum+=arr[k];
                        product *= arr[k];
                    }
                    i++;
                }
                i = 0;
                for(int k = 0; k < l.size(); k++){
                    arr[l.get(k)] = -1;
                }
                while (sum < 0 || product!=1) {
                    if(i>=n) break;
                    if(arr[i]==1){
                        arr[i] = -1;
                        if(c2==Integer.MAX_VALUE) c2 = 0;
                        c2++;
                    }
                    sum = 0; product = 1;
                    for(int k = 0; k < arr.length; k++){
                        sum+=arr[k];
                        product *= arr[k];
                    }
                    i++;
                }
                int count = Math.min(c1, c2);
                sb.append(count);
            }
            System.out.println(sb);
        }
        bf.close();
    }

}
