public class Account {
    private String name;
    private int accNumber;
    private double balance;
    private double interestRate;
    
    //default constructor
    public Account(){
        name ="";
        accNumber = 0;
        balance = 0;
        interestRate = 0;
    }

    //Normal constructor
    public Account(String name, int accNumber, double balance, double interestRate){
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAccNumber(int accNumber){
        this.accNumber = accNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getAccNumber(){
        return accNumber;
    }
    public double getBalance(){
        return balance;
    }
    public double getIntersRate(){
        return interestRate;
    }

    //toString
    public String toString(){
        String s = "Name: "+ name + ",Account Number = " + accNumber + ",Balance= " + balance + ",Interest Rate" + interestRate;
        return s;
    }

    //processors
    public double calcInterestAmount(){
        double interestAmount = balance * interestRate;
        return interestAmount;
    }

    //Processor method for withdrawal
    public void withdrawal(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal of RM " + amount + " successful. New balance: RM" + balance);
         }else{
            System.out.print("Invalid");
         }
    }
}
