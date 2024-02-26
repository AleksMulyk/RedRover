package main.lessons.classes7;

public class Apartments {
    private int bedrooms;
    private double price;
    Address address;
    public Apartments() {

    }

    public Apartments(int bedrooms, Address address, double price) {
        this.bedrooms = bedrooms;
        this.address = address;
        this.price = price;
    }

    public String getCity() {
        return address.city;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo() {
        address.printInfo();
        System.out.println("bedrooms " + bedrooms);
        System.out.println("price " + price);
    }

    public static void main(String[] args) {
        Apartments apt1 = new Apartments(4, new Address("", "", "Chicago", "IL", "60616"), 2700);
        Apartments apt2 = new Apartments(4, new Address("", "", "San Francisco", "IL", "60616"), 2700);
        Apartments apt3 = new Apartments(4, new Address("", "", "Boston", "IL", "60616"), 2700);
        Apartments apt4 = new Apartments(4, new Address("", "", "San Francisco", "IL", "60616"), 2700);
        Apartments apt5 = new Apartments(4, new Address("", "", "Washington", "IL", "60616"), 2700);
        Apartments apt6 = new Apartments(4, new Address("", "", "Chicago", "IL", "60616"), 2700);
        Apartments[] apts = {apt1, apt2, apt3, apt4, apt5, apt6};
        for (Apartments apt : apts) {
            if (apt.getCity().equals("San Francisco")) {
                apt.printInfo();
                System.out.println("--------------");
            }
        }
    }

}
