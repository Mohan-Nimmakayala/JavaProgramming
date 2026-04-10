public class Greenwood {
    String name;
    int rollNumber;
    int grade;

    Greenwood(String name, int rollNumber, int grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    void showProfile() {
        if(name == null) System.out.println("Invalid name");
        else if(rollNumber == 0) System.out.println("Roll number must be positive");
        else if(grade > 12) System.out.println("Grade level must be between 1 and 12");
        else System.out.println("Name: "+name+", Roll Number: "+rollNumber+", Grade: "+grade);
    }
}
