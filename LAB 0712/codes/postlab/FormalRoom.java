
public class FormalRoom {

    public static double baseCost;
    private String orgName;     // UiTM, Proton, Celcom, etc 
    private int numOfParticipants; // e.g: 350
    private int numOfHour;
    
    // default constructor
    public FormalRoom() {
        String orgName = "" ;
        int numOfPartticipant = 0;
        int numOfHour = 0;
    }
    // normal constructor
    public FormalRoom (String orgName, int numOfParticipants, int numOfHour) {
        this.orgName = orgName ;
        this.numOfParticipants = numOfParticipants ;
        this.numOfHour = numOfHour ;
    }


    // getters
    public String getOrgName() {
        return orgName;
    }
    public int getNumOfParticipants() {
        return numOfParticipants;
    }
    public int getNumOfHour() {
        return numOfHour;
    }
    
    // toString
    @Override
    public String toString() {
        return "orgName=" + orgName + ", numOfParticipants=" + numOfParticipants + ", numOfHour="
                + numOfHour;
    } 

    

}// end of class FormalRoom