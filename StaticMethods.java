public class StaticMethods {
    public static String name;

    public static void printName(String name) {
        System.out.println("your name is " + name);
    }

    public static void main(String[] args) {
        // StaticMethods sm = new StaticMethods();
        printName("Ansh");
    }
}
