import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vehicle type (Car, Bike, Truck): ");
        String vehicleType = sc.next().toLowerCase();
        System.out.print("Enter the time of arrival (24-hour format, e.g., 14 for 2 PM): ");
        int arrival = sc.nextInt();
        System.out.print("Enter the time of departure (24-hour format, e.g., 18 for 6 PM): ");
        int departure = sc.nextInt();

        int hours = departure - arrival;
        if (hours < 0) hours = hours + 24;

        double fee = 0;
        if (vehicleType.equals("car")) fee = hours * 50;
        else if (vehicleType.equals("bike")) fee = hours * 30;
        else if (vehicleType.equals("truck")) fee = hours * 100;

        if (hours > 5) fee = fee - (fee * 0.20);

        boolean surcharge = false;
        int current = arrival;
        for (int i = 0; i < hours; i++) {
            if (current >= 18 || current < 8) surcharge = true;
            current = (current + 1) % 24;
        }

        if (surcharge) fee = fee + (fee * 0.50);

        System.out.println("Total parking fee: \u20B9" + fee);
        sc.close();
    }
}
