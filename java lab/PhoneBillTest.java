public class PhoneBillTest {
    public static void main (String []args){
        PhoneBill bill1 = new PhoneBill("31212", "Douglas", "Database",145);
        PhoneBill bill2 = new PhoneBill("31251", "Mickey", "Requirements",320);

        System.out.println("Phone Bill 1 information: " + bill1.toString());
        System.out.println("Phone Bill 2 information: " + bill2.toString());

        double totalAmount1 = bill1.calcPhoneBill();
        double totalAmount2 = bill2.calcPhoneBill();

        System.out.println("Phone Bill 1 amount:RM " + totalAmount1);
        System.out.println("Phone Bill 2 amount:RM " + totalAmount2);

    }
    
}
