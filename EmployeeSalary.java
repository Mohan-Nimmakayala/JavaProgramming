import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int experience = sc.nextInt();
        int performance = sc.nextInt();
        double salary = 0;
        
        if (experience < 2) salary = 30000;
        else if (experience <= 5) salary = 50000;
        else salary = 70000;
        
        if (performance >= 8) salary = salary + (salary * 0.10);
        
        System.out.println(salary);
        sc.close();
    }
}
