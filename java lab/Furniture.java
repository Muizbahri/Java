public class Furniture {
    private String furnitureType;
    private String material;
    private double pricePerUnit;
    private int quantity;

    //default constructor
    public Furniture(){
        furnitureType = "";
        material = "";
        pricePerUnit = 0;
        quantity = 0;
    }
    //normal constructor
    public Furniture(String furnitureType,String material, double pricePerUnit,int quantity){
       this.furnitureType = furnitureType;
       this.material = material;
       this.pricePerUnit = pricePerUnit;
       this.quantity = quantity;
    }

   //mutators
    public void setFurnitureType(String newFurnitureType){
        furnitureType = newFurnitureType;
    }
    
    public void setMaterial(String newMaterial){
        material = newMaterial;
    }
    
    public void setPriceperunit(double newPricePerUnit){
        pricePerUnit = newPricePerUnit;
    }
    
    public void setQuantity(int newQuantity){
        quantity = newQuantity;
    }

    //Accessors
    public String getFurniture(){
        return furnitureType;
    }
    public String getMaterial(){
        return material;
    }
    public double getPricePerUnit(){
        return pricePerUnit;
    }
    public int getQuantity(){
        return quantity;
    }

}
