package dev.samuelhayden.haydenapi.tuples;

public class Quintet<FirstObject, SecondObject, ThirdObject, FourthObject, FifthObject> {
    private final FirstObject firstObject;
    private final SecondObject secondObject;
    private final ThirdObject thirdObject;
    private final FourthObject fourthObject;
    private final FifthObject fifthObject;

    public Quintet(FirstObject firstObject, SecondObject secondObject, ThirdObject thirdObject, FourthObject fourthObject, FifthObject fifthObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
        this.fourthObject = fourthObject;
        this.fifthObject = fifthObject;
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

    public final FifthObject getFifthObject() {
        return fifthObject;
    }
}
