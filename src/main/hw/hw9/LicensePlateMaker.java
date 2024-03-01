package main.hw.hw9;

public class LicensePlateMaker {
    private String prefix;
    private int lastUsedNumber;

    public LicensePlateMaker(String prefix, int lastUsedNumber) {
        this.prefix = prefix;
        this.lastUsedNumber = lastUsedNumber;
    }

    public LicensePlate makeNextPlate() {
        lastUsedNumber++;
        return new LicensePlate (prefix + " " + lastUsedNumber);
    }
}
