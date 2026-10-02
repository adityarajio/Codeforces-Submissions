import java.util.*;

public class PseudoPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long d = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            boolean ok = false;
            if (n % 2 == 0) {
                ok = check(a, -1, d);
            }else{
                for (int skip = 0; skip < n && !ok; skip++) {
                    ok = check(a, skip, d);
                }
            }
            System.out.println(ok? "YES":"NO");
        }
        sc.close();
    }

    static boolean check(long[] a, int skip, long d) {
        int n = a.length;
        long prev = -1;
        boolean hasPrev = false;
        for (int i = 0; i < n; i++) {
            if (i == skip) continue;
            if (!hasPrev) {
                prev = a[i];
                hasPrev = true;
            } else {
                if (a[i] - prev > d) return false;
                hasPrev = false;
            }
        }
        return true;
    }
}
