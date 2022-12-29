package Controller;

/**
 * Binary Calculator class
 * Performs all the conversion and calculations of binary values
 */

public class BinaryCalculator extends Calculator{


    //methods
    @Override
    public String convertToBinary(double value) {

        long Value = (long)value;
        StringBuilder binary = new StringBuilder(); //Stores binary numbers in normal order
        StringBuilder binaryReverse = new StringBuilder(); //Stores binary numbers in reverse order

        if (Value  == 0) {
            binaryReverse.append(0);
        } else if (Value  == 1) {
            binaryReverse.append(1);
        }else {
            while (Value  != 0) {
                binaryReverse.append(Value  % 2);
                Value  = Value  / 2;
            }
        }

        for (int index = binaryReverse.length() - 1; index >= 0; index--) {
            binary.append(binaryReverse.charAt(index));
        }

        return binary.toString();
    }
    @Override
    public String convertToHex(double value) {
        return null;
    }
    @Override
    public String convertBinaryToDecimal(long value) {
       return null;
    }
    @Override
    public String convertHexToDecimal(String value) {
        return null;
    }
    @Override
    public String convertDataUnit(double value, String size, String target) {
        return null;
    }
    @Override
    public String convertHostBandwidthMonthly(String value, String size, String rate) {
        return null;
    }


}
