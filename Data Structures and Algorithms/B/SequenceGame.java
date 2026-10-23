import java.util.*;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); // length of sequence b
            int b[] = new int[n];
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }
            List<Integer> list = new ArrayList<>();
            list.add(b[0]);
            for(int i = 1; i < n; i++){
                if(b[i-1]<b[i] || b[i-1]==b[i]){
                    list.add(b[i]);
                }else{
                    list.add(b[i]);
                    list.add(b[i]);
                }
            }

            System.out.println(list.size());
            for(int i: list){
                System.out.print(i+" ");
            }
            System.out.println();

        }
        sc.close();
    }
}
