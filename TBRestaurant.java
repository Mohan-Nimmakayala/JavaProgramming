public class TBRestaurant {
    public static void main(String[] args) {
        TasteBites item1 = new TasteBites("Spring rolls", 5.99, "Appetizer");
        TasteBites item2 = new TasteBites("Pasta", 0.00, "Main Course");
        TasteBites item3 = new TasteBites("Cheesecake", 6.99, "Dessert");
        item1.showMenu();
        item2.showMenu();
        item3.showMenu();
    }
}
