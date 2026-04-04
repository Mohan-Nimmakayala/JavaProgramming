import java.util.*;

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sq = num*num, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        if(sum == num) System.out.println("Neon");
        else System.out.println("Not neon");
        sc.close();
    }
}
