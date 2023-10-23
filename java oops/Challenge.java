class BankAccount {
    private String customerName;
    private int accountNum;
    private int accountBal;
    private int phoneNum;
    private String email;

    // // constructor 
    // public BankAccount(String customerName, int accountNum, int accountBal, int phoneNum, String email )
    // {
    //     this.customerName = customerName;
    //     this.accountNum = accountNum;
    //     this.accountBal = accountBal;
    //     this.phoneNum = phoneNum;
    //     this.email = email;
    // }
    // getters
    public int getAccountNumber() {
        return accountNum;
    }

    public int getAccountBal() {
        return accountBal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    // setters
    public void setAccountNum(int accountNum) {
         this.accountNum = accountNum;
    }

    public void setAccountBal(int accountBal) {
         this.accountBal = accountBal;
    }

    public void setCustomerName(String customerName) {
         this.customerName = customerName;
    }

    public void setPhoneNum(int phoneNum) {
         this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
         this.email = email;
    }

    // depositing funds into account
    public void depositFunds(int depositBal) {
        if(depositBal <= 0)
        {
            System.out.println("Please enter correct amount to be deposited.");
        }else{
            this.accountBal = this.accountBal + depositBal;
            System.out.println("Amount of " + depositBal + " is Deposited Successfully!");
        }
    }

    // withdrawing funds from the account
    public void withdrawFunds(int withdrawBal) {
        if (withdrawBal <= accountBal) {
            accountBal = accountBal - withdrawBal;
            System.out.println("Withdrawn amount : " + withdrawBal);
            System.out.println("Amount left in Account :" + accountBal);
        }else{
            System.out.println("Insufficient funds. Cannot withdraw.");
        }
        
    }

    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();
        // setting details
        bankAcc.setCustomerName("Shivam");
        bankAcc.setAccountNum(921892811);
        bankAcc.setEmail("Shivamyadav4046@gmail.com");
        bankAcc.setPhoneNum(888792611);
        bankAcc.setAccountBal(2000);

        // customer name
        String name = bankAcc.getCustomerName();
        // getting data
        System.out.println("Customer name is :" + name);
        System.out.println(name + "'s account number : " + bankAcc.getAccountNumber());
        System.out.println( name + "'s' Email Address: " + bankAcc.getEmail());
        System.out.println( name + "'s phone number : " + bankAcc.getPhoneNum());
  

        bankAcc.depositFunds(1000);
        bankAcc.withdrawFunds(200);
    }
}
