public class MainSingleton {
    public static void main(String[] args) {
     String name = "Hoa";

        Thread thread = new Thread(() -> SingletonPatterns.getInstance().getMessage());
        Thread thread2 = new Thread(() -> SingletonPatterns.getInstance().getMessage());


        thread.start();
        thread2.start();
    }
}
