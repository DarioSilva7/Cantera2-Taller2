/**
 * Its represents a shuttle spaceships and some of its methods
 */
public class Shuttle extends Spaceship {
    public String payload;

    public Shuttle(String name,
                   Integer power,
                   Integer speed,
                   Integer height,
                   Integer weight,
                   Boolean fuel,
                   String fuelType,
                   String agency,
                   String propulsionSystem,
                   String payload)
    {
        super(name,
            "Launching a payload into space, usually an artificial satellite, probe, or manned spaceship.",
                power,
                speed,
                height,
                weight,
                fuel,
                fuelType,
                agency,
                propulsionSystem
        );
        this.payload= payload;
    }

    /**
     * This method is to indicates when the shuttle must release the payload.
     */
    public void releasePayload(){
        System.out.println("The shuttle spaceship "+this.name +" released the payload: "+this.payload);
    }
    @Override
    public String toString() {
        return "Shuttle{" +
                ", \npayload='" + payload + '\'' +
                ", \nname='" + name + '\'' +
                ", \npurpose='" + this.purpose + '\'' +
                ", \npower=" + super.power +
                ", \nspeed=" + this.speed +
                ", \nheight=" + this.height +
                ", \nweight=" + this.weight +
                ", \nagency='" + this.agency + '\'' +
                ", \nfuel=" + this.fuel +
                ", \nfuelType='" + this.fuelType + '\'' +
                ", \npropulsionSystem='" + super.propulsionSystem + '\'' +
                '}';
    }

    @Override
    public void speedUp() {
        System.out.println("The shuttle "+this.name+ " is accelerating...");
    }

    @Override
    public void takeOff() {
        System.out.println("The shuttle "+this.name+ " is taking off...");
    }

    @Override
    public void decelerate() {
        System.out.println("The shuttle "+this.name+ " is slowing down...");
    }

    @Override
    public void land() {
        System.out.println("The shuttle "+this.name+ " is landing...");
    }
}
