public class IncomeTaxTest {
    public static void main(String[]args){
        IncomeTax taxPayer1 = new IncomeTax(22112234,2022,8800);

        System.out.println("Tax payer: "+ taxPayer1.toString());

        double totalAmount = taxPayer1.calcTaxAmount();

        System.out.println("Total Amount tax: " + totalAmount);
    }
    
}
