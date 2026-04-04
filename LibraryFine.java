import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        int days = sc.nextInt();
        int fine = 0;
        boolean valid = true;
        
        switch (code) {
            case 1:
                fine = days * 1;
                break;
            case 2:
                fine = days * 2;
                break;
            case 3:
                fine = days * 5;
                break;
            default:
                valid = false;
        }
        
        if (valid) System.out.println(fine);
        else System.out.println("Invalid Code");
        
        sc.close();
    }
}
