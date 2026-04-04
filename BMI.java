import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        
        System.out.printf("BMI: %.2f\n", bmi);
        
        if (bmi < 18.5) System.out.println("Category: Underweight");
        else if (bmi <= 24.9) System.out.println("Category: Normal");
        else if (bmi <= 29.9) System.out.println("Category: Overweight");
        else System.out.println("Category: Obese");
        
        sc.close();
    }
}
