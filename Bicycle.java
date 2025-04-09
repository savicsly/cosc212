public class Bicycle extends RentedVehicle {
    private int nbDays;

    public Bicycle(double baseFee, int nbDays) {
        super(baseFee);
        this.nbDays = nbDays;
    }

    @Override
    public void travel(int distance) {
        System.out.println("I don’t consume fuel");
    }

    @Override
    public double getCost() {
        return getBaseFee() * nbDays;
    }

    public int getNbDays() {
        return nbDays;
    }

    public void setNbDays(int nbDays) {
        this.nbDays = nbDays;
    }
}
