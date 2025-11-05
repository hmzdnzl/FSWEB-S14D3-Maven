package org.example.company;

public class Holden extends Car{
    private int cylinders;
    private String name;

    public Holden(boolean engine, int wheels) {
        super(engine, wheels);
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
