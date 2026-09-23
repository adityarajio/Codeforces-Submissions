import java.util.*
;
public class AndOrSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int z = 0;
            int o = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    z++;
                }
            }
            if (s.charAt(0) == '1') {
                System.out.println(z);
            }
            else{
                int operations = n;
                for(int i = 0; i < n; i++){
                    if(s.charAt(i)=='1'){
                        o++;
                    }else{
                        z--;
                    }
                    operations = Math.min(operations, o+z);
                }
                System.out.println(operations);
            }
        }
        sc.close();
    }
}

