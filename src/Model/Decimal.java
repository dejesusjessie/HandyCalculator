package Model;


import Controller.BinaryCalculator;
import Controller.HexCalculator;

/**
 * Decimal class
 * Manages binary values to be operated on
 */
public class Decimal extends Number{

    //fields
    private String hexValueOfDecimal;
    private String binaryValueOfDecimal;
    //constructors
    private final HexCalculator hexConverter = new HexCalculator();
    private final BinaryCalculator binaryConverter = new BinaryCalculator();

    //getters
    public String getHexValueOfDecimal() {
        return hexValueOfDecimal;
    }
    public String getBinaryValueOfDecimal() {
        return binaryValueOfDecimal;
    }

    //methods
    public void convertToHex(String value){
        this.hexValueOfDecimal = hexConverter.convertToHex(Double.parseDouble(value));
    }
    public void convertToBinary (String value){
        this.binaryValueOfDecimal = binaryConverter.convertToBinary(Double.parseDouble(value));
    }

}
