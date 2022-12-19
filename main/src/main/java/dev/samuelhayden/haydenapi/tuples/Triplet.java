package dev.samuelhayden.haydenapi.tuples;

public class Triplet<FirstObject, SecondObject, ThirdObject> {
    private final FirstObject firstObject;
    private final SecondObject secondObject;
    private final ThirdObject thirdObject;

    public Triplet(FirstObject firstObject, SecondObject secondObject, ThirdObject thirdObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
    }

    public final FirstObject getFirstObject() {
        return firstObject;
    }

    public final SecondObject getSecondObject() {
        return secondObject;
    }

    public final ThirdObject getThirdObject() {
        return thirdObject;
    }
}
