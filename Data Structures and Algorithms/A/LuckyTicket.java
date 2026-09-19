import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n = sc.nextInt();
        String s = sc.next();
        int arr[] = new int[n];
        boolean isLuck = true;
        for(int i = 0; i < n; i++){
            arr[i] = s.charAt(i) - '0';
            if(arr[i]!=4 && arr[i]!=7){
                isLuck = false;
                break;
            }
        }
        if(isLuck){
            int lSum = 0;
            int rSum = 0;
            for(int i = 0; i < n/2; i++){
                lSum += arr[i];
            }
            for(int i = n/2; i < n; i++){
                rSum += arr[i];
            }
            if(lSum==rSum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }else{
            System.out.println("NO");
        }
    }
}
