import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrependAndAppend {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine().trim());
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();
            int l = 0;
            int i = 0;
            int j = n-1;
            while (i<=j) {
                if((s.charAt(i)=='0' && s.charAt(j)=='1') ||( s.charAt(j)=='0' && s.charAt(i)=='1')){
                    i++;
                    j--;
                    continue;
                }
                if(s.charAt(i)==s.charAt(j)  && i!=j){
                    l = j-i+1;
                    break;
                }
                if(i==j){
                    i++;
                    j--;
                    l++;
                    continue;
                }
                l += 2;
                i++;
                j--;
            }
            sb.append(l);
            System.out.println(sb);
        }
        bf.close();
    }
}
