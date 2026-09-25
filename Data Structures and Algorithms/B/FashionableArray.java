import java.util.*;

public class FashionableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[101];
            int maxCount = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;
                maxCount = Math.max(maxCount, freq[x]);
            }
            StringBuilder line = new StringBuilder();
            for (int round = 1; round <= maxCount; round++) {
                for (int v = 100; v >= 1; v--) {
                    if (freq[v] >= round) {
                        if (line.length() > 0) line.append(' ');
                        line.append(v);
                    }
                }
            }
            System.out.println(line);
        }
        sc.close();
    }
}