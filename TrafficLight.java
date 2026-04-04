import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String light = sc.next();
        int hour = sc.nextInt();
        
        if (light.equals("Green")) {
            System.out.println("Go");
        } else if (light.equals("Red")) {
            System.out.println("Stop");
        } else if (light.equals("Yellow")) {
            if (hour >= 6 && hour <= 18) {
                System.out.println("Slow");
            } else {
                System.out.println("Stop");
            }
        }
        
        sc.close();
    }
}
