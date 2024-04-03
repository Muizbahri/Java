public class AthleteTest {
    public static void main(String[]args){
        Athlete ath1 = new Athlete("Male",19,173.2,69.4);
        Athlete ath2 = new Athlete("Female",18,171.2,68.4);

        System.out.println(ath1.getGender());
        System.out.println(ath1.getAge());
        System.out.println(ath1.getHeight());
        System.out.println(ath1.getWeight());

        System.out.println(ath2.getGender());
        System.out.println(ath2.getAge());
        System.out.println(ath2.getHeight());
        System.out.println(ath2.getWeight());

        System.out.println(ath1.tostring());
        System.out.println(ath1);
        System.out.println(ath2.tostring());
        System.out.println(ath2);

        ath1.setGender("Male");
        ath1.setAge(19);
        ath1.setHeight(173.2);
        ath1.setWeight(69.4);

        ath2.setGender("Female");
        ath2.setAge(18);
        ath2.setHeight(171.3);
        ath2.setWeight(68.1);

        System.out.println("Athlete 1 : "+ ath1.calcMaxRate());
        System.out.println("Athlete 2 : "+ ath2.calcMaxRate());
    }
}
