import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindingShapesInClouds {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine().trim());
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(bf.readLine().trim());
            String s = bf.readLine().trim();
            boolean pos = (n % 2 == 0);
            if (pos) {
                boolean alt = true;
                for (int i = 1; i < n; i++) {
                    if (s.charAt(i) == s.charAt(i - 1)) {
                        alt = false;
                        break;
                    }
                }
                pos = !alt;
            }
            sb.append(pos ? "YES" : "NO");
            System.out.println(sb);
        }
        bf.close();
    }
}