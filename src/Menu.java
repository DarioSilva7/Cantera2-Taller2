public class Menu {
    /**
     * this method prints the main menu.
     */
    public static void printMenu(){
        System.out.println("==================================");
        System.out.println("Main menu");
        System.out.println("==================================");
        System.out.println("Select an option:");
        System.out.println("----------------------------------");
        System.out.println("1- List spaceships");
        System.out.println("2- Create spaceship");
        System.out.println("0- Exit");
    }

    /**
     * This method prints the spaceship types menu.
     */
    public static void printSpaceshipsTypes(){
        System.out.println("===================================");
        System.out.println("Spaceship types Menu:");
        System.out.println("===================================");
        System.out.println("Select the spaceship type to create:");
        System.out.println("-----------------------------------");
        System.out.println("1- LANZADERA");
        System.out.println("2- TRIPULADAS");
        System.out.println("3- NO TRIPULADAS");
        System.out.println("0- Back to main menu");
    }
}
