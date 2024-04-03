import java.util.Scanner;

public class ChickenEggTest {
    public static void main(String[]args){
        ChickenEgg egg = new ChickenEgg();

        Scanner muiz = new Scanner(System.in);

        System.out.print("Enter your egg grade(A,B,C): ");
        char EggGrade = muiz.next().charAt(0);
        egg.setGrade(EggGrade);

        System.out.println("Enter the number of egg: ");
        int eggNumber = muiz.nextInt();
        egg.setNumEgg(eggNumber);

        //object by calling the accessor    
        System.out.println("Egg information: ");
        System.out.println("Grade: "+ egg.getGrade());
        System.out.println("Number of egg: "+ egg.getNumEgg()); 

        double totalPrice = egg.calPrice();
        System.out.println("Total Price: RM " + totalPrice);

        muiz.close();
    }
}

//char ch = scanner.next().charAt(0);
