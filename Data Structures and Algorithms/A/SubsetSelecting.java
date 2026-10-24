import java.util.*;

public class SubsetSelecting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] c = new int[n + 2];
            for (int i = 0; i < n; i++) {
                c[sc.nextInt()]++;
            }

            int ans = 0;
            int pre = 0;
            for (int v = 0; v <= n; v++) {
                pre += c[v];
                if (c[v] >= 1 && pre >= (long) (v + 1) * k) {
                    ans++;
                } else {
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}