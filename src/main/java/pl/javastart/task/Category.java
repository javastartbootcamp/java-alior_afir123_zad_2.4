package pl.javastart.task;

public class Category {
    String name;

    String description;

    Category(String name, String des) {
        this.name = name;
        this.description = des;
    }

    void printInfo() {
        System.out.println("Nazwa kategorii: " + name + ", Opis kategorii: " + description);
    }
}
