import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        System.out.println(h >= 5 && h < 12 ? "Good Morning"
                : h >= 12 && h < 17 ? "Good Afternoon" : h >= 17 && h < 22 ? "Good Evening" : "Good Night");
        sc.close();
    }
}
