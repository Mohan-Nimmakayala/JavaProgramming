public class BFAcademy {
    public static void main(String[] args) {
        BrightFuture s1 = new BrightFuture(101, "Emma Wilson", "Present");
        BrightFuture s2 = new BrightFuture(0, "Liam Brown", "Present");
        BrightFuture s3 = new BrightFuture(103, "Olivia Davis", "Late");
        BrightFuture s4 = new BrightFuture(104, "Noah Lee", "Absent");
        s1.displayAttendance();
        s2.displayAttendance();
        s3.displayAttendance();
        s4.displayAttendance();
    }
}
