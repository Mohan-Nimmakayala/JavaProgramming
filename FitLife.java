public class FitLife {
    String name;
    int steps;
    double cal;

    FitLife(String name, int steps, double cal) {
        this.name = name;
        this.steps = steps;
        this.cal = cal;
    }

    void tracker() {
        if(name == null) System.out.println("Invalid name");
        else if(steps <= 0) System.out.println("Steps must be non-negative");
        else if(cal <= 0) System.out.println("Calories must be non-negative");
        else {
            System.out.printf("User: "+name+", Steps: "+steps+", Calories Burned: %.2f",cal);
            System.out.println();
        }
    }
}
