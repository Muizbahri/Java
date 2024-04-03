public class ElectricBillApp {

    public static void main(String args[]) {
        // array of objects
        ElectricBill bills[] = new ElectricBill[10];

        // dummy data - start
        bills[0] = new ElectricBill("854877", 210);
        bills[1] = new ElectricBill("852254", 89);
        bills[2] = new ElectricBill("832145", 132);
        bills[3] = new ElectricBill("875695", 360);
        bills[4] = new ElectricBill("854122", 510);
        bills[5] = new ElectricBill("854412", 150);
        bills[6] = new ElectricBill("859654", 52);
        bills[7] = new ElectricBill("854421", 300);
        bills[8] = new ElectricBill("875544", 200);
        bills[9] = new ElectricBill("878999", 100);
        // dummy data - end

        // a.	Print the average usage of all accounts.
        double totalUse = 0;
        for (int i = 0;i<bills.length;i++){
            totalUse += bills[i].getUsage();
        }

        double average = totalUse/ bills.length;

        System.out.println("Average total bills: " + average);
        // b.   print bill amount for account number "859654"
        for (int i = 0;i<bills.length;i++){
             if(bills[i].getAccountNo().equals("859654")){
                System.out.println("Bill amount for account 859654 : "+ bills[i].calcBill());
            }
        }

        // c.	Count and print total number accounts with usage of 300kWh and above.
        int count = 0;
        for(int i=0; i<bills.length;i++){
            if(bills[i].getUsage() >= 300){
                count++;
            }
        }
        System.out.println("Total number of accounts with usage of 300kWh and above: " + count);


        // d.	Find and print account number with highest usage.
        int max =0;
        String accountNumberMax = "";

        for(int i = 0; i<bills.length; i++){
            if(bills[i].getUsage() > max){
                max = bills[i].getUsage();
                accountNumberMax = bills[i].getAccountNo();
            }
        }
        System.out.println("Account with max usage:accountNo= "+ accountNumberMax + " usage= "+ max);

    }
}
