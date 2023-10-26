package pl.javastart.task;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.description = desc;
    }

    void printInfo() {
        if (category == null) {
            System.out.println("Nazwa produktu: " + name + ", Opis produktu: " + description +
                    ", Cena produktu: " + price + ", Kategoria: BRAK");
        } else {
            System.out.println("Nazwa produktu: " + name + ", Opis produktu: " + description +
                    ", Cena produktu: " + price + ", Kategoria produktu: " + category.name);
        }
    }
}
