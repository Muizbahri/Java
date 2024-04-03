public class rectangle {
    private double length;
    private double width;

    public rectangle(double l, double w){
        length = l;
        width = w;
    }

    public rectangle(rectangle r){
        length = r.length;
        width = r. width;        
    }

    public double areaRectangle(){
        return length * width;
    }
}
    
