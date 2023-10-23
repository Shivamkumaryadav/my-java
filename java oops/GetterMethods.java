public class GetterMethods {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake()
    {
        return this.make;
    }
    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : ""));

    }

    public static void main(String args[]) {
        GetterMethods car = new GetterMethods();
        car.describeCar();
        System.out.println(car.getMake());
    }

}
