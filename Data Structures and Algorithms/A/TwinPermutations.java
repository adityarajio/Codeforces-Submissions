import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwinPermutations {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(bf.readLine());
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 0; i < n; i++){
                b[i] = n+1-a[i];
            }
            
            for(int i = 0; i < n; i++){
                if(i==n-1) sb.append(b[i]);
                else sb.append(b[i]+" ");
            }

            System.out.println(sb);
        }
        bf.close();
    }

}
