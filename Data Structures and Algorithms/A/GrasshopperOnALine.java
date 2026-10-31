import java.util.Scanner;

public class GrasshopperOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int k = sc.nextInt();

            if(x%k!=0){
                System.out.println(1);
                System.out.println(x);
            }else{
                int s = k - 1;
                System.out.println(2);
                System.out.println((x-s)+" "+s);
            }
        }
        sc.close();
    }
}
