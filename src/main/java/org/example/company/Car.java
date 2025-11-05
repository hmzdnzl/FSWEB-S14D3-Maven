package org.example.company;

import java.util.Objects;

public class Car {
private boolean engine;
private int cylinders;
private String name;
private int wheels;


    public Car(boolean engine, int wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine == car.engine && cylinders == car.cylinders && wheels == car.wheels && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, cylinders, name, wheels);
    }
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + " -> the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + " -> the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + " -> the car is braking";
    }
}






