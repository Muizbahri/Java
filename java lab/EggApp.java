import java.util.Scanner;

public class EggApp{
    public static void main(String[] args){
        Scanner muiz = new Scanner(System.in);

        System.out.print("Enter the number of eggs: ");
        int totalEggs = muiz.nextInt();

        int dozen = totalEggs / 12;
        int looseEggs = totalEggs % 12;

        double totalPrice;
        if(dozen > 3){
            totalPrice = (8.0 * dozen) + (0.70 * looseEggs);
        }else{
            totalPrice = (8.0 * dozen) + (0.70 * looseEggs);
        }
        System.out.println("Your ordered " + totalEggs + " eggs. That is " + dozen + " dozen at RM 8 per dozen and " + looseEggs + " loose eggs at 70 cents each for a total of RM " + totalPrice);
        
        muiz.close();
    }
}
