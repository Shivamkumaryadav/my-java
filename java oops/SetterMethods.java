public class SetterMethods {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String setMake(String make)
    {
        return this.make = make;
    }
    public String setModel(String model)
    {
        return this.model = model;
    }
    public String setColor(String color)
    {
        return this.color = color;
    }
    public int setDoors(int doors)
    {
        return this.doors = doors;
    }
    public boolean setConvertible(boolean convert)
    {
        return this.convertible = convert;
    }
    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : ""));

    }

    public static void main(String args[]) {
        SetterMethods car = new SetterMethods();
        System.out.println(car.setMake("Suzuki"));
        System.out.println(car.setModel("Maaruti"));
        System.out.println(car.setColor("red"));
        System.out.println(car.setDoors(4));
        System.out.println(car.setConvertible(true));
        car.describeCar();
    }  
}
