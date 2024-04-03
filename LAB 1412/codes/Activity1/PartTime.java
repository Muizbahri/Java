public class PartTime extends Student{

    private double administrativeFees;
    private boolean workStatus;

    // normal constructor
    public PartTime(String id, String name, int noOfCourses, double administrativeFees, boolean workStatus) {
        super(id, name, noOfCourses);
        this.administrativeFees = administrativeFees;
        this.workStatus = workStatus;
    }

    // getters and setters
    public double getAdministrativeFees() {
        return administrativeFees;
    }

    public void setAdministrativeFees(double administrativeFees) {
        this.administrativeFees = administrativeFees;
    }

    public boolean isWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(boolean workStatus) {
        this.workStatus = workStatus;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "administrativeFees=" + administrativeFees +
                ", workStatus=" + workStatus;
    }

    // implement abstract method here
    public double calcFees(){
        return super.getNoOfCourses() * 500 + administrativeFees;
    }
}
