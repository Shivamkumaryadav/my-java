public class AnimalInheritence {
    private String type;
    private String size;
    private double weight;

    public AnimalInheritence()
    {

    }
    public AnimalInheritence(String type, String size, double weight)
    {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String toString()
    {
        return "Animal" + " type = " + this.type + ", size = " + this.size + ", weight = " + this.weight;
    }

    public void move(String speed)
    {
        System.out.println( this.type + " moves " + speed);
    }

    public void makeNoise()
    {
        System.out.println( this.type + " Make some kind of Noise ");
    }
    
}

class Dog extends AnimalInheritence{
    private String earShape;
    private String tailShape;
  
    public Dog()
    {
        super("Mutt", "Big", 500);//calling the Animal class constructor
    }

    public Dog(String type, double weight)
    {
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type, String size, double weight, String earShape, String tailShape)
    {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight);
        
        this.earShape = earShape;
        this.tailShape = tailShape;
        
    }
    public static void main(String[] args)
    {
        AnimalInheritence animal = new AnimalInheritence("Generic Animal", "Huge", 400);
        Dog dog = new Dog();
        doAnimalStuff(animal, "Slow");
        doAnimalStuff(dog, "very Slow");
    }   

    public static void doAnimalStuff(AnimalInheritence Animal, String speed )
    {
        Animal.makeNoise();
        Animal.move(speed);
        System.out.println(Animal);
        System.out.println("-----");
    }

    public String toString()
    {
        return "Dog" + " earShape = " + this.earShape + ", tailShape = " + this.tailShape +
            this.toString();
 
    }
}