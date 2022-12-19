package dev.samuelhayden.haydenapi.tuples;

public class Pair<FirstObject, SecondObject> {
    private final FirstObject firstObject;
    private final SecondObject secondObject;

    public Pair(FirstObject firstObject, SecondObject secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public final FirstObject getFirstObject() {
        return firstObject;
    }

    public final SecondObject getSecondObject() {
        return secondObject;
    }
}
