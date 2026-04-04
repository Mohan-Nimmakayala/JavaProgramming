import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(t > 30 ? "Hot" : t >= 15 ? "Moderate" : "Cold");
        sc.close();
    }
}
