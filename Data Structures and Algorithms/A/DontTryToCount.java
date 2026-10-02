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
            for(int i = 0; i < n; i++){
                for(int j = i+1; j < n; j++){
                    String ss = x.substring(i, j);
                    if(s.toString().contains(ss)){
                        break;
                    }
                    else{
                        operations++;
                    }
                }
            }
            System.out.println(operations);
        }
        sc.close();
    }    
}