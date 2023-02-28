/**
 * Its represents an unmanned spaceships and some of its methods
 */
public class Unmanned extends Spaceship{
    /**
     * this ability allows him to hide in space so he won't be intentionally destroyed
     */
    private boolean camouflage;
    public Unmanned(String name,
                    Integer power,
                    Integer speed,
                    Integer height,
                    Integer weight,
                    Boolean fuel,
                    String fuelType,
                    String agency,
                    String propulsionSystem
    ) {
        super(
                name,
                "Its main objective is to study other celestial bodies. The first in history were intended to study our natural satellite.",
                power,
                speed,
                height,
                weight,
                fuel,
                fuelType,
                agency,
                propulsionSystem
        );
        this.camouflage= false;
    }

    @Override
    public String toString() {
        return "Unmanned{" +
                "\ncamouflage=" + camouflage +
                "\nname='" + name + '\'' +
                "\npurpose='" + purpose + '\'' +
                "\npower=" + power +
                "\nspeed=" + speed +
                "\nheight=" + height +
                "\nweight=" + weight +
                "\nagency='" + agency + '\'' +
                "\nfuel=" + fuel +
                "\nfuelType='" + fuelType + '\'' +
                "\npropulsionSystem='" + propulsionSystem + '\'' +
                '}';
    }

    /**
     * This method shows us if the spaceship is cloaked or not.
     */
    public void isCamouflage() {
        if ((this.camouflage)) {
            System.out.println("The unmanned spaceship " + this.name + " now it is camouflaged...");
        } else {
            System.out.println("The unmanned spaceship " + this.name + " now it is exposed...");
        }
    }

    /**
     * this method sets the camouflage attribute
     * @param camouflage boolean.
     */
    public void setCamouflage(boolean camouflage) {
        if ((this.camouflage) && (camouflage)) System.out.println("The spaceship is already camouflaged");
        else if ((!this.camouflage) && (!camouflage)) System.out.println("The spaceship is already exposed");
        else this.camouflage = camouflage;
    }
    @Override
    public void speedUp() {
        System.out.println("The unmanned spaceship "+this.name+ " is accelerating...");
    }

    @Override
    public void takeOff() {
        System.out.println("The unmanned spaceship "+this.name+ " is taking off...");
    }

    @Override
    public void decelerate()  {
        System.out.println("The unmanned spaceship "+this.name+ " is slowing down...");
    }

    @Override
    public void land() {
        System.out.println("The unmanned spaceship "+this.name+ " is landing...");
    }
}
