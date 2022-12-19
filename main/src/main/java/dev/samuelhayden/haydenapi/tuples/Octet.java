package dev.samuelhayden.haydenapi.tuples;

public class Octet<FirstObject, SecondObject, ThirdObject, FourthObject, FifthObject, SixthObject, SeventhObject, EighthObject> {
    private final FirstObject firstObject;
    private final SecondObject secondObject;
    private final ThirdObject thirdObject;
    private final FourthObject fourthObject;
    private final FifthObject fifthObject;
    private final SixthObject sixthObject;
    private final SeventhObject seventhObject;
    private final EighthObject eighthObject;

    public Octet(FirstObject firstObject, SecondObject secondObject, ThirdObject thirdObject, FourthObject fourthObject, FifthObject fifthObject, SixthObject sixthObject, SeventhObject seventhObject, EighthObject eighthObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
        this.fourthObject = fourthObject;
        this.fifthObject = fifthObject;
        this.sixthObject = sixthObject;
        this.seventhObject = seventhObject;
        this.eighthObject = eighthObject;
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

    public SixthObject getSixthObject() {
        return sixthObject;
    }

    public SeventhObject getSeventhObject() {
        return seventhObject;
    }

    public EighthObject getEighthObject() {
        return eighthObject;
    }
}
