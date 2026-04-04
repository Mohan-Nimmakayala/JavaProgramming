import java.util.Scanner;

public class WeatherAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        int temp = sc.nextInt();
        
        if (code == 1) System.out.println("Sunny");
        else if (code == 2) System.out.println("Rainy");
        else if (code == 3) {
            if (temp < 10) System.out.println("Severe Warning");
            else System.out.println("Stormy");
        } 
        else System.out.println("Invalid Condition");
        
        sc.close();
    }
}
