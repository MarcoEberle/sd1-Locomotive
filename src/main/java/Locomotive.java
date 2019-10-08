/**
 * This class represents a Locomotive with a special length, type (number), name and the first Car (wagon) on it.
 */
public class Locomotive {
    /**
     * Length of the Locomotive.
     */
    private final int length;
    /**
     * Serial number of the Locomotive.
     */
    private final int type;
    /**
     * Name of the Locomotive.
     */
    private final String name;
    /**
     * First Car after the Locomotive.
     */
    private Car first;

    /**
     * Constructor for creating a new locomotive.
     *
     * @param length - Value for the length of the Locomotive.
     * @param type   - Serial number of the locomotive.
     * @param name   - What name does the locomotive has.
     */
    public Locomotive(int length, int type, String name) {
        this.length = length;
        this.type = type;
        this.name = name;
    }

    /**
     * Getter for the first Car after the locomotive.
     *
     * @return - Returns the first Car.
     */
    public Car getFirst() {
        return first;
    }

    /**
     * Setter for the first Car after the locomotive.
     *
     * @param first - First Car.
     */
    public void setFirst(Car first) {
        this.first = first;
    }

    /**
     * Getter for the length of the locomotive.
     *
     * @return - Returns the value of the length.
     */
    public int getLength() {
        return length;
    }

    /**
     * Getter for the type of the locomotive.
     *
     * @return - Returns the serial number of the locomotive.
     */
    public int getType() {
        return type;
    }

    /**
     * Getter for the name of the locomotive.
     *
     * @return - Returns the name.
     */
    public String getName() {
        return name;
    }


}
