import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a >= 1000 ? "20% discount" : a >= 500 ? "10% discount" : "No discount");
        sc.close();
    }
}
