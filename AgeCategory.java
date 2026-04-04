import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a < 12 ? "Child" : a <= 19 ? "Teenager" : a <= 64 ? "Adult" : "Senior");
        sc.close();
    }
}