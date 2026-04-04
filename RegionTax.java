import java.util.Scanner;

public class RegionTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        long income = sc.nextLong();
        long tax = 0;
        boolean valid = true;
        
        switch (code) {
            case 1:
                tax = (long) (income * 0.05);
                break;
            case 2:
                tax = (long) (income * 0.06);
                break;
            case 3:
                tax = (long) (income * 0.07);
                break;
            case 4:
                tax = (long) (income * 0.08);
                break;
            default:
                valid = false;
        }
        
        if (valid) System.out.println(tax);
        else System.out.println("Invalid Region");
        
        sc.close();
    }
}
