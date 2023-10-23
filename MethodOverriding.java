public class MethodOverriding {
    public String fullName(String fname, String lname)
    {
        return fname + " " + lname;
    }

    public String fullName(String fname, char lname)
    {
        return fname + " " + lname;
    }
    public static void main(String[] args)
    {
        MethodOverriding ovr = new MethodOverriding();
        System.out.println(ovr.fullName("Shivam", "Yadav"));
        System.out.println(ovr.fullName("Shivam", 'y'));
    }
}
