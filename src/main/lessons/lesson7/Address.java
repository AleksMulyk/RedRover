package main.lessons.lesson7;

public class Address {
    String line1;
    String line2;
    String city;
    String state;
    String zip;

    public Address(String line1, String line2, String city, String state, String zip) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void printInfo() {
        System.out.println("city " + city);
        System.out.println("state " + state);
    }
}
