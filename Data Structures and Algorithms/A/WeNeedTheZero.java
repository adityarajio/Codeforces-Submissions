import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WeNeedTheZero {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a[] = new int[n];
            st = new StringTokenizer(bf.readLine());
            for(int i = 0; i < n; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            int b[] = new int[n];
            for(int i = 0; i < n; i++){
                b[i] = a[i];
            }
            int x = -1;
            for(int i = 0; i < Math.pow(2, 8); i++){
                for(int j = 0; j < n; j++){
                    b[j] ^= i;
                }
                if(isXOR(b)){
                    x = i;
                    break;
                }else{
                    for(int k = 0; k < n; k++){
                        b[k] = a[k];
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(x);
            System.out.println(sb);
        }
        bf.close();
    }

    public static boolean isXOR(int arr[]){
        int tXor = 0;
        for(int num: arr){
            tXor ^= num;
        }
        return tXor==0;
    }
}