import java.util.Scanner;

class Worker{

    protected String name;
    protected int age;
    // protected String birthDate;
    // protected String endDate;

    // get the worker age
    public void getAge()
    {
        int age = this.age;
        System.out.println("Worker age is : " + age);
    }

    public void collectSalary(SalariedEmployee salEmp)
    {
        // salEmp.annualSalary = salEmp.annualSalary / 12;
        System.out.println( "Mr. " + salEmp.name + " Collect your salary : " + salEmp.annualSalary);
    }
    public static void main(String[] args)
    {

    }
}

class Employee extends Worker {
    protected long employeeId;
    // protected String hireDate;

}

class SalariedEmployee extends Employee {
    protected double annualSalary;
    protected boolean isRetired = false;
    public static void main(String[] args)
    {
        SalariedEmployee salEmp = new SalariedEmployee();
        Scanner sc = new Scanner(System.in);

        // input for name
        System.out.println("Enter your name : ");
        salEmp.name = sc.next();
        // input for id
        System.out.println("Enter your id : ");
        salEmp.employeeId = sc.nextLong();
        // input for age
        System.out.println("Enter your age : ");
        salEmp.age = sc.nextInt();
        // input for age
        System.out.println("Enter your annual salary : ");
        salEmp.annualSalary = sc.nextInt();

        // closed the scanner
        sc.close();
        System.out.println("-----------------------");
        // System.out.println(salEmp.getAge());
        
        //employee name
        System.out.println("The employee name is : " + salEmp.name);
        //employee age
        salEmp.getAge();
        
        // employee salary collect it
        salEmp.collectSalary(salEmp);

        // retired or working 
        if(salEmp.isRetired)
        {
            System.out.println("Employee is Retired.");
        }else{
            System.out.println("Employee is Working.");
        }
    }

    public boolean retire()
    {
       
        isRetired = age > 60 ?  true : false;
        return this.isRetired;
    }
}

