package Model;

import Controller.*;

/**
 * Binary class
 * Manages binary values to be operated on
 */

public class Binary extends Number {

    //fields
    private final DecimalCalculator decimalConverter = new DecimalCalculator();
    private String decimalValueOfBinary;

    //constructors
    public Binary(){}
    public Binary (String value){super(value);}

    //getter
    public String getDecimalValueOfBinary() {
        return decimalValueOfBinary;
    }

    //method
    public void convertToDecimal(String value){
        this.decimalValueOfBinary = decimalConverter.convertBinaryToDecimal(Long.parseLong(value));
    }



}
