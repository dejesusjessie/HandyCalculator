package Controller;

import Model.Number;

/**
 * Calculator class
 * Abstract and parent class
 * Performs all calculations + - / * on Number objects
 */

public abstract class Calculator implements Convertible {


    private String result;

    public String getResult() {
        return result;
    }

    public void calculateResult(Number operandOne, Number operandTwo, String operator) {

        String result = "";
        switch(operator){

            case"+"-> result = add(operandOne,operandTwo);
            case"-"-> result = subtract(operandOne,operandTwo);
            case"*"-> result = multiply(operandOne,operandTwo);
            case"/"-> result = divide(operandOne,operandTwo);
            default -> System.out.println("Invalid Entry. Enter + - * /");

        }
       this.result = result;
    }

    public String add(Number operandOne, Number operandTwo){
        return this.result = String.valueOf(operandOne.getValue() + operandTwo.getValue());
    }
    public String subtract(Number operandOne, Number operandTwo){
        return this.result = String.valueOf(operandOne.getValue() - operandTwo.getValue());}
    public String multiply(Number operandOne, Number operandTwo){
        return this.result = String.valueOf(operandOne.getValue() * operandTwo.getValue());}
    public String divide(Number operandOne, Number operandTwo){
        return this.result = String.valueOf(operandOne.getValue() / operandTwo.getValue());}



}
