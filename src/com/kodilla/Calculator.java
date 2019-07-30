package com.kodilla;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        System.out.println("Suma = " + (x + y));
    }

    public void substract() {
        System.out.println("Różnica = " + (x - y));
    }

    public static void main(String[] args) {
	    Calculator calculator = new Calculator(10, 5);
	    calculator.add();
	    calculator.substract();
    }
}
