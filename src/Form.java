import java.util.Scanner;

/**
 * This class contains the questions to build a form.
 * And the 'createSpaceshipWithForm' method to create spaceships based on the answers to these questions
 */
public class Form {
    /**
     * To capture the responses entered
     */
    Scanner screen;
    private final String nameQuestion= "Enter the name of the spaceship: ";
    private final String crewQuestion= "Enter the number of spaceship crew members (min 1 | max 5): ";
    private final String powerQuestion= "Enter the power of the spaceship: ";
    private final String speedQuestion= "Enter the speed of the spaceship: ";
    private final String heightQuestion= "Enter the height of the spaceship: ";
    private final String weightQuestion= "Enter the weight of the spaceship: ";
    private final String fuelQuestion= "Use fuel? Enter 't' to true or 'f' to false:  ";
    private final String fuelTypeQuestion= "Select the fuel type:";
    private final String agencyQuestion= "Enter the agency name of the spaceship:";
    private final String propulsionSystemQuestion= "Select the propulsion system of the spaceship:";
    private final String payloadQuestion= "Select the payload of the spaceship:";

    Form() {
        screen = new Scanner(System.in);
    }

    /**
     * This method creates the spaceships.
     * @param type Integer. Refers to the type of spaceship.
     *             |1- Shuttle/Lanzadera
     *             |2- Manned/Tripulada
     *             |3- Unmanned/Sin tripulantes
     */
    public void createSpaceshipWithForm(Integer type){
        String nameResponse = this.getStringResponse(this.nameQuestion);
        Integer powerResponse= this.getIntResponse(this.powerQuestion);
        Integer speedResponse= this.getIntResponse(this.speedQuestion);
        Integer heightResponse= this.getIntResponse(this.heightQuestion);
        Integer weightResponse= this.getIntResponse(this.weightQuestion);
        Boolean fuelResponse= type == 3 ? false : this.getBoolResponse(this.fuelQuestion);
        String fuelTypeResponse= fuelResponse ? this.getSelectionsResponse(Options.FUEL_TYPE, this.fuelTypeQuestion): "Celula Fotovoltaica" ;
        String agencyResponse= this.getStringResponse(this.agencyQuestion);
        String propSysResponse= this.getSelectionsResponse(Options.PROP_SYSTEM, this.propulsionSystemQuestion);
        switch (type) {
            case 1 -> {
                String payloadResponse = this.getSelectionsResponse(Options.PAYLOAD, this.payloadQuestion);
                Shuttle newShuttle = new Shuttle(
                        nameResponse,
                        powerResponse,
                        speedResponse,
                        heightResponse,
                        weightResponse,
                        fuelResponse,
                        fuelTypeResponse,
                        agencyResponse,
                        propSysResponse,
                        payloadResponse
                );
                Main.spaceshipsList.add(newShuttle);
            }
            case 2 -> {
                Integer crewMembersResponse = this.getIntCrewMembers(this.crewQuestion);
                Manned newManned = new Manned(
                        nameResponse,
                        powerResponse,
                        speedResponse,
                        heightResponse,
                        weightResponse,
                        fuelResponse,
                        fuelTypeResponse,
                        agencyResponse,
                        propSysResponse,
                        crewMembersResponse
                );
                Main.spaceshipsList.add(newManned);
            }
            case 3 -> {
                Unmanned newUnManned = new Unmanned(
                        nameResponse,
                        powerResponse,
                        speedResponse,
                        heightResponse,
                        weightResponse,
                        fuelResponse,
                        fuelTypeResponse,
                        agencyResponse,
                        propSysResponse
                );
                Main.spaceshipsList.add(newUnManned);
            }
        }
    }

    /**
     * This method gets the input responses of type string.
     * @param question String.
     * @return (String) the answer entered to the corresponding question
     */
    private String getStringResponse(String question) {
        String response = "";
        while (response.equals("")) {
            System.out.println(question);
            response = screen.next();

            if (!response.matches("[A-Za-z0-9 ]*$")) {
                response = "";
            }
        }
        return response;
    }

    /**
     * This method show the possible options to select and gets the answer entered.
     * @param options enum. The possible options to display.
     * @param question String.
     * @return the option selected in the corresponding question
     */
    private String getSelectionsResponse(Options options, String question){
        String response="";
        int optSelected;
        do {
            String [] arrOpts= options.getArrayOptions();
            System.out.println(question);
            for (int i = 0; i < arrOpts.length; i++) {
                System.out.println((i+1)+". "+arrOpts[i]);
            }
            optSelected = screen.nextInt();
            switch (optSelected) {
                case 1 -> response = arrOpts[0];
                case 2 -> response = arrOpts[1];
                case 3 -> response = arrOpts[0] +" y "+ arrOpts[1] ;
                default -> System.out.println("Its an invalid input.");
            }
        }while (response.equals(""));
        return response;
    }

    /**
     * This method gets the number of crew members.
     * @param question String.
     * @return (integer) the answer entered to the corresponding question
     */
    private Integer getIntCrewMembers(String question) {
        int response;
        do {
            System.out.println(question);
            response = screen.nextInt();
        }while (response < 1 || response > 5);
        return response;
    }

    /**
     * This method gets the input responses of type integer.
     * @param question String.
     * @return (integer) the answer entered to the corresponding question
     */
    private Integer getIntResponse(String question) {
        int response = 0;
        while (response < 10) {
            System.out.println(question);
            response = screen.nextInt();
        }
        return response;
    }

    /**
     * This method gets the input responses of type boolean.
     * @param question String.
     * @return (boolean) the answer entered to the corresponding question
     */
    private Boolean getBoolResponse(String question) {
        String response = "";
        boolean bool= false;
        while (response.equals("")) {
            System.out.println(question);
            response = screen.next();
            if (response.matches("t")) {
                bool= true;
            } else if (response.matches("f")) {
                bool= false;
            }
            else response = "";
        }
        return bool;
    }
}