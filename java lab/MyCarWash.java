public class MyCarWash {
    private boolean membership;
    private String name;
    private char packageType;
    private int monthlyWashNumber;

// Question a.i
//Default constructor
public MyCarWash(){
    membership = true;
    name = "Muiz";
    packageType = 'A';
    monthlyWashNumber = 100;
}

//Normal Constructor
public MyCarWash(boolean membership, String name, char packageType, int monthlyWashNumber){
    this.membership = membership;
    this.name = name;
    this.packageType = packageType;
    this.monthlyWashNumber = monthlyWashNumber;
}

//Question a.ii
//Accessors
public boolean getMembership(){
    return membership;
}
public String getName(){
    return name;
}
public char getPackageType(){
    return packageType;
}
public int getMonthlyWashNumber(){
    return monthlyWashNumber;
}

//Mutator
public void setMembership(boolean newMembership){
    membership = newMembership;
}
public void setName(String newName){
    name = newName;
}
public void setPackageType(char newPackageType){
    packageType = newPackageType;
}
public void setMonthlyWashingNumber(int newMonthlyWashingNumber){
    monthlyWashNumber = newMonthlyWashingNumber;
}

//Question a.iii
//processor
public double calcPrice(){
    double price = 0.0;
    double totalPrice = price;
    if(packageType == 'A'){
        price = 10;
    }else if(packageType == 'B'){
        price = 12;
    }else if(packageType == 'C'){
        price = 20;
    }

    if(membership){
        totalPrice = totalPrice * 0.9;
    }else if(monthlyWashNumber >= 3){
        totalPrice = totalPrice * 0.95;
    }
    return totalPrice;
    }
    
//Question b.ii
//toString
public String toString(){
    String s = "membership: " + membership + ", Name: "+ name + ", Package Type: "+packageType+ ", monthly wash number: "+monthlyWashNumber;
    return s;
}
}