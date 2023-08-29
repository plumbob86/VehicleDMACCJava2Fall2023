package model;

/**
 * Represents a Motorcycle with properties such as year, make, and model.
 * This class provides methods to get and set these properties, as well as
 * methods for generating noise and obtaining a string representation of the motorcycle.
 *
 * @author Corbin Goodman - cgoodman4
 * CIS175 - Fall 2023
 * Aug 29, 2023
 */
public class Motorcycle {

    // Fields representing the properties of the motorcycle
    private int year;       // The year of the motorcycle
    private String make;    // The make (brand) of the motorcycle
    private String model;   // The model name of the motorcycle

    /**
     * Default constructor to create an empty Motorcycle object.
     */
    public Motorcycle() {
        super();
    }

    /**
     * Constructs a Motorcycle object with the provided year, make, and model.
     *
     * @param year  The year of the motorcycle
     * @param make  The make (brand) of the motorcycle
     * @param model The model name of the motorcycle
     */
    public Motorcycle(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    /**
     * Get the year of the motorcycle.
     *
     * @return The year of the motorcycle
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the year of the motorcycle.
     *
     * @param year The year of the motorcycle
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Get the make (brand) of the motorcycle.
     *
     * @return The make of the motorcycle
     */
    public String getMake() {
        return make;
    }

    /**
     * Set the make (brand) of the motorcycle.
     *
     * @param make The make of the motorcycle
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Get the model name of the motorcycle.
     *
     * @return The model name of the motorcycle
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the model name of the motorcycle.
     *
     * @param model The model name of the motorcycle
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Generate a string representation of the motorcycle.
     *
     * @return A formatted string describing the motorcycle
     */
    @Override
    public String toString() {
        return String.format("This motorcycle is a %d %s %s", this.year, this.make, this.model);
    }

    /**
     * Generate the sound of the motorcycle engine.
     *
     * @return The sound of the motorcycle engine
     */
    public String makeNoise() {
        return "vroom vroom";
    }
}
