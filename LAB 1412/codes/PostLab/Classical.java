public class Classical extends Concert{
    private String artist;

    //default constructor
    public Classical() {
        super();
        artist = "";
    }

    //normal constructor 
    public Classical(String concertName, String date, String venue, char category, int tixQuantity, boolean member,
            String artist) {
        super(concertName, date, venue, category, tixQuantity, member);
        this.artist = artist;
    }

    //setter methods
    //getter methods
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + ", Classical [artist=" + artist + "]";
    }
    
    @Override
    public double calcTixPrice() {
        double ticketprice = 0.0;

        if(category == 'v'){
            ticketprice = 690;
        }else if( category == '1'){
            ticketprice = 500;
        }else if(category == '2'){
            ticketprice = 350;
        }

        if(member){
            ticketprice *= 0.95;
        }
        double total = ticketprice * tixQuantity;

        return total;
    }

    

    
 }
 