import java.util.*;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int fuel = 0;
            int n = sc.nextInt();
            int x = sc.nextInt();
            int fuelStations[] = new int[n];
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                fuelStations[i] = sc.nextInt();
                list.add(fuelStations[i]);
            }
            int tempFuel = 0;
            for(int i = 0; i <= x; i++){
                if(list.contains(i)){
                    if(fuel<tempFuel){
                        fuel = tempFuel;
                    }
                    tempFuel = 0;
                }
                tempFuel++;

            }
            for(int i = x-1; i >= 0; i--){
                if(list.contains(i)){
                    if(fuel<tempFuel){
                        fuel = tempFuel;
                    }
                    tempFuel = 0;
                }
                tempFuel++;
            }
            System.out.println(fuel);
        }
        sc.close();
    }
}
