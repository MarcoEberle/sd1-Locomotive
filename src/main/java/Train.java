import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a whole Train with its Locomotive and Cars.
 * Every Train has a Locomotive and a name.
 */
public class Train {
    /**
     * Locomotive of this Train.
     */
    private final Locomotive locomotive;
    /**
     * Name of this Train.
     */
    private final String name;

    /**
     * Constructor to create a Train.
     *
     * @param locomotive - Locomotive object.
     * @param name       - Name of the Train.
     */
    public Train(Locomotive locomotive, String name) {
        this.locomotive = locomotive;
        this.name = name;
    }

    /**
     * Method to add another Car to the Train.
     * If the first Car is null it gets added directly. If there is another Car, the while loop walks through the whole
     * Train until the end is reached.
     *
     * @param car - Another Car that gets added to the end of the Train.
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
     * Method to print a whole Train and its information of passengers and weight.
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
     * Method that calculates the amount of passengers in the Train.
     * The while loop walks through the whole Train and collects the information of each Car.
     *
     * @return - Returns the amount of passengers.
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
     * Method that calculates the length of the Train.
     * The while loop walks through the whole Train and collects the information of each Car.
     *
     * @return - Returns the weight of the whole Train, Locomotive included.
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
     * Method that removes the first Car and makes the second Car first.
     *
     * @return - Returns the first Car.
     */
    public Car removeFirst() {
        final Car firstCar = getLocomotive().getFirst();
        final Car secondCar = firstCar.getNext();
        getLocomotive().setFirst(secondCar);
        return firstCar;
    }

    /**
     * Method which relink the Cars from another Train to this Train.
     *
     * @param train - Train to link off its cars to this train.
     */
    public void relink(Train train) {
        add(train.getLocomotive().getFirst());
        train.getLocomotive().setFirst(null);
    }

    /**
     * Method that reverts all Cars that Cars of Locomotive 1 2 3 4 5 will be Locomotive 5 4 3 2 1
     * First while loop is adding all Cars to the carList-
     * Second loop is unbinding the references to the next Car.
     * Third loop is reverting all Cars in the train.
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
     * Getter for the Locomotive.
     *
     * @return - Returns the locomotive.
     */
    public Locomotive getLocomotive() {
        return locomotive;
    }

    /**
     * Getter for the name of the Locomotive.
     *
     * @return - Returns the name of the locomotive.
     */
    public String getName() {
        return name;
    }
}
