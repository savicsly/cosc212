public class RentedVehicle {
    private double baseFee;

    public RentedVehicle(double baseFee) {
        this.baseFee = baseFee;
    }

    public double getCost() {
        return baseFee;
    }

    public void travel(int distance) {
        System.out.println("I cannot define how to travel");
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }
}
