import java.util.*;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            StringBuilder x = new StringBuilder(sc.next());
            StringBuilder s = new StringBuilder(sc.next());
            int operations = 0;
            while(x.indexOf(s.toString())==-1){
                x.append(x);
                n*=2;
                operations++;
                if(n>25 && x.indexOf(s.toString())==-1) {
                    operations = -1;
                    break;
                }
            }

            System.out.println(operations);
        }
        sc.close();
    }    
}