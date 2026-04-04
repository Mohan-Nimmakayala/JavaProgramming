import java.util.*;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (in Fahrenheit): ");
        int f = sc.nextInt();
        double c = (f - 32) * 5/9;
        System.out.println("The temperature in Celsius is : "+c);
        sc.close();
    }
}