package Controller;

/**
 * Decimal Calculator class
 * Performs all the conversion of decimal values
 */

public class DecimalCalculator extends Calculator {


    //conversion methods
    @Override
    public String convertToBinary(double value) {
        return null;
    }
    @Override
    public String convertToHex(double value) {
        return null;
    }
    @Override
    public String convertBinaryToDecimal(long value) {


        //test user input value

        long decimal = 0; //Stores the sum of the remainder (also known as result)
        long exponent = 0; // 2^exponent

        char firstIndex = String.valueOf(value).charAt(0);


        if (value == 1) {
            decimal = 1;
        }
        else if(firstIndex == '0' || firstIndex =='1') {
            while (value != 0) {
                double remainder = value % 10;
                //Need to cast because math.pow returns double
                decimal = decimal + (long) (remainder * Math.pow(2, exponent));
                exponent++;
                value = value / 10;
            }
        }
        return String.valueOf(decimal);
    }
    @Override
    public String convertHexToDecimal(String value) {

        value = value.toUpperCase(); //Upper case user input

        String hexVal = "0123456789ABCDEFG";

        int decimal = 0;

        for(int index = 0; index < value.length(); index++){
            char valueIndex = value.charAt(index);       //index of user input
            int hexReference = hexVal.indexOf(valueIndex);   //index of user input referenced to hex chart
            decimal = 16 * decimal + hexReference;
        }

        return String.valueOf(decimal);
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
