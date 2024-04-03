import java.util.Scanner;

public class PhoneBillCalculatortest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter the number of call minutes: ");
            int minutes = scanner.nextInt();

            PhoneBill bill = new PhoneBill(minutes);
            bill.calculateBill();

            System.out.println("Your phone bill is:RM " + bill.getBill());

            System.out.print("Do you want to calculate another bill? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the phone bill calculator. Goodbye!");
    }
}
