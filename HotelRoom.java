import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int season = sc.nextInt();
        
        switch (room) {
            case 1:
                if (season == 1) System.out.println("$100");
                else if (season == 2) System.out.println("$80");
                else System.out.println("Invalid Input");
                break;
            case 2:
                if (season == 1) System.out.println("$200");
                else if (season == 2) System.out.println("$150");
                else System.out.println("Invalid Input");
                break;
            default:
                System.out.println("Invalid Input");
        }
        
        sc.close();
    }
}
