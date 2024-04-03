public class Permanent extends Staff{

    private char grade; //A, B or C
    private double kwsp;
  

    // default constructor
    public Permanent() {
        super();
        grade = 'C';
        kwsp = 0.0;
    }

    // normal constructor
    public Permanent(String id, String name, double income, int yearService, char grade, double kwsp) {
        super(id, name, income, yearService);
        this.grade = grade;
        this.kwsp = kwsp;
    }

    // getters and setters
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getKwsp() {
        return kwsp;
    }

    public void setKwsp(double kwsp) {
        this.kwsp = kwsp;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", grade=" + grade + ", kwsp=" + kwsp;
    }

    // processor
    public double netPermanentIncome() {
        
        // implement this

        double percentPaid;

        // Determine percentPaid based on grade using if-else statements
        if (grade == 'A') {
            percentPaid = 8;
        } else if (grade == 'B') {
            percentPaid = 12;
        } else if (grade == 'C') {
            percentPaid = 15;
        } else {
            // Handle invalid grade (you may throw an exception, set a default value, or take other action)
            percentPaid = 0;
        }

        // Calculate net income using the formula
        double netIncome = super.getIncome() + (super.getYearService()* (percentPaid / 100.0 * super.getIncome())) - kwsp;

        return netIncome;

    }
}
