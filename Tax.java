import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double t = i < 300000 ? i * 0.05 : (i <= 1000000 ? i * 0.10 : i * 0.15);
        t = i > 2000000 ? t * 1.01 : t;
        System.out.println(t);
        sc.close();
    }
}
