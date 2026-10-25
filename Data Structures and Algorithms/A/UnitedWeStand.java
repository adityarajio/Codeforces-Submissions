import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            int even = 0;
            int odd = 0;
            for(int i = 0; i < n; i++){
                if(a[i]%2==0) even++;
                else odd++;
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                if(a[i]<min){
                    min = a[i];
                }
                if(a[i]>max){
                    max = a[i];
                }
            }
            if(even!=0 && odd!=0){
                for(int i = 0; i < n; i++){
                    if(a[i]%2!=0) b.add(a[i]);
                    else c.add(a[i]);
                }
                System.out.println(b.size()+" "+c.size());
                for(int e: b){
                    System.out.print(e+" ");
                }
                System.out.println();
                for(int e: c){
                    System.out.print(e+" ");
                }
                System.out.println();
            }

            else {
                if(min == max){
                    System.out.println(-1);
                }else{
                    for(int i = 0; i < n; i++){
                        if(a[i]!=min) c.add(a[i]);
                        else b.add(a[i]);
                    }
                    System.out.println(b.size()+" "+c.size());
                    for(int e: b){
                        System.out.print(e+" ");
                    }
                    System.out.println();
                    for(int e: c){
                        System.out.print(e+" ");
                    }
                    System.out.println();
                }
            }

        }
        sc.close();
    }
}