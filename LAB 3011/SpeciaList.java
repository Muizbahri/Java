public class SpeciaList extends MedicalDoctor{
    private String specialtyArea;
    private int consultationTime;

    private int RATE_UP_TO_80_HOURS = 50;
    private int RATE_NEXT_80_HOURS = 80;
    private int RATE_REMAINING_HOURS = 125;
    
    //default constructor
    public SpeciaList(){
        super();
        specialtyArea = "";
        consultationTime = 0;
    }

    // normal constructor
    public SpeciaList(String id, String name, double basicSalary, String specialtyArea, int consultationTime) {
        super(id, name, basicSalary);
        this.specialtyArea = specialtyArea;
        this.consultationTime = consultationTime;
    }

    public double calcSalary() {
        // Calculate consultation allowance based on different rates
        double consultationAllowance = 0;

        if (consultationTime <= 80) {
            consultationAllowance = consultationTime * RATE_UP_TO_80_HOURS;
        } else if (consultationTime <= 160) {
            consultationAllowance = 80 * RATE_UP_TO_80_HOURS + (consultationTime - 80) * RATE_NEXT_80_HOURS;
        } else {
            consultationAllowance = 80 * RATE_UP_TO_80_HOURS + 80 * RATE_NEXT_80_HOURS + (consultationTime - 160) * RATE_REMAINING_HOURS;
        }

        // Total salary is the sum of basic salary and consultation allowance
        return getBasicSalary() + consultationAllowance;
    }
    public String toString() {
        return super.toString() + ", Specialty Area: " + specialtyArea + ", Consultation Time: " + consultationTime + " hours";
    }

}
