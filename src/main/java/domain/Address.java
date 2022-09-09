package domain;

public class Address {
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public Address(String street) {
        this.street = street;
    }
    public Address() {
        System.out.println("----");
        System.out.println("an address created");
        System.out.println("----");
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void print(){
        System.out.println("print method is called " + street);
    }
}
