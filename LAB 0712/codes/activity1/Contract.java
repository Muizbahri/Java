public class Contract extends Staff {
    private boolean isProfessional;

    // default constructor
    public Contract() {
        super();
        isProfessional = false;
    }

    // normal constructor
    public Contract(String id, String name, double income, int yearService, boolean isProfessional) {
        super(id, name, income, yearService);
        this.isProfessional = isProfessional;
    }

    // getters and setters
    public boolean isProfessional() {
        return isProfessional;
    }

    public void setProfessional(boolean professional) {
        isProfessional = professional;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", isProfessional=" + isProfessional;
    }

    // processor
    public double netContractIncome() {

        // implement this

        if(isProfessional){
           double netIncome = getIncome() +(getIncome()*0.80)+(150*getYearService());
        }else{
           double netIncome = getIncome() + 120*getYearService();
        }
        return 0;
    }
}
