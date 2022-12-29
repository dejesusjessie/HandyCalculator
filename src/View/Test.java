package View;

import Controller.BandwidthCalculator;
import Controller.BinaryCalculator;
import Controller.Calculator;
import Model.*;
import Model.Number;

public class Test {
    public static final Decimal decimalValue = new Decimal();
    public static final Binary binaryValue = new Binary();
    public static final Decimal initialDecimalValue = new Decimal();
    public static final Hexadecimal hexValue = new Hexadecimal();
    public static Calculator calculator = new BinaryCalculator();
    public static final SizeUnit sizeUnitValue = new SizeUnit();
    public static final RateUnit rateUnitValue = new RateUnit();
    public static final BandwidthCalculator bandwidthCalculator = new BandwidthCalculator();
    public static final FrequencyUnit values = new FrequencyUnit();
    public static String result;
    public static String operator;
    public static Number operandOne;
    public static Number operandTwo;
    public static String target = "";
    public static double GigPerMonth = 0;

    public static void main(String[] args) {

        //converts decimal to binary - expected value: 10101010
        decimalValue.convertToBinary("170");
        result = decimalValue.getBinaryValueOfDecimal();
        System.out.println("1. The Decimal value of 170 in Binary is: " + result + " " + "////(Expected: 10101010).");

        //converts decimal to Hex - expected value: A03
        decimalValue.convertToHex("2563");
        result = decimalValue.getHexValueOfDecimal();
        System.out.println("2. The Decimal value of 2563 in Hexadecimal is: " + result + " " + "////(Expected: A03).");

        //converts binary to decimal -expected value: 65535
        binaryValue.convertToDecimal("1111111111111111");
        result = binaryValue.getDecimalValueOfBinary();
        System.out.println("3. The Binary value of 1111111111111111 in Decimal is: " + result + " " + "////(Expected: 65535).");

        //binary calculator "+" -expected value: 101110110
        binaryValue.convertToDecimal("10101010");
        result = binaryValue.getDecimalValueOfBinary();
        operandOne = new Binary(result);
        binaryValue.convertToDecimal("11001100");
        result = binaryValue.getDecimalValueOfBinary();
        operandTwo = new Binary(result);
        operator = "+";
        calculator.calculateResult(operandOne, operandTwo, operator);
        result = calculator.getResult();
        initialDecimalValue.convertToBinary(result);
        result = initialDecimalValue.getBinaryValueOfDecimal();
        System.out.println("4. The result of 10101010 + 11001100 is: " + result + " " + "////(Expected: 101110110).");

        //converts hex to decimal - expected value: 3501
        hexValue.convertToDecimal("DAD");
        result = hexValue.getDecimalValueOfHex();
        System.out.println("5. The Hexadecimal value of DAD in Decimal is: " + result + " " + "////(Expected: 3501).");

        //hex calculator "-" - expected value: 2CD
        hexValue.convertToDecimal("B78");
        result = hexValue.getDecimalValueOfHex();
        operandOne = new Hexadecimal(result);
        hexValue.convertToDecimal("8AB");
        result = hexValue.getDecimalValueOfHex();
        operandTwo = new Hexadecimal(result);
        operator = "-";
        calculator.calculateResult(operandOne, operandTwo, operator);
        result = calculator.getResult();
        initialDecimalValue.convertToHex(result);
        result = initialDecimalValue.getHexValueOfDecimal();
        System.out.println("6. The result of B78 - 8AB is: " + result + " " + "////(Expected: 2CD).");

        //convert data unit - expected value: 0.5 Gigabytes
        sizeUnitValue.convertDataUnit("500","Megabytes","Gigabytes");
        result = sizeUnitValue.getConversionValue();
        System.out.println("7. The data storage of 500 Megabytes is equivalent to " +
                result + " Gigabytes" + " " + "////(Expected: 0.5 Gigabytes).");

        //hosting bandwidth converter monthly to rate unit - expected result: aprox. 3.0420564301468
        rateUnitValue.convertMonthlyToRateUnit("1000","Gigabytes","mbit/s");
        result = rateUnitValue.getConversionMonthlyValue();
        System.out.println("8. The rate of 1000 gigabytes is approx: " + result +
                " " + "Mbit/s" + " " + "////(Expected: 3.0420564301468).");

        //hosting bandwidth converter rate unit to monthly - expected: 0.328515111695138
        rateUnitValue.convertRateUnitToMonthly("1000","bit/s","gigabytes");
        result = rateUnitValue.getConversionRateUnit();
        System.out.println("9. The rate of 1000 gigabytes is approx: " + result +
                " " + "Mbit/s" + " " + "////(Expected: 0.328515111695138).");

        //Download/Upload Calculator - expected value: 13 minutes 20 seconds
        bandwidthCalculator.calculateUploadDownloadTime("500","megabytes","5","Mbit/s");
        result = bandwidthCalculator.getCalculateUploadDownload();
        System.out.println("10. Download or upload time needed is approximately: " + result + " " + "////(Expected: 13 minutes 20 seconds).");

        //Bandwidth Calculator - expected: 0.46296296296296 Mbits/s or 152.1875 GB per month
        values.websiteBandwidth("5000","per day","500","kilobytes","2");
        GigPerMonth = values.getBandwidthCalculation();
        result = String.valueOf(GigPerMonth * 8000 / 2.628e+6); //Megabit per month
        System.out.println("11. With redundancy factor of 2, the bandwidth needed is appox: "
                + result + " Mbit/s or " + GigPerMonth + " GB per month" + " " + "\n////(Expected: 0.46296296296296 Mbits/s or 152.1875 GB per month).");

    }
}
