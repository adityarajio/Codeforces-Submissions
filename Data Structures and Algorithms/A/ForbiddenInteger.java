import java.io.*;
import java.util.*;

public class ForbiddenInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            if(x!=1){
                sb.append("YES\n");
                sb.append(n).append("\n");
                for(int i = 0; i < n; i++){
                    sb.append(1).append(i == n-1? "": " ");
                }
                sb.append("\n");
            }else if(k==1 || (k==2 && n%2==1)){
                sb.append("NO\n");
            }else{
                sb.append("YES\n");
                int m = n/2;
                sb.append(m).append("\n");
                sb.append(n%2==1? 3: 2);
                for(int i = 1; i < m; i++){
                    sb.append(" ").append(2);
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
        
    }
}