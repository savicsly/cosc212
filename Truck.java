public class Truck extends FuelVehicle {
    private int capacity;

    public Truck(double baseFee, int nbKms, int capacity) {
        super(baseFee, nbKms);
        this.capacity = capacity;
    }

    @Override
    public double getCost() {
        return getMileageFees() + getBaseFee() * capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
