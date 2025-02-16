package Bai2animal;

public class Animal {
    String id;
    String source;
    String dateOfBirth;
    String color;
    String type;

    public Animal(String id, String source, String dateOfBirth, String color, String type) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
        this.type = type;
    }

    public void makeSound() {
        if (type.equalsIgnoreCase("Dog")) {
            System.out.println("gau gau");
        } else if (type.equalsIgnoreCase("Cat")) {
            System.out.println("meo meo");
        } else {
            System.out.println("Unknown sound...");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + "     Source: " + source + "     Date of Birth: " + dateOfBirth +
                "    Color: " + color + "    Type: " + type);
    }
}


