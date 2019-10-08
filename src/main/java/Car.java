/**
 * This class represents a single Car on a locomotive.
 * It has a special length, amount of passenger and the next car in line.
 */
public class Car {
    /**
     * Length of the Car
     */
    private final int length;
    /**
     * Amount of passengers in the Car.
     */
    private final int passenger;
    /**
     * Next Car after this in line.
     */
    private Car next;

    /**
     * Constructor that creates a Car for a train.
     *
     * @param length    - Length of the Car.
     * @param passenger -Amount of passengers in the Car.
     */
    public Car(int length, int passenger) {
        this.length = length;
        this.passenger = passenger;
    }

    /**
     * Getter for the length of the Car.
     *
     * @return - Returns an integer value of the length.
     */
    public int getLength() {
        return length;
    }

    /**
     * Getter for the amount of passengers.
     *
     * @return - Returns an integer value of how many passengers are in the Car.
     */
    public int getPassenger() {
        return passenger;
    }

    /**
     * Getter for the next car in line.
     *
     * @return - Returns the next Car.
     */
    public Car getNext() {
        return next;
    }

    /**
     * Setter for setting the next Car after this.
     *
     * @param next - Next Car after this.
     */
    public void setNext(Car next) {
        this.next = next;
    }
}
