public class Zoomcar {
    public static void main(String[] args) {
        ZoomcarRentals c1 = new ZoomcarRentals("Toyota", "Camry", 50.0);
        ZoomcarRentals c2 = new ZoomcarRentals("Honda", "Accord", 0.0);
        ZoomcarRentals c3 = new ZoomcarRentals("Ford", "Mustang", 75.0);
        ZoomcarRentals c4 = new ZoomcarRentals("Hyundai", "Venue", 30.0);
        c1.displayCarInfo();
        c2.displayCarInfo();
        c3.displayCarInfo();
        c4.displayCarInfo();
    }
}
