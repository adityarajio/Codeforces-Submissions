import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WalkingMaster {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());
            StringBuilder sb = new StringBuilder();
            long moves = 0;
            if(b > d || a + (d-b) < c){
                moves = -1;
            }else{
                moves = d-b + (a+d-b-c);
            }
            sb.append(moves);
            System.out.println(moves);
        }
        bf.close();
    }
}
