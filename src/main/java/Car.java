/**
 * This class represents a single Car on a locomotive.
 * It has a special length, amount of passenger and the next car in line.
 */
public class Car {

    private final int length;
    private final int passenger;
    private Car next;

    /**
     * Constructor that creates a car for a train.
     *
     * @param length    - What length does the car has.
     * @param passenger - How many passengers are in the car.
     */
    public Car(int length, int passenger) {
        this.length = length;
        this.passenger = passenger;
    }

    /**
     * Getter for the length of the car.
     *
     * @return - Returns an integer value of the length.
     */
    public int getLength() {
        return length;
    }

    /**
     * Getter for the amount of passengers.
     *
     * @return - Returns an integer value of how many passengers are in the car.
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
     * Setter for setting the next car after this.
     *
     * @param next - Next Car after this.
     */
    public void setNext(Car next) {
        this.next = next;
    }
}
