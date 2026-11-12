import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StubbornPen {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(bf.readLine());
            String s = bf.readLine();
            int o = 0;
            if(s.charAt(0)=='B') o++;
            for(int i = 1; i < n; i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    o++;
                }
            }

            sb.append(o);
            System.out.println(sb);
        }
        bf.close();
    }
}
