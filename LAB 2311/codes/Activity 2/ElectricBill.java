public class ElectricBill {
    private String accountNo;   //account number
    private int usage;  //kWh

    // default constructor
    public ElectricBill() {
        accountNo = "";
        usage = 0;
    }

    // normal constructor
    public ElectricBill(String accountNo, int usage) {
        this.accountNo = accountNo;
        this.usage = usage;
    }

    // getters and setters
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    // toString
    public String toString() {
        return "accountNo=" + accountNo +
                ", usage=" + usage;
    }

    // processor
    public double calcBill() {
        double total = 0;

        if(usage <= 200){
            total = usage *0.20;
        }
        
        else if (usage <= 300){
            total = usage *0.20 + (usage -200)*0.30;
        }
        else {
            total = usage *0.20 + 100 *0.30 +(usage - 300)*0.50;
        }

        // implement this method

        return total;
    }
}
