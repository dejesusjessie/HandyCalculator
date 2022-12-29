package Model;

import Controller.DecimalCalculator;

/**
 * Hexadecimal Class
 * Manages hexadecimal values to be operated upon
 */
public class Hexadecimal extends Number{

    //fields
    private final DecimalCalculator decimalConverter = new DecimalCalculator();
    private String decimalValueOfHex;

    //constructors
    public Hexadecimal(){}
    public Hexadecimal(String value){super(value);}

    //getters
    public String getDecimalValueOfHex() {
        return decimalValueOfHex;
    }

    //methods
    public void convertToDecimal (String value) {
        this.decimalValueOfHex = decimalConverter.convertHexToDecimal(value);
    }




}
