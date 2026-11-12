import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreePiles {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int arr[] = new int[3];
            
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if(arr[1]==arr[2]-1 && arr[0]+1==arr[1]){
                sb.append("YES");
            }else{
                sb.append("NO");
            }

            System.out.println(sb);
            
        }
        bf.close();
    }
}
