import java.util.*;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), digits = 0, temp = num;
        long sq = num*num;
        while(temp > 0) {
            digits++;
            temp /= 10;
        }
        int mod = 1;
        for(int i = 0; i < digits; i++) mod *= 10;
        if(sq % mod == num) System.out.println("Automorphic");
        else System.out.println("Not Automorphic");
        sc.close();
    }
}
