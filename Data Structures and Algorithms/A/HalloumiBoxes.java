import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            boolean alreadySorted = true;
            for(int i = 1; i < n; i++){
                if(!(nums[i]>=nums[i-1])){
                    alreadySorted = false;
                    break;
                }
            }
            if(alreadySorted){
                System.out.println("YES");
            }else{
                if(k>=2){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
