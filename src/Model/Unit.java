package Model;

/**
 * Unit class
 * Abstract and parent class
 */

public abstract class Unit {

    //fields
    private String unit;


    //constructor
    public Unit(){}
    public Unit(String unit){
        this.unit = unit;

    }

    //getter
    public String getValue() {
        return this.unit;
    }

    //toString
    public String toString(){
        return this.unit;
    }


}
