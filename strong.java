import java.util.*;

public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, temp = n;
        while(temp > 0) {
            int digits = temp % 10, fact = 1;
            for(int i = 1; i <= digits; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        if(sum == n) System.out.println("Strong");
        else System.out.println("Not strong");
        sc.close();
    }
}
