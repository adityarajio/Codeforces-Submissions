import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BookOnShelf {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int h[] = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(h);
            int c[] = new int[n];

            int l = 0;
            int r = n - 1;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    c[l] = h[i];
                    l++;
                } else {
                    c[r] = h[i];
                    r--;
                }
            }

            boolean v[] = new boolean[n];
            int s = 0;
            for(int i = 0; i < n; i++){
                if(c[i]>s){
                    v[i] = true;
                    s = c[i];
                }
            }
            s = 0;
            for(int i = n-1; i >= 0; i--){
                if(c[i]>s){
                    v[i] = true;
                    s = c[i];
                }
            }

            int o = 0;
            for(int i = 0; i < n; i++){
                if(v[i]) o++;
            }
            sb.append(o).append("\n");
            for(int i = 0; i < n; i++){
                sb.append(c[i]);
                if(i<n-1) sb.append(" ");
            }
            System.out.println(sb);

        }
        bf.close();
    }
}
