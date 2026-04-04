import java.util.Scanner;

public class AccountStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b >= 1000 ? "Good Standing" : b >= 500 ? "Low Balance" : "Account Overdrawn");
        sc.close();
    }
}
