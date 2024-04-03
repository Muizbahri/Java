import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class transaction{
    String recordNO;
    String userId;
    double payment;

    public transaction(String recordNO, String userId, double payment){
        this.recordNO = recordNO;
        this.userId = userId;
        this.payment = payment;
    }

}

public class Bill2 {
    public static void main(String[] args) {
        try{
            Scanner muiz = new Scanner(new File("Bill.txt"));
            PrintWriter Bahri = new PrintWriter("above1000.txt");

            //declare array of object
            transaction tc[] = new transaction[100];

            int numR = 0;
            while (muiz.hasNextLine()) {
                String line = muiz.nextLine();
                String[] tokens = line.split(",");

                double payment = Double.parseDouble(tokens[2]);

                tc[numR] = new transaction(tokens[0],tokens[1],payment);
                numR++;
            
            }

            muiz.close();
            Bahri.close();

            //produce output file
            //print Header
            Bahri.println("Payment greater than 100");
            Bahri.println(".............................");
            Bahri.println("record\tUserId\tPayment");

            for (int i = 0; i < numR; i++) {
                if (tc[i].payment >1000) {
                    Bahri.println(tc[i].recordNO + "\t" + tc[i].userId + "\t"+ tc[i].payment);
                    numR++;
                }

                
            }

            
        } catch (IOException e) {
            
        } catch(Exception e){

        }
        
    }
    
}
