public class Car extends FuelVehicle {
    private int nbSeats;

    public Car(double baseFee, int nbKms, int nbSeats) {
        super(baseFee, nbKms);
        this.nbSeats = nbSeats;
    }

    @Override
    public double getCost() {
        return getMileageFees() + nbSeats * getBaseFee();
    }

    public int getNbSeats() {
        return nbSeats;
    }

    public void setNbSeats(int nbSeats) {
        this.nbSeats = nbSeats;
    }
}
