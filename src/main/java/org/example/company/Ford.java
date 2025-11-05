package org.example.company;

public class Ford extends Car{
    private int cylinders;
    private String name;

    public Ford(boolean engine, int wheels) {
        super(engine, wheels);
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
