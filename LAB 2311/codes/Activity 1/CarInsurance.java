public class CarInsurance {
    private String plateNo;             //car's plate no
    private double marketValue;         //market value of the car
    private boolean windscreenCover;    //insure the windscreen?

    // default constructor
    public CarInsurance() {
        plateNo = "";
        marketValue = 0.0;
        windscreenCover = false;
    }

    // normal constructor
    public CarInsurance(String plateNo, double marketValue, boolean windscreenCover) {
        this.plateNo = plateNo;
        this.marketValue = marketValue;
        this.windscreenCover = windscreenCover;
    }

    // getters and setters
    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public boolean isWindscreenCover() {
        return windscreenCover;
    }

    public void setWindscreenCover(boolean windscreenCover) {
        this.windscreenCover = windscreenCover;
    }

    // toString
    public String toString() {
        return "plateNo='" + plateNo + '\'' +
                ", marketValue=" + marketValue +
                ", windscreenCover=" + windscreenCover;
    }

    // processor
    public double calcTotalCost() {

        double cost = (marketValue/1000) * 26 +  300;
        if (windscreenCover)
            cost = cost + 150;

        return cost;
    }

} // end of class CarInsurance
