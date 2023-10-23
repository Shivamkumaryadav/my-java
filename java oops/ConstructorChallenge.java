class Customer {
    private String name;
    private int credit_limit;
    private String email;

    // getters methods
    public String getName()
    {
        return this.name;
    }

    public int getCredit()
    {
        return this.credit_limit;
    }

    public String getEmail()
    {
        return this.email;
    }

    // constructor
     public Customer() {
        this("Shivam", 100000, "Shivam@gamil.com");
    }

    public Customer(String name, int credit_limit, String email)
    {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }

    public static void main(String[] args)
    {
        Customer customer = new Customer();
        System.out.println(customer.getName());
        System.out.println(customer.getCredit());
        System.out.println(customer.getEmail());
    }    
}
