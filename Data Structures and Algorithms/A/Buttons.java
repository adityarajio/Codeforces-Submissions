import java.util.*;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int an = c%2==0? (c/2)+a: ((c-1)/2)+1 + a;
            int kate = c%2==0? (c/2)+b: ((c-1)/2) + b;
            if(kate > an){
                System.out.println("Second");
            }else if(kate==an) {
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
        sc.close();
    }
}
