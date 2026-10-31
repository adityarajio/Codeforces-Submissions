import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlankSpace {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine().trim());
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int arr[] = new int[n];
            st = new StringTokenizer(bf.readLine());
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int l = 0;
            for(int i = 0; i < n; i++){
                if(arr[i]==0){
                    int s = 0;
                    for(int j = i; j < n; j++){
                        if(arr[j]==1) break;
                        s++;
                    }
                    l = Math.max(l, s);
                }
            }

            sb.append(l);
            System.out.println(l);
        }
        bf.close();
    }
}
