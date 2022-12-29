package Controller;

/**
 * Convertible interface
 * Extends methods to all classes
 */
public interface Convertible {

    String convertToBinary(double value);
    String convertToHex(double value);
    String convertBinaryToDecimal(long value);
    String convertHexToDecimal(String value);
    String convertDataUnit(double value, String size, String target);
    String convertHostBandwidthMonthly(String value, String size, String rate);


}
