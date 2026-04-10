public class BrightFuture {
    int ID;
    String name;
    String status;
    
    BrightFuture(int ID, String name, String status) {
        this.ID = ID;
        this.name = name;
        this.status = status;
    }

    void displayAttendance() {
        if(ID == 0) System.out.println("ID must be positive");
        else if(name == null) System.out.println("Name should not be null");
        else if(!status.equals("Present") && !status.equals("Absent")) System.out.println("Status must be \"Present\" or \"Absent\"");
        else System.out.println("ID: "+ID+", Name: "+name+", Status: "+status);
    }
}