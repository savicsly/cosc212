public class FuelVehicle extends RentedVehicle {
    private int nbKms;

    public FuelVehicle(double baseFee, int nbKms) {
        super(baseFee);
        this.nbKms = nbKms;
    }

    public double getMileageFees() {
        if (nbKms < 100) {
            return 0.2 * nbKms;
        } else if (nbKms <= 400) {
            return 0.3 * nbKms;
        } else {
            return 0.3 * 400 + 0.5 * (nbKms - 400);
        }
    }

    @Override
    public void travel(int distance) {
        nbKms += distance;
    }

    public int getNbKms() {
        return nbKms;
    }

    public void setNbKms(int nbKms) {
        this.nbKms = nbKms;
    }
}
