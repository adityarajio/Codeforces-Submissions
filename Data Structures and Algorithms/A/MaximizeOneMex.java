import java.util.*;

public class MaximizeOneMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int kthMax = getKthBigMex(a, n, k);
            int iniKthMax = kthMax;
            int bP = -1;
            int bQ = -1;

            for(int p = 0; p < n; p++){
                for(int q= p+1; q<n; q++){
                    swap(a, p, q);
                    int curKthMax = getKthBigMex(a, n, k);
                    if(curKthMax > iniKthMax){
                        iniKthMax =curKthMax;
                        bP = p;
                        bQ = q;
                    }
                    swap(a, p, q);
                }
            }
            if(bP==-1 || bQ==-1){
                System.out.println(-1);
            }else{
                System.out.println((bP+1)+" "+(bQ+1));
            }
        }
        sc.close();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int getKthBigMex(int[] arr, int n, int k) {
        int[] f = new int[n];
        boolean[] pre = new boolean[n + 2];
        int mex = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < pre.length) {
                pre[arr[i]] = true;
            }
            while (pre[mex]) {
                mex++;
            }
            f[i] = mex;
        }
        
        Arrays.sort(f);
        return f[n - k];
    }
}