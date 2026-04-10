public class studentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        int[] marks = {92, 95, 89};
        Student s2 = new Student("Mohan", 101, marks);
        System.out.println("Details of Student 1: ");
        s1.displayDetails();
        System.out.println("Total marks: "+s1.totalMarks());
        System.out.println("Average marks: "+s1.averageMarks());
        System.out.println();
        System.out.println("Details of Student 2: ");
        s2.displayDetails();
        System.out.println("Total marks: "+s2.totalMarks());
        System.out.println("Average marks: "+s2.averageMarks());
    }
}
