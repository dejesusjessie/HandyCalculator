package Model;

import Controller.BandwidthCalculator;

/**
 * Size unit class
 * Manages size unit values to be operated on
 */

public class SizeUnit extends Unit {

    //fields
    private final BandwidthCalculator bandwidthConverter = new BandwidthCalculator();
    private String conversionValue;


    //getter
    public String getConversionValue() {
        return conversionValue;
    }

    //method
    public void convertDataUnit(String value, String size, String target){
        this.conversionValue = bandwidthConverter.convertDataUnit(Double.parseDouble(value), size, target);
    }


}


