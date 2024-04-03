public class MeetingRoom extends FormalRoom {
    
    private int typeOfBooking;  // 1 for one off and 2 for regular recurring.

    // normal constructor
    public MeetingRoom(String orgName, int numOfParticipants, int numOfHour, int typeOfBooking){
        super(orgName, numOfParticipants, numOfHour);
        this.typeOfBooking = typeOfBooking;
    }

    // getters
    public int getTypeOfBooking() {
        return typeOfBooking;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +", typeOfBooking=" + typeOfBooking;
    }

    // processor
    /**
     *  payment is calculated based on the type of booking 
     *  and number of hours spent. Discount of 5% will be 
     *  given if total payment more than RM1000.00. 
     *  The rate is as follows:
     *
     *  Type of booking     Price Per Hour (RM)
     *  1                   250.0
     *  2                   150.0
     * @return total payment
     */
    
    public double calcMeetingRoomCost() {
        double hourlyRate;
    
        // Determine the hourly rate based on the type of booking
        if (typeOfBooking == 1) {
            hourlyRate = 250.0;
        } else if (typeOfBooking == 2) {
            hourlyRate = 150.0;
        } else {
            // Return -1.0 if an invalid type of booking is provided
            return -1.0;
        }
    
        // Calculate the base cost by multiplying the hourly rate with the number of hours
        double baseCost = getNumOfHour() * hourlyRate;
    
        // Apply a 5% discount if the base cost is more than RM1000.00
        if (baseCost > 1000.0) {
            return baseCost * 0.95;
        }
    
        // Return the base cost if no discount is applied
        return baseCost;
    }

    
    }
