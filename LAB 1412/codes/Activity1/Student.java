public abstract class Student {
    private String id;
    private String name;
    private int noOfCourses;

    // normal constructor
    public Student(String id, String name, int noOfCourses) {
        this.id = id;
        this.name = name;
        this.noOfCourses = noOfCourses;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfCourses() {
        return noOfCourses;
    }

    public void setNoOfCourses(int noOfCourses) {
        this.noOfCourses = noOfCourses;
    }

    // toString
    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", noOfCourses=" + noOfCourses;
    }

    // abstract method
    public abstract double calcFees();
}
