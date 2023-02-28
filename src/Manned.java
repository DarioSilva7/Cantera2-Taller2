/**
 * Its represents a manned spaceships and some of its methods
 */
public class Manned extends Spaceship {
    public Integer crewMembers;
    public Manned(String name,
                  Integer power,
                  Integer speed,
                  Integer height,
                  Integer weight,
                  Boolean fuel,
                  String fuelType,
                  String agency,
                  String propulsionSystem,
                  Integer crewMembers
    )
    {
        super(name,
                "Sending humans into space for repair, maintenance, or research tasks, on missions where people's dexterity and decision-making are required.",
                power,
                speed,
                height,
                weight,
                fuel,
                fuelType,
                agency,
                propulsionSystem
        );
        this.crewMembers= crewMembers;
    }

    /**
     * This method indicates that they are returning home.
     */
    public void returnHome(){
        System.out.println("The manned spaceship "+ this.name+ " is returning home!");
    }

    /**
     * This method is to abduct some discovery and take it home.
     */
    public void abduction(){
        System.out.println("The manned spaceship "+ this.name+ " is abducting something...");
    }
    @Override
    public String toString() {
        return "Manned{" +
                "\ncrewMembers=" + crewMembers +
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

    @Override
    public void speedUp() {
        System.out.println("The manned spaceship "+this.name+ " is accelerating...");
    }

    @Override
    public void takeOff() {
        System.out.println("The manned spaceship "+this.name+ " is taking off...");
    }

    @Override
    public void decelerate()  {
        System.out.println("The manned spaceship "+this.name+ " is slowing down...");
    }

    @Override
    public void land() {
        System.out.println("The manned spaceship "+this.name+ " is landing...");
    }
}