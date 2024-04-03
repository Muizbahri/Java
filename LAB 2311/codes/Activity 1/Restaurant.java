public class Restaurant {
    private String name;
    private String address;
    private double rating;

    //default constructor
    public Restaurant(){
        name = "";
        address ="";
        rating = 0;
    }

    //normal constructor
    public Restaurant(String name, String address, double rating){
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getRating(){
        return rating;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setRating(double rating){
        this.rating = rating;
    }

    //toString
    public String toString(){
        return "name='" + name + '\'' + ", Address=" + address + ", Rating=" + rating;
    }
}// end of class restaurant
