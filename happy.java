import java.util.Scanner;
public class happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 1 && count < 100) {
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                sum += d * d;
                temp /= 10;
            }
            temp = sum;
            count++;
        }
        if (temp == 1) System.out.println("Happy");
        else System.out.println("Not Happy");
        sc.close();
    }
}