package domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Student {
    private String name;
    private String lastName;
    private Address homeAddress;
    private Address schoolAddress;
    private List<String> friends;

    public Student(Address homeAddress, List<String> friends) {
        this.homeAddress = homeAddress;
        this.friends = friends;
    }
    public Student() {
        System.out.println("an student created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name + " " + lastName);
        System.out.println("Home Address is : " + homeAddress);
        System.out.println("School Address is : " + schoolAddress);
        System.out.println("friends: " + friends);
        homeAddress.print();
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(Address schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
}
