public class ChickenEgg {
    private char grade; // A,B,C
    private int numEgg; // number of eggs

    //Default constructor
    public ChickenEgg(){
        grade = 'A';
        numEgg = 0;
    }
    //mutators
    public void setGrade(char newGrade){
        grade = newGrade;
    }
    public void setNumEgg(int newNumEgg){
        numEgg = newNumEgg;
    }

    //Accessor
    public char getGrade(){
        return grade;
    }
    public int getNumEgg(){
        return numEgg;
    }

    //processors
    public double calPrice() {
        double totalPrice = 0;

        if(grade == 'A'){
            totalPrice = 0.35 * numEgg;
        }
        else if(grade == 'B'){
            totalPrice = 0.25 * numEgg;
        }
        else if (grade == 'C'){
            totalPrice = 0.20 * numEgg;
        }
        return totalPrice;
    }
}
