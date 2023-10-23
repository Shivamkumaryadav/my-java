public class StringFun {
    private String name = "Shivam";
    private int age = 22;

    public static void main(String[] args)
    {
        StringFun string = new StringFun();
        System.out.println(string.toString());
    }
    public String toString() {
        return "Person: name=" + name + ", age=" + age;
    }
}