package Controller;

/**
 * Bandwidth Calculator class
 * Performs all the conversion and calculations of bandwidth values
 */
public class BandwidthCalculator extends Calculator{

    //field
    private String calculateUploadDownload;

    //getter
    public String getCalculateUploadDownload() {
        return calculateUploadDownload;
    }

    //method
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
        return null;
    }
    @Override
    public String convertHexToDecimal(String value) {
        return null;
    }
    @Override
    public String convertDataUnit(double value, String size, String target) {

        String result = "";

        if(size.equalsIgnoreCase("bits") || size.equalsIgnoreCase("bit")){
            if(target.equalsIgnoreCase("kilobits") || target.equalsIgnoreCase("kilobit")){
                result += (value/1000);
            }
            else if(target.equalsIgnoreCase("megabits") || target.equalsIgnoreCase("megabit")){
                result += (value/1e+6);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit")){
                result += (value/1e+9);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value/1e+12);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value/8);
            }
            else if(target.equalsIgnoreCase("kilobytes") || target.equalsIgnoreCase("kilobyte")){
                result += (value/8000);
            }
            else if(target.equalsIgnoreCase("megabytes") || target.equalsIgnoreCase("megabyte")){
                result += (value/8e+6);
            }
            else if(target.equalsIgnoreCase("gigabytes") || target.equalsIgnoreCase("gigabyte")){
                result += (value/8e+9);
            }
            else if(target.equalsIgnoreCase("terabytes") || target.equalsIgnoreCase("terabyte")){
                result += (value/8e+12);
            }
            else{
                result += String.valueOf(value);
            }

        }
        else if(size.equalsIgnoreCase("kilobits") || size.equalsIgnoreCase("kilobit")){
            if(target.equalsIgnoreCase("bits") || target.equalsIgnoreCase("bit")){
                result += (value*1000);
            }
            else if(target.equalsIgnoreCase("megabits")|| target.equalsIgnoreCase("megabit")){
                result += (value/1000);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit")){
                result += (value/1e+6);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value/1e+9);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value * 125);
            }
            else if(target.equalsIgnoreCase("kilobytes") || target.equalsIgnoreCase("kilobyte")){
                result += (value/8);
            }
            else if(target.equalsIgnoreCase("megabytes") || target.equalsIgnoreCase("megabyte")){
                result += (value/8000);
            }
            else if(target.equalsIgnoreCase("gigabytes") || target.equalsIgnoreCase("gigabyte")){
                result += (value/8e+6);
            }
            else if(target.equalsIgnoreCase("terabytes") || target.equalsIgnoreCase("terabyte")){
                result += (value/8e+9);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else if(size.equalsIgnoreCase("megabits") || size.equalsIgnoreCase("megabit")){
            if(target.equalsIgnoreCase("bits")||target.equalsIgnoreCase("bit")){
                result += (value*1e+6);
            }
            else if(target.equalsIgnoreCase("kilobits") || target.equalsIgnoreCase("kilobit")){
                result += (value*1000);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit")){
                result += (value/1000);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value/1e+6);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value * 125000);
            }
            else if(target.equalsIgnoreCase("kilobytes") || target.equalsIgnoreCase("kilobyte")){
                result += (value * 125);
            }
            else if(target.equalsIgnoreCase("megabytes") || target.equalsIgnoreCase("megabyte")){
                result += (value/8);
            }
            else if(target.equalsIgnoreCase("gigabytes") || target.equalsIgnoreCase("gigabyte")){
                result += (value/8000);
            }
            else if(target.equalsIgnoreCase("terabytes") || target.equalsIgnoreCase("terabyte")){
                result += (value/8e+6);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else if(size.equalsIgnoreCase("gigabits") || size.equalsIgnoreCase("gigabit")){
            if(target.equalsIgnoreCase("bits")||target.equalsIgnoreCase("bit")){
                result += (value*1e+9);
            }
            else if(target.equalsIgnoreCase("kilobits") || target.equalsIgnoreCase("kilobit")){
                result += (value*1e+6);
            }
            else if(target.equalsIgnoreCase("megabits") || target.equalsIgnoreCase("megabit")){
                result += (value * 1000);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value/1000);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value * 1.25e+8);
            }
            else if(target.equalsIgnoreCase("kilobytes") || target.equalsIgnoreCase("kilobyte")){
                result += (value * 125000);
            }
            else if(target.equalsIgnoreCase("megabytes")|| target.equalsIgnoreCase("megabyte")){
                result += (value * 125);
            }
            else if(target.equalsIgnoreCase("gigabytes") || target.equalsIgnoreCase("gigabyte")){
                result += (value/8);
            }
            else if(target.equalsIgnoreCase("terabytes") || target.equalsIgnoreCase("terabyte")){
                result += (value/8000);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else if(size.equalsIgnoreCase("terabits") || size.equalsIgnoreCase("terabit")){
            if(target.equalsIgnoreCase("bits") || target.equalsIgnoreCase("bit")){
                result += (value * 1e+12);
            }
            else if(target.equalsIgnoreCase("kilobits") ||target.equalsIgnoreCase("kilobit")){
                result += (value * 1e+9);
            }
            else if(target.equalsIgnoreCase("megabits") || target.equalsIgnoreCase("megabit")){
                result += (value * 1e+9);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit")){
                result += (value * 1000);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value * 1.25e+11);
            }
            else if(target.equalsIgnoreCase("kilobytes") || target.equalsIgnoreCase("kilobyte")){
                result += (value * 1.25e+8);
            }
            else if(target.equalsIgnoreCase("megabytes") || target.equalsIgnoreCase("megabyte")){
                result += (value * 125000);
            }
            else if(target.equalsIgnoreCase("gigabytes") || target.equalsIgnoreCase("gigabyte")){
                result += (value * 125);
            }
            else if(target.equalsIgnoreCase("terabytes") || target.equalsIgnoreCase("terabyte")){
                result += (value/8);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else if(size.equalsIgnoreCase("byte") || size.equalsIgnoreCase("bytes")){
            if(target.equalsIgnoreCase("bits") || target.equalsIgnoreCase("bit")){
                result += (value / 8);
            }
            else if(target.equalsIgnoreCase("kilobits") || target.equalsIgnoreCase("kilobit")){
                result += (value / 0.008);
            }
            else if(target.equalsIgnoreCase("megabits") || target.equalsIgnoreCase("megabit")){
                result += (value / 125000);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit")){
                result += (value / 1.25e+8);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value / 1.25e+11);
            }
            else if(target.equalsIgnoreCase("kilobytes") || target.equalsIgnoreCase("kilobyte")){
                result += (value / 1000);
            }
            else if(target.equalsIgnoreCase("megabyte") || target.equalsIgnoreCase("megabytes")){
                result += (value / 1e+6);
            }
            else if(target.equalsIgnoreCase("gigabytes") || target.equalsIgnoreCase("gigabyte")){
                result += (value / 1e+9);
            }
            else if(target.equalsIgnoreCase("terabytes")|| target.equalsIgnoreCase("terabyte")){
                result += (value / 1e+12);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else if(size.equalsIgnoreCase("kilobytes") || size.equalsIgnoreCase("kilobyte")){
            if(target.equalsIgnoreCase("bits") || target.equalsIgnoreCase("bit")){
                result += (value * 8000);
            }
            else if(target.equalsIgnoreCase("kilobits") || target.equalsIgnoreCase("kilobit")){
                result += (value * 8);
            }
            else if(target.equalsIgnoreCase("megabits") || target.equalsIgnoreCase("megabit")){
                result += (value / 125);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit") ){
                result += (value / 125000);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value / 1.25e+8);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value * 1000);
            }
            else if(target.equalsIgnoreCase("megabytes") || target.equalsIgnoreCase("megabyte")){
                result += (value / 1000);
            }
            else if(target.equalsIgnoreCase("gigabytes") || target.equalsIgnoreCase("gigabyte")){
                result += (value / 1e+6);
            }
            else if(target.equalsIgnoreCase("terabytes") || target.equalsIgnoreCase("terabyte")){
                result += (value / 1e+9);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else if(size.equalsIgnoreCase("megabytes") || size.equalsIgnoreCase("megabyte")){
            if(target.equalsIgnoreCase("bits") || target.equalsIgnoreCase("bit")){
                result += (value * 8e+6);
            }
            else if(target.equalsIgnoreCase("kilobits") || target.equalsIgnoreCase("kilobit")){
                result += (value / 8000);
            }
            else if(target.equalsIgnoreCase("megabits") || target.equalsIgnoreCase("megabit")){
                result += (value / 8);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit")){
                result += (value / 125);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value / 125000);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value * 1e+6);
            }
            else if(target.equalsIgnoreCase("kilobytes") || target.equalsIgnoreCase("kilobyte")){
                result += (value * 1000);
            }
            else if(target.equalsIgnoreCase("gigabytes")|| target.equalsIgnoreCase("gigabyte")){
                result += (value / 1000);
            }
            else if(target.equalsIgnoreCase("terabyte") || target.equalsIgnoreCase("terabytes")){
                result += (value / 1e+6);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else if(size.equalsIgnoreCase("gigabytes") || size.equalsIgnoreCase("gigabyte")){
            if(target.equalsIgnoreCase("bits") || target.equalsIgnoreCase("bit")){
                result += (value * 8e+9);
            }
            else if(target.equalsIgnoreCase("kilobits") || target.equalsIgnoreCase("kilobit")){
                result += (value * 8e+6);
            }
            else if(target.equalsIgnoreCase("megabits") || target.equalsIgnoreCase("megabit")){
                result += (value * 8000);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit")){
                result += (value * 8);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value * 125);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value * 1e+9);
            }
            else if(target.equalsIgnoreCase("kilobytes") || target.equalsIgnoreCase("kilobyte")){
                result += (value * 1e+6);
            }
            else if(target.equalsIgnoreCase("megabytes") || target.equalsIgnoreCase("megabyte")){
                result += (value * 1000);
            }
            else if(target.equalsIgnoreCase("terabytes") || target.equalsIgnoreCase("terabyte")){
                result += (value / 1000);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else if(size.equalsIgnoreCase("terabytes") || size.equalsIgnoreCase("terabyte")){
            if(target.equalsIgnoreCase("bits") || target.equalsIgnoreCase("bit")){
                result += (value * 8e+12);
            }
            else if(target.equalsIgnoreCase("kilobits") || target.equalsIgnoreCase("kilobit")){
                result += (value * 8e+9);
            }
            else if(target.equalsIgnoreCase("megabits") || target.equalsIgnoreCase("megabit")){
                result += (value * 8e+6);
            }
            else if(target.equalsIgnoreCase("gigabits") || target.equalsIgnoreCase("gigabit")){
                result += (value * 8000);
            }
            else if(target.equalsIgnoreCase("terabits") || target.equalsIgnoreCase("terabit")){
                result += (value * 8);
            }
            else if(target.equalsIgnoreCase("bytes") || target.equalsIgnoreCase("byte")){
                result += (value * 1e+12);
            }
            else if(target.equalsIgnoreCase("kilobytes")|| target.equalsIgnoreCase("kilobyte")){
                result += (value * 1e+9);
            }
            else if(target.equalsIgnoreCase("megabytes") || target.equalsIgnoreCase("megabyte")){
                result += (value * 1e+6);
            }
            else if(target.equalsIgnoreCase("gigabytes") || target.equalsIgnoreCase("gigabyte")){
                result += (value * 1000);
            }
            else{
                result += String.valueOf(value);
            }
        }
        else{
            return ("Invalid. Try again.");
        }


        return result;
    }
    @Override
    public String convertHostBandwidthMonthly(String value, String size, String rate){

        double Value = Double.parseDouble(value);

        String perMonth;

        if(!size.equalsIgnoreCase("gigabytes")){
            String GB = "gigabytes";
            perMonth = convertDataUnit(Value, size, GB); //converts size to gigabytes
        }
        else{
            perMonth = value;
        }

        return convertFromPerMonthToBitPerSecond(perMonth, rate);

    }
    public String convertHostBandwidthRateUnit(String value, String rate,String monthly){

        double Value = Double.parseDouble(value);
        String Rate = "";


        if(!rate.equalsIgnoreCase("bit/s")){
            if(rate.equalsIgnoreCase("Kbit/s")){Rate += Value * 1000;}
            else if(rate.equalsIgnoreCase("Mbit/s")){Rate += Value * 1e+6;}
            else if(rate.equalsIgnoreCase("Gbit/s")){Rate += Value * 1e+9;}
            else if(rate.equalsIgnoreCase("Tbit/s")){Rate += Value *1e+12;}

        }else{Rate = value;}

        return convertBitPerSecondToMonthly(Rate,monthly);
    }
    private String convertBitPerSecondToMonthly(String rate, String monthly) {
        double Value = Double.parseDouble(rate);
        String result = "";

        if(monthly.equalsIgnoreCase("Bytes")){
            result += Value * 328500;
        }
        else if(monthly.equalsIgnoreCase("Kilobytes")){
            result += Value * 329;
        }
        else if(monthly.equalsIgnoreCase("Megabytes")){
            result += Value / 3.044;
        }
        else if(monthly.equalsIgnoreCase("Gigabytes")){
            result += Value / 3044;
        }
        else if(monthly.equalsIgnoreCase("Terabytes")){
            result += Value / 3.044e+6;
        }
        return result;

    }
    public String convertFromPerMonthToBitPerSecond (String value, String rate){

        double Value = Double.parseDouble(value);
        String result = "";

        if(rate.equalsIgnoreCase("bit/s")){
            result += Value * 3044;
        }
        else if(rate.equalsIgnoreCase("kbit/s")){
            result += Value * 3.044;
        }
        else if(rate.equalsIgnoreCase("mbit/s")){
            result += Value / 329;
        }
        else if(rate.equalsIgnoreCase("gbit/s")){
            result += Value / 328500;
        }
        else if(rate.equalsIgnoreCase("tbit/s")){
            result += Value / 3.285e+8;
        }
        return result;


    }
    public String convertToMegaBitPerSecond(String band, String bandSize){
        double number = Double.parseDouble(band);
        String result = "";

        //converts identical units to bit.

        if (bandSize.equalsIgnoreCase("bit/s")){
            result += number / 1e+6;
        }
        else if (bandSize.equalsIgnoreCase("kbit/s")){
            result += number / 1000;
        }
        else if (bandSize.equalsIgnoreCase("gbit/s")){
            result +=  number * 1000;
        }
        else if (bandSize.equalsIgnoreCase("tbit/s")){
            result += number * 1e+6;
        }

        return result;
    }
    public void calculateUploadDownloadTime(String value, String size, String rate, String rateUnit){

        double Value = Double.parseDouble(value);
        String calculation; //converted bandwidth
        String time;

        //convert to file to megabytes
        if(!size.equalsIgnoreCase("megabytes") && !size.equalsIgnoreCase("megabyte")){
            String target = "megabytes";
            Value = Double.parseDouble(convertDataUnit(Value,size,target));

        }

        //convert to bandwidth to mbits
        if(!rateUnit.equalsIgnoreCase("mbit/s")){
            rateUnit = "mbit/s";
            rate = convertToMegaBitPerSecond(rate,rateUnit);
        }

        //Formula in megabytes and mbit/s
        calculation = String.valueOf(Value/(Double.parseDouble(rate)/8));

        time = convertSeconds(calculation);

        this.calculateUploadDownload = time;
    }
    public String convertSeconds(String time) {

        double input = Double.parseDouble(time);

        int days = 0;
        int hours = 0;
        int minutes = 0;
        double seconds = 0;
        String result = "";

        if (input >= 86400) {
            days += input / 86400;
            result += (days + " day(s) ");
        }
        if (input >= 3600) {
            hours += (input % 86400) / 3600;
            result += (hours + " hour(s) ");
        }
        if (input >= 60) {
            minutes += ((input % 86400) % 3600) / 60;
            result += (minutes + " minute(s) ");
        }
        seconds += ((input % 86400) % 3600) % 60;
        result += (seconds + " second(s) ");

        return result;
    }
    public double calculateWebsiteBandwidth(String views, String frequency, String pages, String size, String redundancy){

        double Pages = Double.parseDouble(pages);
        double result;
        String Time; //stores seconds,days, weeks, months
        String Size; //stores file size

        double num = Double.parseDouble(views);
        int Redundancy = Integer.parseInt(redundancy);


        if(!size.equalsIgnoreCase("gigabyte") && !size.equalsIgnoreCase("gigabytes")) {
            String GB = "gigabytes";
            Size = convertDataUnit(Pages, size, GB); //converts size to gigabytes
        }
        else{
            Size = pages;
        }

        if(!frequency.equalsIgnoreCase("per months") && !frequency.equalsIgnoreCase("per month") ) {  // converts current time to months
            String target = "per month";
            Time = convertFrequency(views,target,frequency);

        } else{
            Time = String.valueOf(num);
        }

        result = Double.parseDouble(Size) * Double.parseDouble(Time) * Redundancy; // Gigabytes per month

        return result;
    }
    public static String convertFrequency(String value, String size, String frequency) {

        double number = Double.parseDouble(value);
        String result = "";

        if(size.equalsIgnoreCase("per seconds") || size.equalsIgnoreCase("per second")) {
            if(frequency.equalsIgnoreCase("per minutes") || frequency.equalsIgnoreCase("per minute")) {
                result += number/ 60;
            }
            if(frequency.equalsIgnoreCase("per hours") || frequency.equalsIgnoreCase("per hour")){
                result += number/ 3600;
            }
            if(frequency.equalsIgnoreCase("per days") || frequency.equalsIgnoreCase("per day")){
                result += number/ 86400 ;
            }
            if(frequency.equalsIgnoreCase("per weeks") || frequency.equalsIgnoreCase("per week")){
                result += number/ 604800;
            }
            if(frequency.equalsIgnoreCase("per months") || frequency.equalsIgnoreCase("per month")){
                result += number/ 2.628e+6 ;
            }
            if(frequency.equalsIgnoreCase("per year") || frequency.equalsIgnoreCase("per years")){
                result += number/ 3.154e+7;
            }


        }
        else if(size.equalsIgnoreCase("per minutes") || size.equalsIgnoreCase("per minute")){
            if(frequency.equalsIgnoreCase("per second") || frequency.equalsIgnoreCase("per seconds")) {
                result += number * 60;
            }
            if(frequency.equalsIgnoreCase("per hour") || frequency.equalsIgnoreCase("per hours")){
                result += number / 60;
            }
            if(frequency.equalsIgnoreCase("per day") || frequency.equalsIgnoreCase("per days")){
                result += number / 1440;
            }
            if(frequency.equalsIgnoreCase("per week") || frequency.equalsIgnoreCase("per weeks")){
                result += number /10080;
            }
            if(frequency.equalsIgnoreCase("per month") || frequency.equalsIgnoreCase("per months")){
                result += number / 43800;
            }
            if(frequency.equalsIgnoreCase("per year") || frequency.equalsIgnoreCase("per years")){
                result += number / 525600;
            }

        }
        else if(size.equalsIgnoreCase("per hours") || size.equalsIgnoreCase("per hour")){
            if(frequency.equalsIgnoreCase("per second") || frequency.equalsIgnoreCase("per seconds")) {
                result += number * 3600;
            }
            if(frequency.equalsIgnoreCase("per minute") || frequency.equalsIgnoreCase("per minutes")){
                result += number * 60;
            }
            if(frequency.equalsIgnoreCase("per day") || frequency.equalsIgnoreCase("per days")){
                result += number / 24;
            }
            if(frequency.equalsIgnoreCase("per week") || frequency.equalsIgnoreCase("per weeks")){
                result += number / 168;
            }
            if(frequency.equalsIgnoreCase("per month") || frequency.equalsIgnoreCase("per months")){
                result += number / 730;
            }
            if(frequency.equalsIgnoreCase("per year") || frequency.equalsIgnoreCase("per years")){
                result += number / 8760;
            }

        }
        else if(size.equalsIgnoreCase("per days") || size.equalsIgnoreCase("per day")){
            if(frequency.equalsIgnoreCase("per second") || frequency.equalsIgnoreCase("per seconds")) {
                result += number * 86400;
            }
            if(frequency.equalsIgnoreCase("per minute") || frequency.equalsIgnoreCase("per minutes")){
                result += number * 1440;
            }
            if(frequency.equalsIgnoreCase("per hour") || frequency.equalsIgnoreCase("per hours")){
                result += number / 24;
            }
            if(frequency.equalsIgnoreCase("per week") || frequency.equalsIgnoreCase("per weeks")){
                result += number / 7;
            }
            if(frequency.equalsIgnoreCase("per month") || frequency.equalsIgnoreCase("per months")){
                result += number / 30.417;
            }
            if(frequency.equalsIgnoreCase("per year") || frequency.equalsIgnoreCase("per years")){
                result += number / 365;
            }
        }
        else if(size.equalsIgnoreCase("per weeks") || size.equalsIgnoreCase("per week")){
            if(frequency.equalsIgnoreCase("per second") || frequency.equalsIgnoreCase("per seconds")){
                result += number * 604800;
            }
            if(frequency.equalsIgnoreCase("per minute") || frequency.equalsIgnoreCase("per minutes")) {
                result += number * 10080;
            }
            if(frequency.equalsIgnoreCase("per hour") || frequency.equalsIgnoreCase("per hours")){
                result += number * 168 ;
            }
            if(frequency.equalsIgnoreCase("per day") || frequency.equalsIgnoreCase("per days")){
                result += number * 7;
            }
            if(frequency.equalsIgnoreCase("per month") || frequency.equalsIgnoreCase("per months")){
                result += number / 4.345;
            }
            if(frequency.equalsIgnoreCase("per year") || frequency.equalsIgnoreCase("per years")){
                result += number / 52.143;
            }

        }
        else if(size.equalsIgnoreCase("per months") || size.equalsIgnoreCase("per month")){
            if(frequency.equalsIgnoreCase("per second") || frequency.equalsIgnoreCase("per seconds")){
                result += number * 2.628e+6;
            }
            if(frequency.equalsIgnoreCase("per minute") || frequency.equalsIgnoreCase("per minutes")) {
                result += number * 43800;
            }
            if(frequency.equalsIgnoreCase("per hour") || frequency.equalsIgnoreCase("per hours")){
                result += number *  730;
            }
            if(frequency.equalsIgnoreCase("per day") || frequency.equalsIgnoreCase("per days")){
                result += number * 30.417;
            }
            if(frequency.equalsIgnoreCase("per week") || frequency.equalsIgnoreCase("per weeks")){
                result += number * 4.345;
            }
            if(frequency.equalsIgnoreCase("per year") || frequency.equalsIgnoreCase("per years")){
                result += number / 12;
            }

        }
        else if(size.equalsIgnoreCase("per years") || size.equalsIgnoreCase("per year")){
            if(frequency.equalsIgnoreCase("per second") || frequency.equalsIgnoreCase("per seconds")){
                result += number * 3.154e+76;
            }
            if(frequency.equalsIgnoreCase("per minute") || frequency.equalsIgnoreCase("per minutes")) {
                result += number * 525600;
            }
            if(frequency.equalsIgnoreCase("per hour") || frequency.equalsIgnoreCase("per hours")){
                result += number * 8760;
            }
            if(frequency.equalsIgnoreCase("per day") || frequency.equalsIgnoreCase("per days")){
                result += number * 365;
            }
            if(frequency.equalsIgnoreCase("per week") || frequency.equalsIgnoreCase("per weeks")){
                result += number * 52.143;
            }
            if(frequency.equalsIgnoreCase("per month") || frequency.equalsIgnoreCase("per months")){
                result += number * 12;
            }

        }

        return result ;

    }


    

    


}
