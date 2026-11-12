import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LettersDown {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            StringBuilder sb = new StringBuilder();
            char[] f = bf.readLine().trim().toCharArray();
            int o = 0;
            for(char c = 'z'; c >= 'b'; c--){
                boolean ne = false;
                for(int i = 0, j = n-1; i < j; i++, j--){
                    if(f[i]!=f[j] && Math.max(f[i], f[j])==c){
                        ne = true;
                        break;
                    }
                }
                if(ne){
                    o++;
                    for(int i = 0; i < n; i++){
                        if(f[i]==c){
                            f[i] = (char)(c-1);
                        }
                    }
                }
            }
            sb.append(o);
            System.out.println(sb);
        }
        bf.close();
    }
}
