import java.util.Random;

public class Application {
    public static void main(String[] args) {
        RentedVehicle[] vehicles = new RentedVehicle[6];
        Random random = new Random();

        for (int i = 0; i < vehicles.length; i++) {
            int type = random.nextInt(3) + 1;
            switch (type) {
                case 1:
                    vehicles[i] = new Car(100, 0, random.nextInt(5) + 2);
                    break;
                case 2:
                    vehicles[i] = new Truck(150, 0, random.nextInt(10) + 1);
                    break;
                case 3:
                    vehicles[i] = new Bicycle(20, random.nextInt(10) + 1);
                    break;
            }
        }


        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(vehicles.length);
            int distance = random.nextInt(100) + 1;
            vehicles[index].travel(distance);
        }

        double totalCost = 0;
        for (RentedVehicle vehicle : vehicles) {
            totalCost += vehicle.getCost();
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Car with " + car.getNbSeats() + " seats.");
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Truck with capacity " + truck.getCapacity() + ".");
            } else if (vehicle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) vehicle;
                System.out.println("Bicycle rented for " + bicycle.getNbDays() + " days.");
            }
        }

        System.out.println("Total cost of rented vehicles: " + totalCost);
    }
}
