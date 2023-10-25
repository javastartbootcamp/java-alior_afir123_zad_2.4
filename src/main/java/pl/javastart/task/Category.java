package pl.javastart.task;

public class Category {
    String categoryName;

    String categoryDescription;

    Category(String name, String des) {
        categoryName = name;
        categoryDescription = des;
    }

    void printInfo() {
        System.out.println("Nazwa kategorii: " + categoryName + ", Opis kategorii: " + categoryDescription);
    }
}
