import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            String output = "";

            if(s.length()>10){
                output += "" + s.charAt(0)+ (s.length()-2) + s.charAt(s.length()-1);
            }else{
                output += s;
            }

            System.out.println(output);
        }
    }
}
