public class ZoomcarRentals {
    String brand;
    String model;
    double price;

    ZoomcarRentals(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayCarInfo() {
        if(brand == null) System.out.println("Invalid brand");
        else if(model == null) System.out.println("Invalid model");
        else if(price == 0.0) System.out.println("Rental price must be positive");
        else {
            System.out.printf("Brand: "+brand+", Model: "+model+", Price per day: %.2f",price);
            System.out.println();
        }
    }
}
