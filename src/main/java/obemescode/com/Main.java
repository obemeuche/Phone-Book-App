package obemescode.com;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static Contacts contact = new Contacts();

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        contact.enterMenu();

    }

    void enterMenu () {

        int option = 0;
        System.out.println("1. Save a contact");
        System.out.println("2. Search a contact");
        System.out.println("3. Exit");

        do {
            System.out.println("Enter an option");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Name:");
                    String name = scanner.nextLine();
                    contact.setName(name);
                    System.out.println("Phone Number:");
                    String phoneNumber = scanner.nextLine();
                    contact.setPhoneNumber(phoneNumber);
                    contact.phoneBook.put(name, phoneNumber);
                    System.out.println("Contact added successfully!");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter name:");
                    String search = scanner.nextLine();
                    for (String i : contact.phoneBook.keySet()) {
                        if (Objects.equals(i, search)) {
                            System.out.println("Name and Number exists!");
                            System.out.println(i + ":" + " " + contact.phoneBook.get(i));
                        }
                        else {
                            System.out.println("Contact doesn't exists!");
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }while(option != 3);
        System.out.println("Thank You!");

    }
}
