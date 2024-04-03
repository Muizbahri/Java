public class CarInsuranceApp {

    public static void main(String args[]) {
        // declare array of objects
        CarInsurance [] customers = new CarInsurance[5];

        // test data - start
        customers[0] = new CarInsurance("WVT9737", 37800, true);
        customers[1] = new CarInsurance("JTL4125", 56200, false);
        customers[2] = new CarInsurance("WXK4651", 19500, true);
        customers[3] = new CarInsurance("MCQ5121", 43600, true);
        customers[4] = new CarInsurance("MBA1251", 25600, false);
        // test data - end

        // print information of each insurance record
        for (int i=0; i<customers.length; i++) {
            System.out.println("insurance " + (i+1) + ": " + customers[i].toString());
        }
        //Calculate and print average market values of all cars.
        double totMV =0;
        for (int i=0;i<customers.length; i++){
            totMV += customers[i].getMarketValue();
        }
        
        double averageTotmv = totMV/ customers.length;

        System.out.println("Average Market Value: " + averageTotmv);

        //Print details of customers (usingtoString()) that insure their windscreen
        for(int i=0; i<customers.length;i++){
            if(customers[i].isWindscreenCover()){
                System.out.println(customers[i].toString());
            }
        }

        //Count and print the number of cars from Malacca

        int Count = 0;
        for(int i=0; i<customers.length;i++){
            if(customers[i].getPlateNo().charAt(0)=='M'){
                System.out.println(customers[i].toString());
            Count++;
            System.out.println(Count);
            }           
        }
    }
}        
    
