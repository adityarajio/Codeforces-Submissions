import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PicnicForTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int l = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int arr[] = new int[l];
            int s = 0;
            int i = 1;
            while (true) {
                if(arr[s]==1) break;
                arr[s] += 1;
                s = (a*i) % l;
                i++; 
            }

            i = 1;
            s = 0;
            while (true) {
                if(arr[s]==2) break;
                arr[s] += 1;
                s = (b*i) % l;
                i++;
            }

            int ideal = 0;
            for(int k = 0; k < l; k++){
                if(arr[k]==2) ideal++;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(ideal);
            System.out.println(sb);
        }
        bf.close();
    }
}