/**
 * The types of enumerables.
 */
public enum Options {
    FUEL_TYPE("Propelente Luquido","Quimico","Ambos"),
    PROP_SYSTEM("Electromagnetico", "Combustion Interna", "Ambos"),
    PAYLOAD("Satelite artificial", "Sonda", "Nave Tripulada");
    private String opt1;
    private String opt2;
    private String opt3;
    private Options(String opt1, String opt2, String opt3) {
        this.opt1=opt1;
        this.opt2=opt2;
        this.opt3=opt3;
    }

    /**
     * This method gets the options of the enumerable.
     * @return an array with the options values.
     */
    public String[] getArrayOptions() {
        String [] arrOpts= {opt1, opt2, opt3};
        return arrOpts;
    }

}
