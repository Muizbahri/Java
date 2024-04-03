public class Staff {
    private String id;
    private String name;
    private double income;
    private int yearService;

    // default constructor
    public Staff() {
        id = "";
        name = "";
        income = 0.0;
        yearService = 0;
    }
    
    // normal constructor
    public Staff(String id, String name, double income, int yearService) {
        this.id = id;
        this.name = name;
        this.income = income;
        this.yearService = yearService;
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

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getYearService() {
        return yearService;
    }

    public void setYearService(int yearService) {
        this.yearService = yearService;
    }

    // toString

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", income=" + income +
                ", yearService=" + yearService;
    }
}
