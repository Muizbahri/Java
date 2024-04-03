public class RestaurantApp {
    public static void main(String args[]) {
        //i. Declare an array of objects using the class Restaurant named restaurants with size 100
        Restaurant [] restaurants = new Restaurant[100];
        //ii. Assume 100 Restaurant objects are stored inside the array. Using the array:
        //ii.a. Calculate and print the average rating of all restaurants.
        double total =0;

        for(int i =0; i<restaurants.length;i++){
            total += restaurants[i].getRating();
        }
        double average = total/ restaurants.length;

        System.out.println("Average rating of all restaurants: "+ average);

        /* ii.b.Count and display the number of restaurants from Malacca with a rating of 
        3.0 and above. (Hint: you can use the method contains() or indexOf() in String
         object to check whether the address contains the word “Melaka”) */
        int count = 0;
        for(int i =0; i<restaurants.length;i++){
            String address =restaurants[i].getAddress();
            double rating = restaurants[i].getRating();           
            
            if (address.toLowerCase().contains("melaka") && rating >= 3.0){
            count++;
        }
    }
        System.out.println("Number of restaurants from Malacca with a rating of 3.0 and above: " + count);
    
    }
}
