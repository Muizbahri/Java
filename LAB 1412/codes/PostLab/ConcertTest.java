public class ConcertTest {

    public static void main(String[] args) {
        // b)	Declare an array of type Concert named concerts with size 10. 
        Concert concerts[] = new Concert[100];

        // test data - START
        concerts[0] = new Rock("Red Hot Chili Peppers - Global Stadium Tour", "29-Mac-2023", "North America", 'v', 2, true, "Red Hot Chili Peppers", true);
        concerts[1] = new Rock("Nickelback - Get Rollin Tour", "12-Jun-2023", "Quebec City", '1', 4, false, "Nickelback", false);
        concerts[2] = new Classical("LE VIOLONCELLE BAROQUE EXPLIQUE", "12-Jun-2023", "Salle Bourgie", 'v', 2, false, "Gerard Salong");
        concerts[3] = new Rock("Guns N Roses - World Tour", "11-Aug-2023", "Vancouver", '2', 3, true, "Guns N Roses", false);
        concerts[4] = new Classical("Beethoven Visionary", "18-Jul-2023", "Eglise Saint", '2', 4, true, "Desjardins");
        concerts[5] = new Rock("Bryan Adams - So Happy It Hurts Tour", "6-Jun-2023", "Baltimore", '1', 1, false, "Bryan Adams", true);
        concerts[6] = new Classical("The Sovereign Harp", "2-Aug-2023", "Eglise de St-Paul", '1', 5, true, "Xavier de Maistre");
        concerts[7] = new Rock("Foreigner - The Historic Farewell Tour ", "24-Mac-2023", "North America", '2', 3, true, "Foreigner", false);
        concerts[8] = new Classical("From Soloist to Maestro", "13-Oct-2023", "Maison symphonique", '1', 2, true, "Gerard Salong");
        concerts[9] = new Classical("Rite of Spring", "12-Sept-2023", "Maison symphonique", 'v', 3, true, "Rafael Payare");
        // test data - END

        // c)
        double total = 0.0;
        for(int i = 0; i<concerts.length; i++){
            if( concerts[i] instanceof Rock r){
                total += r.calcTixPrice();
            }
        }

        System.out.println("total ticket price for Rock: " + total);

        for(int i = 0; i<concerts.length; i++){
            if(concerts[i] instanceof Classical c){
                if(c.getArtist() == "Gerard Salong"){
                    System.out.println(c.getDate());
                }
            }
        }
 
    }
}
