import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n % 5 == 0 ? "Divisible by 5" : "Not divisible by 5");
        sc.close();
    }
}
