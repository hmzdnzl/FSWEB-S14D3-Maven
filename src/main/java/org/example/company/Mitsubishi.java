package org.example.company;

public class Mitsubishi extends Car{
    private int cylinders;
    private String name;

    public Mitsubishi(boolean engine, int wheels) {
        super(engine, wheels);
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
