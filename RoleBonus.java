import java.util.Scanner;

public class RoleBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        long salary = sc.nextLong();
        long bonus = 0;
        boolean valid = true;
        
        switch (code) {
            case 1:
                bonus = (long) (salary * 0.10);
                break;
            case 2:
                bonus = (long) (salary * 0.05);
                break;
            case 3:
                bonus = 500;
                break;
            default:
                valid = false;
        }
        
        if (valid) System.out.println(bonus);
        else System.out.println("Invalid Role");
        
        sc.close();
    }
}
