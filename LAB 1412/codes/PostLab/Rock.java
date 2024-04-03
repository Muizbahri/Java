public class Rock extends Concert{
    private String bands;
    private boolean twoDayConcert;

    // default constructor
    public Rock() {
        super();
        bands = "";
        twoDayConcert = false;
    }

    //normal constructor 
    public Rock(String concertName, String date, String venue, char category, int tixQuantity, boolean member,
            String bands, boolean twoDayConcert) {
        super(concertName, date, venue, category, tixQuantity, member);
        this.bands = bands;
        this.twoDayConcert = twoDayConcert;
    }

    //setter methods
    //getter methods
    public String getBands() {
        return bands;
    }

    public void setBands(String bands) {
        this.bands = bands;
    }

    public boolean isTwoDayConcert() {
        return twoDayConcert;
    }

    public void setTwoDayConcert(boolean twoDayConcert) {
        this.twoDayConcert = twoDayConcert;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Rock [bands=" + bands + ", twoDayConcert=" + twoDayConcert + "]";
    }

    @Override
    public double calcTixPrice() {
        double ticketprice = 0.0;

        if(category == 'v'){
            ticketprice = 500;
        }else{
            ticketprice = 200;
        }
        double total = ticketprice *tixQuantity;
        
        if(twoDayConcert){
            total += 200 * tixQuantity;
        }
        return total;
    }

    
 }
 
