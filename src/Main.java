import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    /**
     * The array list where spaceships are stored.
     */
    static ArrayList<Spaceship> spaceshipsList = new ArrayList<>();

    /**
     * This method prints the number of spaceships and all the spaceships stored in the 'spaceshipsList' array list.
     */
    static public void showSpaceships(){
        System.out.println("Number of spaceships: "+ spaceshipsList.size());
        if (spaceshipsList.size() == 0) System.out.println("Spaceships are not yet created");
        else for (Spaceship nave : spaceshipsList) System.out.println(nave);
    }

    public static void main(String[] args) {
        int opt;
        /**
         * this function, prints the menu and takes the input response to evaluate it with a switch case.
         * The application will run until the user enters '0'.
         */
        do {
            Scanner inputOpt = new Scanner(System.in);
            Menu.printMenu();
            opt = inputOpt.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("List spaceships");
                    showSpaceships();
                }
                case 2 -> {
                    System.out.println("Create spaceship");
                    int typeSelected;
                    /**
                     * this iteration prints the menu to show the types of spaceships that can be created.
                     * The user must enter '0' to return to main menu.
                     */
                    do {
                        Menu.printSpaceshipsTypes();
                        Scanner spaceShipSelected = new Scanner(System.in);
                        typeSelected = spaceShipSelected.nextInt();
                        switch (typeSelected) {
                            case 1, 2, 3:
                                FactorySpaceship.createSpaceship(typeSelected);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Invalid option. If you want to continue, select between options 1, 2 or 3. If you want to exit press '0'. Thank you.");
                        }
                    } while (typeSelected != 0);
                }
                default -> {
                    System.out.println("Invalid option. If you want to continue, select between options 1 or 2. If you want to exit press '0'. Thank you.");
                    Menu.printMenu();
                    opt = inputOpt.nextInt();
                }
            }
            if(opt == 0){
                System.out.println("Thanks for stopping by! See you soon :)");
                break;
            }
        }while (opt != 0);
    }
}