public class IncomeTax {
    private int taxNo;
    private int years;
    private double income;

    //default constructors
    public IncomeTax(){
        taxNo = 500;
        years = 2022;
        income = 9000;
    }
    //normal contructor
    public IncomeTax(int taxNo, int years, double income){
        this.taxNo = taxNo;
        this.years = years;
        this.income = income;
    }
    //Accessors
    public int getTaxNo(){
        return taxNo;
    }
    public int getYears(){
        return years;
    }
    public double getIncome(){
        return income;
    }
    //mutators
    public void setTaxNo(int newTaxNo){
        taxNo = newTaxNo;
    }
    public void setYears(int newYears){
        years = newYears;
    }
    public void setIncome(int newIncome){
        income = newIncome;
    }
    //toString
    public String toString(){
        String s = "tax number = " + taxNo + ",Years = " + years + ", Income = " + income;
        return s; 
    }
    //Processor
    public double calcTaxAmount(){
        double TaxAmount = 0;

        if(income <= 5000){
            TaxAmount = 0;
        }
        else if(income >= 5001 && income <= 20000){
            TaxAmount = income *0.01;
        }
        else{
            TaxAmount = income*0.03;
        }
        return TaxAmount;
    }
    
}
