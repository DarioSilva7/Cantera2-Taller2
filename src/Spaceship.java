/**
 * Its represents a base structure for creating spaceships. With some of their methods in common.
 */
public abstract class Spaceship {
    public String name;
    public String purpose;
    public Integer power;
    public Integer speed;
    public Integer height;
    public Integer weight;
    public String agency;
    public Boolean fuel;
    public String fuelType; // propelente liquido - quimico - ambos | celula fotovoltaica
    public String propulsionSystem; // electromagnetica - combustion interna


    public Spaceship(String name, String purpose, Integer power, Integer speed, Integer height, Integer weight,
                     Boolean fuel, String fuelType, String agency, String propulsionSystem) {
        this.name = name;
        this.purpose = purpose;
        this.power = power;
        this.speed = speed;
        this.height = height;
        this.weight = weight;
        this.agency = agency;
        this.fuel = fuel;
        this.fuelType = fuelType;
        this.propulsionSystem = propulsionSystem;
    }

    /**
     * This method makes the spacecraft accelerate
     */
    public abstract void speedUp();

    /**
     * This method makes the spaceship take off
     */
    public abstract void takeOff();

    /**
     * This method slows down the spacecraft
     */
    public abstract void decelerate();

    /**
     * This method lands the spacecraft
     */
    public abstract void land();
}
