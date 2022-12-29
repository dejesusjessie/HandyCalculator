package Model;

/**
 * Number class
 * Abstract and parent class
 */

public abstract class Number {

    //fields
   private long value;

    //constructor
    public Number(){}
    public Number(String value){
        this.value = Long.parseLong(value);
    }

    //getter
    public long getValue() {
        return value;
    }

    //toString
    public String toString(){
        return String.valueOf(this.value);
    }

}
