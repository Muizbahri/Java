public class MainClass {
   
        public static void main(String[]args){
            rectangle rec1 = new rectangle(10.2,5.4);
            rectangle rec2 = new rectangle(rec1);
            System.out.print(rec1.areaRectangle());
            System.out.print(rec2.areaRectangle());
        }
    

    
}
