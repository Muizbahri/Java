/**
 * Concert
 */
public abstract class Concert {

    protected String concertName;
    protected String date; // e.g: “20-Jan-2023”
    protected String venue;
    protected char category; // 'v' for vip,'1' for level1,
                             // '2' for level2
    protected int tixQuantity; // quantity for tickets
    protected boolean member;

    // default constructor
    public Concert() {
        concertName = "";
        date = "";
        venue = "";
        category = '2';
        tixQuantity = 0;
        member = false;
    }

    // normal constructor
    public Concert(String concertName, String date, String venue, char category, int tixQuantity, boolean member) {
        this.concertName = concertName;
        this.date = date;
        this.venue = venue;
        this.category = category;
        this.tixQuantity = tixQuantity;
        this.member = member;
    }

    // setter methods
    // getter methods

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public int getTixQuantity() {
        return tixQuantity;
    }

    public void setTixQuantity(int tixQuantity) {
        this.tixQuantity = tixQuantity;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    // toString
    @Override
    public String toString() {
        return "Concert [concertName=" + concertName + ", date=" + date + ", venue=" + venue + ", category=" + category
                + ", tixQuantity=" + tixQuantity + ", member=" + member + "]";
    }

    // abstract method. will be implemented by the subclasses
    public abstract double calcTixPrice();

    

}