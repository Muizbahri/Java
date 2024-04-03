public class SavingAccount extends Account {
    
    private double interestP; // interest percentage

    //default constructor
    public SavingAccount(){
        super();
        interestP = 0.0;
    }
    //normal constructor
    public SavingAccount(int accNum,double balance,double interestP){
        super(accNum,balance);
        this.interestP = interestP;
    }
    //processor
    public double calcInterest(){
        return getBalance()*(interestP/100);
    }
    //toString
    public String toString(){
        return super.toString() + "' Interest = " + interestP + "%";
    }
}
