import java.util.*;
public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int score = 0;
            char c[][] = new char[10][10];
            for(int i = 0; i < 10; i++){
                String s = sc.next();
                for(int j = 0; j < 10; j++){
                    c[i][j] = s.charAt(j);
                }
            }
            for(int i = 0; i < 5; i++){
                score += getRingScore(i, i, i, 9-i, 9-i, i, 9-i, 9-i, c);
            }
            System.out.println(score);

        }
        sc.close();
    }

    static int getRingScore(int f1, int f2, int s1, int s2, int t1, int t2, int l1, int l2, char[][] c){
        int score = 0;
        int toInc = 1;
        switch (f1) {
            case 0:
                toInc = 1;
                break;
            case 1:
                toInc = 2;
                break;
            case 2:
                toInc = 3;
                break;
            case 3:
                toInc = 4;
                break;
            case 4:
                toInc = 5;
                break;
        }
        for(int i = f2; i <= s2; i++){
            if(c[f1][i]=='X'){
                score+=toInc;
            }
            if(c[t1][i]=='X'){
                score+=toInc;
            }
        }

        for(int i = f1+1; i < t1; i++){
            if(c[i][f2]=='X'){
                score+=toInc;
            }
            if(c[i][s2]=='X'){
                score+=toInc;
            }
        }
        return score;
    }
}