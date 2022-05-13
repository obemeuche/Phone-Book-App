package obemescode.com;

import java.util.HashMap;

// Using Inheritance
public class Contacts extends Main {
    private String name;
    private String phoneNumber;

    public Contacts() {

    }

    // Creating a HashMap for storing the name and phoneNumber of a person
    HashMap<String, String> phoneBook = new HashMap<>();

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
