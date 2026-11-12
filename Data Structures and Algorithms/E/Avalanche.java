import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Avalanche {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine()); 
        while (t-- >0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(bf.readLine());
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken()) & 1;
            }

            int[] m = new int[n + 1];
            int w = 0;
            int total = 0;

            for (int j = n; j >= 1; j--) {
                m[j] = a[j] ^ w;
                total ^= m[j];
                w ^= m[j];
                if (j + k <= n) {
                    w ^= m[j + k];
                }
            }

            if(total%2==0){
                sb.append("Bob");
            }else{
                sb.append("Alice");
            }

            System.out.println(sb);

        }
        bf.close();
    }
}
