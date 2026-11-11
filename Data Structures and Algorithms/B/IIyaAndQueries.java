import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IIyaAndQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int m = Integer.parseInt(bf.readLine());
        int queries[][] = new int[m][2];

        int prefix[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            prefix[i] = prefix[i - 1];

            if (s.charAt(i) == s.charAt(i - 1)) {
                prefix[i]++;
            }
        }
        int ans[] = new int[m];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 2; j++) {
                queries[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < m; i++) {
            ans[i] = prefix[queries[i][1] - 1] - prefix[queries[i][0] - 1];
        }

        for (int i : ans) {
            System.out.println(i);
        }
        bf.close();
    }
}