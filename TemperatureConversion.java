import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (in Celsius): ");
        int c = sc.nextInt();
        double f = c * 9/5 + 32;
        System.out.println("The temperature in Fahrenheit is : "+f);
        sc.close();
    }
}