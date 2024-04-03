public class MyCarWashTest {
    public static void main(String[]args){
        //Question b.i
        MyCarWash carwash1 = new MyCarWash(true,"Abu",'A',5);
        
        System.out.println("Customer information: "+ carwash1.toString());

        //Question b.iii
        if(carwash1.getMonthlyWashNumber() >=3){
            System.out.println("Good news. You will receive a 5% discount");
        }else{
             System.out.println("My condolence, you have to come three times or more to receive a 5% discount.");
        }
    }
    
}
