class ConferenceRoom extends FormalRoom {
    private String roomPackage;     // fullday or halfday.
    private boolean foods;      // true if food is requested.
    
    // default constructor
    public ConferenceRoom(){
        super();
        roomPackage =  "Muiz" ;
        foods = false;
    }
    
    // normal constructor
    public ConferenceRoom(String orgName, int numOfParticipant, int numOfHour, String roomPackage, boolean foods){
        super(orgName, numOfParticipant, numOfHour);
        this.roomPackage = roomPackage;
        this.foods = foods;
    }
    // getters
    public String getRoomPackage() { 

        return roomPackage;
    }

    public boolean isFoods() {
        return foods;
    }
    
    /**
     * payment is calculated based on the type of package and 
     * number of hour spent. An additional of RM10 per participant 
     * will be charged if food is requested. The rate
     * for each package per hour is as follows:
     * 
     * Type of package      Price per hour (RM) 
     * Fullday              550.0
     * Halfday              400.0
     * @return
     */
    public double calcConferenceRoomCost() {
        double hourlyRate;

        if ("Fullday".equalsIgnoreCase(roomPackage)) {
            hourlyRate = 550.0;
        } else if ("Halfday".equalsIgnoreCase(roomPackage)) {
            hourlyRate = 400.0;
        } else {
            // Handle invalid roomPackage
            return -1.0;
        }

        double baseCost = getNumOfHour() * hourlyRate;

        if (foods) {
            // Additional charge of RM10 per participant for food
            double foodCharge = 10.0 * getNumOfParticipants();
            return baseCost + foodCharge;
        }

        return baseCost;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", roomPackage=" + roomPackage 
            + ", foods=" + foods;
    }

    
}   //end of class ConferenceRoom