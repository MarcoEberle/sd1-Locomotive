import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a whole Train with its Locomotive and Cars.
 * Every train has a locomotive and a name.
 */
public class Train {

    private final Locomotive locomotive;
    private final String name;

    /**
     * Constructor to create a train.
     *
     * @param locomotive - Locomotive object.
     * @param name       - Name of the train.
     */
    public Train(Locomotive locomotive, String name) {
        this.locomotive = locomotive;
        this.name = name;
    }

    /**
     * Method to add another car to the train.
     * If the first car is null it gets added directly. If there is another car, the while loop walks through the whole
     * train until the end is reached.
     *
     * @param car - Another car that gets added to the end of the train.
     */
    public void add(Car car) {
        Car nextCar = getLocomotive().getFirst();
        if (nextCar != null) {
            while (nextCar.getNext() != null) {
                nextCar = nextCar.getNext();
            }
            nextCar.setNext(car);
        } else {
            getLocomotive().setFirst(car);
        }

    }

    /**
     * Method to print a whole train and its information of passengers and weight.
     */
    public void print() {
        System.out.printf("Locomotive: type = %d, length = %dm%n", locomotive.getType(), locomotive.getLength());
        int number = 1;
        Car car = locomotive.getFirst();
        while (car != null) {
            System.out.printf("Car #%d: passengers = %d, length = %dm%n", number, car.getPassenger(), car.getLength());
            car = car.getNext();
            number++;
        }
    }

    /**
     * Method that calculates the amount of passengers in the train.
     * The while loop walks through the whole train and collects the information of each car.
     *
     * @return - returns the amount of passengers.
     */
    public int getPassengers() {
        Car nextCar = getLocomotive().getFirst();
        int allPassenger = 0;
        while (nextCar != null) {
            allPassenger += nextCar.getPassenger();
            nextCar = nextCar.getNext();
        }
        return allPassenger;
    }

    /**
     * Method that calculates the length of the train.
     * The while loop walks through the whole train and collects the information of each car.
     *
     * @return - returns the weight of the whole train, locomotive included.
     */
    public int getLength() {
        Car nextCar = getLocomotive().getFirst();
        int allLength = getLocomotive().getLength();
        while (nextCar != null) {
            allLength += nextCar.getLength();
            nextCar = nextCar.getNext();
        }
        return allLength;
    }

    /**
     * Method that removes the first car and makes the second car first.
     *
     * @return - returns the first car.
     */
    public Car removeFirst() {
        final Car firstCar = getLocomotive().getFirst();
        final Car secondCar = firstCar.getNext();
        getLocomotive().setFirst(secondCar);
        return firstCar;
    }

    /**
     * Method which relink the cars from another train to this train.
     *
     * @param train - Train to link off its cars to this train.
     */
    public void relink(Train train) {
        add(train.getLocomotive().getFirst());
        train.getLocomotive().setFirst(null);
    }

    /**
     * Method that reverts all wagons that car Locomotive 1 2 3 4 5 will be Locomotive 5 4 3 2 1
     * First while loop is adding all cars to the carList-
     * Second loop is unbinding the references to the next car.
     * Third loop is reverting all cars in the train.
     */
    public void revert() {
        Car nextCar = getLocomotive().getFirst();
        List<Car> carList = new ArrayList<>();
        if (nextCar != null) {
            carList.add(nextCar);
            while (nextCar.getNext() != null) {
                nextCar = nextCar.getNext();
                carList.add(nextCar);
            }
            for (int indexList = 0; indexList < carList.size(); indexList++) {
                carList.get(indexList).setNext(null);
            }

            getLocomotive().setFirst(null);
            for (int indexCarList = carList.size() - 1; indexCarList >= 0; indexCarList--) {
                add(carList.get(indexCarList));
            }

        }

    }

    /**
     * Getter for the locomotive.
     *
     * @return - Returns the locomotive.
     */
    public Locomotive getLocomotive() {
        return locomotive;
    }

    /**
     * Getter for the name of the locomotive.
     *
     * @return - Returns the name of the locomotive.
     */
    public String getName() {
        return name;
    }
}
