class PhoneBill {
    private int minutes;
    private double bill;

    public PhoneBill(int minutes) {
        this.minutes = minutes;
    }
    
    public double getBill() {
        return bill;
    }

    public void calculateBill() {
        if (minutes <= 100) {
            bill = minutes * 0.20;
        } else if (minutes <= 250) {
            bill = 100 * 0.20 + (minutes - 100) * 0.35;
        } else {
            bill = 100 * 0.20 + 150 * 0.35 + (minutes - 250) * 0.15;
        }
    }
}