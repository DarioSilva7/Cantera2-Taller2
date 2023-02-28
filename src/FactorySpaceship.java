public class FactorySpaceship {
    public static void createSpaceship(Integer type){
        Form form= new Form();
        switch (type){
            case 1, 2, 3:
                form.createSpaceshipWithForm(type);
                break;
            default:
                System.out.println("It's an invalid selection.");
                break;
        }
    }
}

