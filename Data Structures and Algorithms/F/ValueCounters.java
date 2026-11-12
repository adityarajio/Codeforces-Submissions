import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValueCounters {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine().trim());
        
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(bf.readLine().trim());
            int[] c = new int[n + 1];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int i = 1; i <= n; i++) c[i] = Integer.parseInt(st.nextToken());

            int[] p = new int[n + 1];
            boolean ok = true;
            for (int v = 1; v <= n && ok; v++) {
                long po = (long) c[v] + n - v + 1;
                if (po < 1 || po > n || p[(int) po] != 0) {
                    ok = false;
                } else {
                    p[(int) po] = v;
                }
            }
            if (!ok) {
                sb.append("-1\n");
            } else {
                for (int i = 1; i <= n; i++) {
                    sb.append(p[i]).append(i < n ? " " : "\n");
                }
            }
            System.out.print(sb);
        }

        bf.close();
    }
}
