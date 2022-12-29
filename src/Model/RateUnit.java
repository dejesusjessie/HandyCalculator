package Model;

import Controller.BandwidthCalculator;

/**
 * Rate unit class
 * Manages rate unit values to be operated on
 */

public class RateUnit extends Unit{

    //fields
    private final BandwidthCalculator bandwidthConverter = new BandwidthCalculator();
    private String conversionMonthlyValue;
    private String conversionRateUnit;

    //constructor
    public RateUnit(){}

    //getter
    public String getConversionMonthlyValue() {
        return conversionMonthlyValue;
    }
    public String getConversionRateUnit() {
        return conversionRateUnit;
    }

    //method
    public void convertMonthlyToRateUnit(String value, String size, String target){
        this.conversionMonthlyValue = bandwidthConverter.convertHostBandwidthMonthly(value,size,target);
    }

    public void convertRateUnitToMonthly(String value, String rate, String target){
        this.conversionRateUnit = bandwidthConverter.convertHostBandwidthRateUnit(value, rate,target);
    }
}
