public class TestStudent {

    public static void main(String args[]) {
        // array of superclass
        Student studs[] = new Student[10];

        // dummy data start
        studs[0] = new FullTime("2507","Macaulay",7,147.78);
        studs[1] = new FullTime("5156","Keegan",4,175.36);
        studs[2] = new PartTime("3197","Randall",6,103.90,false);
        studs[3] = new PartTime("5456","Irene",10,76.54,false);
        studs[4] = new FullTime("6908","Lawrence",6,114.76);
        studs[5] = new FullTime("6775","Jamal",2,151.63);
        studs[6] = new PartTime("7945","Darryl",9,96.43,true);
        studs[7] = new PartTime("1671","Davis",8,74.54,false);
        studs[8] = new FullTime("7937","Harding",3,185.43);
        studs[9] = new FullTime("5952","Harrison",7,157.54);
        // dummy data end


        // calculate and display total fees for all students
        double total = 0;
        for(int i = 0; i <studs.length; i++){
            total += studs[i].calcFees();
        }
        System.out.println(total);
        
        int count = 0;
        for(int i =0; i<studs.length;i++){
            if( studs[i] instanceof PartTime p){
                if(p.isWorkStatus()){
                    count ++;
                }
            }
        }
        System.out.println(count);

        double totalFull = 0.0;
        count = 0;
        for(int i = 0; i<studs.length;i++){
            if(studs[i] instanceof FullTime f){
                totalFull += f.getNoOfCourses();
                count++;
            }
        }
        double averageFull = totalFull / count;
        System.out.println(averageFull);

        Student max =studs[0];
        for(int i = 0; i<studs.length;i++){
            if(studs[i].getNoOfCourses() > max.getNoOfCourses()){
                max = studs[i];
            }
        }
        System.out.println(max);

         double highestFee=0;
         int highestIdx = 0;
        for(int i = 0; i<studs.length;i++){
            if(studs[i] instanceof FullTime f){
                if(f.getCollegeFees() > highestFee){
                    highestFee = f.getCollegeFees();
                    highestIdx = i;
            }
            }
        }
        System.out.println(studs[highestIdx]);
    }


}
