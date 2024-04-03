import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Bill {
    public static void main (String[] args){
        try{
            //1-Scanner & printWriter
            Scanner muiz = new Scanner(new File("Bill.txt"));
            PrintWriter Bahri = new PrintWriter("above1000.txt");

            //print Header
            Bahri.println("Payment greater than 100");
            Bahri.println(".............................");
            Bahri.println("record\tUserId\tPayment");

            int counter = 0;
            //2-while loop
            while(muiz.hasNextLine()){
                String line = muiz.nextLine();
                String[] tokens = line.split(",");

                double payment =   Double.parseDouble(tokens[2]);

                //body
                if(payment > 1000){
                    Bahri.println(tokens[0] + "\t" + tokens[1] + " \t"+payment);
                    counter++;
                }
            }//end while

            

            Bahri.println(".............................");
            Bahri.println("No of transaction > 1000 : " + counter);

            

            muiz.close();
            Bahri.close();

         

        }catch(IOException ioe){


        }catch(Exception e){

        }


    }
}
