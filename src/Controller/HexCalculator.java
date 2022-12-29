package Controller;

/**
 * Hexadecimal Calculator class
 * Performs all the conversion of hexadecimal values
 */

public class HexCalculator extends Calculator {


    @Override
    public String convertToHex(double value) {

        long Value = (long)value;
        StringBuilder hexadecimal = new StringBuilder();
        StringBuilder hexadecimalReverse = new StringBuilder();



        char[] hexaValues ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if(Value == 0) {
            hexadecimal = new StringBuilder("0");
        }
        else{
            while (Value != 0) {
                int remainder = (int)(Value) % 16;
                hexadecimalReverse.append(hexaValues[remainder]);
                Value = (int)Value / 16;
            }
        }

        for (int index = hexadecimalReverse.length() - 1; index >= 0; index--) {
            hexadecimal.append(hexadecimalReverse.charAt(index));
        }

        return hexadecimal.toString();

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
    @Override
    public String convertToBinary(double value) {
        return null;
    }
}
