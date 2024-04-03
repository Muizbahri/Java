public class Athlete {
    //data member @ attributes
    private String gender;
    private int age;
    private double height;
    private double weight;
    
    //default constructor
    public Athlete(){
        gender = "male";
        age = 21;
        height = 181;
        weight = 65;
    }
    //normal constructor - construct object with the given list of values
    public Athlete(String gender, int age, double height, double weight){
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // getters
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }

    // setters
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    //totString
    public String tostring(){
        String s = "Gender: "+ gender + ", Age: " + age + ", Height = " + height + ", weight =  " + weight;
        return s;
    }

    //processors
    public double calcMaxRate(){
        double max = 208 -(0.7 * age);
        return max;
    }  
}
