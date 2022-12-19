package dev.samuelhayden.haydenapi.tuples;

public class Septet<FirstObject, SecondObject, ThirdObject, FourthObject, FifthObject, SixthObject, SeventhObject> {
    private final FirstObject firstObject;
    private final SecondObject secondObject;
    private final ThirdObject thirdObject;
    private final FourthObject fourthObject;
    private final FifthObject fifthObject;
    private final SixthObject sixthObject;
    private final SeventhObject seventhObject;

    public Septet(FirstObject firstObject, SecondObject secondObject, ThirdObject thirdObject, FourthObject fourthObject, FifthObject fifthObject, SixthObject sixthObject, SeventhObject seventhObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
        this.fourthObject = fourthObject;
        this.fifthObject = fifthObject;
        this.sixthObject = sixthObject;
        this.seventhObject = seventhObject;
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
}
