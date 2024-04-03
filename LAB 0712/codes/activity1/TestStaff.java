public class TestStaff {

    public static void main(String args[]) {
        // array of superclass
        Staff[] staffs = new Staff[10];

        // dummy data start
        staffs[0] = new Contract("112", "Melanie", 905, 6, false);
        staffs[1] = new Permanent("632", "Tyler", 5421, 8, 'C', 214);
        staffs[2] = new Contract("742", "Maddie", 3762, 5, false);
        staffs[3] = new Permanent("316", "Michelle", 5912, 9, 'C', 254);
        staffs[4] = new Contract("788", "Kirsten", 8830, 8, true);
        staffs[5] = new Permanent("621", "Darcy", 2277, 6, 'A', 112);
        staffs[6] = new Permanent("214", "Michael", 8037, 3, 'A', 485);
        staffs[7] = new Permanent("631", "Caroline", 744, 2, 'B', 15);
        staffs[8] = new Contract("562", "Aston", 9184, 5, true);
        staffs[9] = new Permanent("451", "Victor", 3728, 6, 'A', 152);
        // dummy data end

        // a. Calculate and print the average years of service for Contract staffs.
        int totalSum = 0;
        int count = 0;
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof Contract) {    // object at index i is Contract?
                totalSum += staffs[i].getYearService(); // add year of service to total
                count++;    // increase count for contract staff
            }
        }
        int average = totalSum/count;
        System.out.println("a - avg year of service: " + average);

        // b - Count and print number of professional contract staff
        int counter=0;
        for(int i=0;i< staffs.length;i++){
            if(staffs[i] instanceof Contract)   // check object type
                if (((Contract) staffs[i]).isProfessional())    // cast and call getter in Contract object
                    counter++;
        }
        System.out.println("The amount of professional is "+counter);

        // alternative
        counter=0;
        for(int i=0;i< staffs.length;i++){
            if(staffs[i] instanceof Contract c) // check object type and cast
                if (c.isProfessional())
                    counter++;
        }
        System.out.println("The amount of professional is "+counter);

        // c. Print the name and nett salary paid to Permanent staffs.
        for (int i = 0; i < staffs.length; i++){
            if(staffs[i] instanceof Permanent ){
                System.out.println("name: " + staffs[i].getName() + " salary: " + ((Permanent) staffs[i]).netPermanentIncome());
            }
        }

        // alternative
        for (int i = 0; i < staffs.length; i++){
            if(staffs[i] instanceof Permanent p){
                System.out.println("name: " + staffs[i].getName() + " salary: " + p.netPermanentIncome());
            }
        }


        // d. Print the staff id of all grade ‘A’ Permanent staff. - adriana
        for (int i=0; i<staffs.length; i++){
            if (staffs[i] instanceof Permanent p)
                if (p.getGrade()=='A')
                    System.out.println("Staff ID: " + p.getId());
        }

        
        //e Calculate nett income for all staff.
        double totalNettIncome = 0.0;
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof Permanent) {
                totalNettIncome += ((Permanent) staffs[i]).netPermanentIncome();
            } else if (staffs[i] instanceof Contract) {
                totalNettIncome += ((Contract) staffs[i]).netContractIncome();
            }
        }
        System.out.println("Total net income = RM" + totalNettIncome);

        // alternative
        totalNettIncome = 0.0;
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof Permanent p) {
                totalNettIncome += p.netPermanentIncome();
            } else if (staffs[i] instanceof Contract c) {
                totalNettIncome += c.netContractIncome();
            }
        }
        System.out.println("Total net income = RM" + totalNettIncome);
    }
}
