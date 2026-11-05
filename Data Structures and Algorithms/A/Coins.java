import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coins {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(bf.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            StringBuilder sb = new StringBuilder();
            if((n%(2+k)==0 || (2+k)%n==0) || (n%k==0 || n%2==0) || (n%2==(2+k)%2)){
                sb.append("YES");
            }else{
                sb.append("NO");
            }
            System.out.println(sb);
        }
        bf.close();
    }
}
