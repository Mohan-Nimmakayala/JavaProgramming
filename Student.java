public class Student {
    String name;
    int rollnumber;
    int[] marks;

    Student() {
        this.name = "Unknown";
        this.rollnumber = 0;
        this.marks = new int[] {0,0,0};
    }

    Student(String name, int roll, int[] marks) {
        this.name = name;
        this.rollnumber = roll;
        this.marks = new int[3];
        for(int i = 0; i < 3; i++) this.marks[i] = marks[i];
    }

    void displayDetails() {
        System.out.println("Name : "+name);
        System.out.println("Roll number : "+rollnumber);
        System.out.println("Marks : ");
        for(int i = 0; i < marks.length; i++) System.out.println("Subject "+(i+1)+": "+marks[i]);
    }

    int totalMarks() {
        int total = 0;
        for(int i : marks) total += i;
        return total;
    }

    double averageMarks() {
        return totalMarks()/3.0;
    }
}
