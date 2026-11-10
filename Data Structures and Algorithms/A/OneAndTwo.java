import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OneAndTwo {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(bf.readLine());
            StringBuilder sb = new StringBuilder();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }

            int k = 1001;
            for(int i = 0; i < n-1; i++){
                long s1 = 0;
                for(int s = 0; s <= i; s++){
                    if(a[s]==2) s1++;
                }

                long s2 = 0;
                for(int j = i+1; j < n; j++){
                    if(a[j]==2) s2++;
                }

                if(s1==s2){
                    k = Math.min(k, i+1);
                }
            }

            if(k==1001){
                sb.append(-1);
            }else{
                sb.append(k);
            }
            
            System.out.println(sb);
        }
    }
}