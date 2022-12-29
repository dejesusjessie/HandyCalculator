package Model;

import Controller.BandwidthCalculator;

/**
 * Frequency unit class
 * Manages frequency values to be operated on
 */
public class FrequencyUnit extends Unit {

    //fields
    private final BandwidthCalculator bandwidthCalc = new BandwidthCalculator();
    private double bandwidthCalculation;

    //constructor
    public double getBandwidthCalculation() {
        return bandwidthCalculation;
    }

    //methods
    public void websiteBandwidth(String views, String frequency, String pages, String size, String redundancy){
        this.bandwidthCalculation = bandwidthCalc.calculateWebsiteBandwidth(views, frequency, pages, size, redundancy);
    }
}
