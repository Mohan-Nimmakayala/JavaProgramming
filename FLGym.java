public class FLGym {
    public static void main(String[] args) {
        FitLife user1 = new FitLife("Sophie Green", 10000, 500.0);
        FitLife user2 = new FitLife("James White", -100, 300.0);
        FitLife user3 = new FitLife("Lily Brown", 12000, -50.0);
        FitLife user4 = new FitLife("Oliver Black", 15000, 600.0);
        user1.tracker();
        user2.tracker();
        user3.tracker();
        user4.tracker();
    }
}
