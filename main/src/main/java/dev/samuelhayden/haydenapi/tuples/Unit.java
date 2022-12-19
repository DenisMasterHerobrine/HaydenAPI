package dev.samuelhayden.haydenapi.tuples;

public class Unit<FirstObject> {

    private final FirstObject firstObject;

    public Unit(FirstObject firstObject) {
        this.firstObject = firstObject;
    }

    public final FirstObject getFirstObject() {
        return firstObject;
    }
}
