package com.georgiancollege.week12;

// This is my model class
public class Number {
    // variables
    private int number1;
    private int number2;

    // constructor
    public Number(int number1, int number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    // getters and setters
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    // other methods
    public int sum(){
        return (number1 + number2);
    }

    // toString
    @Override
    public String toString() {
        return "Number{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
