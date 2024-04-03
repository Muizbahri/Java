public class PhoneBill {
    private String staffNo;
    private String name;
    private String depthName;
    private int minutes;

    public PhoneBill(){
        staffNo = "100";
        name = "Abu";
        depthName ="HRM";
        minutes = 60;
    }

    //normal constructor - constructor object with the given list of values

    public PhoneBill(String staffNo, String name, String depthName, int minutes){
        this.staffNo = staffNo;
        this.name = name;
        this.depthName = depthName;
        this.minutes = minutes;
    }

    //mutator

    public void setStaffNo(String newStaffNo){
        staffNo = newStaffNo;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setDepthName(String newDepthName){
        depthName = newDepthName;
    }
    public void setMinutes(int newMinutes){
        minutes = newMinutes;
    }

    //Accessor

    public String getStaffNo(){
        return staffNo;
    }
    public String getName(){
        return name;
    }
    public String getDepthName(){
        return depthName;
    }
    public int getMinutes(){
        return minutes;
    }
    
    //totstring
    public String toString(){
        String s = "staff number= "+ staffNo + ", Name: " + name + ", Depth Name: "+ depthName + ", minutes:  " + minutes;
        return s;
    }

    //processor
    public double calcPhoneBill(){
        double totalBill = 0;

        if(minutes <= 100){
            totalBill = minutes * 0.20;
        }
        else if(minutes >= 101 && minutes <= 150){
            totalBill = 100 * 0.20 + (minutes - 100) * 0.35;
        }else{
            totalBill = 100 * 0.20 + 150 * 0.35 + (minutes - 250) * 0.15;
        }
        return totalBill;
    }
}
