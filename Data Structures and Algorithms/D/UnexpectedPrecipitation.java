import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UnexpectedPrecipitation {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(bf.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine().trim());
            int x[] = new int[n];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < n; i++) {
                x[i] = Integer.parseInt(st.nextToken());
            }
            int y[] = new int[n];
            st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < n; i++) {
                y[i] = Integer.parseInt(st.nextToken());
            }
            long s1 = 0, s2 = 0;

            for (int i = n - 1; i >= 0; i--) {
                long sbuy = (x[i] - y[i]) + s1;
                long sS = s2;
                long nsl = Math.max(sS, sbuy);

                long abuy = (y[i] - x[i]) + s2;
                long as = s1;
                long nar = Math.min(as, abuy);
                s1 = nsl;
                s2 = nar;
            }

            long d = s1;
            if (d > 0) sb.append("Sunny\n");
            else if (d < 0) sb.append("Aubrey\n");
            else sb.append("Draw\n");
        }
        System.out.print(sb);
        bf.close();
    }
}