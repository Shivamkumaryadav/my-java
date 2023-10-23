public class StaticMember {
    public static String name;
    public StaticMember(String name)
    {

        StaticMember.name = name;
    }
    protected void printName()
    {
        System.out.println("your name is " + StaticMember.name);
    }

    public static void main(String[] args)
    {
        StaticMember person = new StaticMember("Shivam");
        StaticMember person2 = new StaticMember("Arnit");
        person.printName();
        person2.printName();
    }
}
