public class FullTime extends Student {
    private double collegeFees;


    // normal constructor
    public FullTime(String id, String name, int noOfCourses, double collegeFees) {
        super(id, name, noOfCourses);
        this.collegeFees = collegeFees;
    }

    // getters and setters
    public double getCollegeFees() {
        return collegeFees;
    }

    public void setCollegeFees(double collegeFees) {
        this.collegeFees = collegeFees;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "collegeFees=" + collegeFees;
    }

    // implement abstract method here
    @Override
    public double calcFees(){
        return super.getNoOfCourses() *200 + collegeFees;
    }

    

}
