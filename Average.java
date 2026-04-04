import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three test scores of student: " );
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double avg = (a+b+c)/3.0;
        System.out.println("Average: "+(int)avg);
        sc.close();
    }
}
