public class TasteBites {
    String name;
    double price;
    String category;

    TasteBites(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void showMenu() {
        if(name == null) System.out.println("Invalid name");
        else if(price == 0) System.out.println("Price must be positive");
        else if(category == null) System.out.println("Invalid category");
        else {
            System.out.printf("Item: "+name+", Price: %.2f",price,", Category: "+category);
            System.out.println();
        }
    }
}
