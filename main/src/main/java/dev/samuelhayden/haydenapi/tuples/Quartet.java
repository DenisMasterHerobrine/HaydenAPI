package dev.samuelhayden.haydenapi.tuples;

public class Quartet<FirstObject, SecondObject, ThirdObject, FourthObject> {
    private final FirstObject firstObject;
    private final SecondObject secondObject;
    private final ThirdObject thirdObject;
    private final FourthObject fourthObject;

    public Quartet(FirstObject firstObject, SecondObject secondObject, ThirdObject thirdObject, FourthObject fourthObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
        this.fourthObject = fourthObject;
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

    public final FourthObject getFourthObject() {
        return fourthObject;
    }
}
