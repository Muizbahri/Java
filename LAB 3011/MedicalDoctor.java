public class MedicalDoctor {
    private String id;
    private String name;
    private double basicSalary;

    // default constructor
    public MedicalDoctor() {
        id = "";
        name = "";
        basicSalary = 0.0;
    }

    // normal constructor
    public MedicalDoctor(String id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // setters and getters
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

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // toString()
    @Override
    public String toString() {
        return "id='" + id
                + ", name='" + name
                + ", basicSalary=" + basicSalary;
    }
}