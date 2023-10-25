package pl.javastart.task;

public class Product {
    String productName;
    double productPrice;
    String productDescription;
    Category productCategory;

    Product(String name, double price, String desc) {
        productName = name;
        productPrice = price;
        productDescription = desc;
    }

    void printInfo() {
        if (productCategory == null) {
            System.out.println("Nazwa produktu: " + productName + ", Opis produktu: " + productDescription +
                    ", Cena produktu: " + productPrice + ", Kategoria: BRAK");
        } else {
            System.out.println("Nazwa produktu: " + productName + ", Opis produktu: " + productDescription +
                    ", Cena produktu: " + productPrice + ", Kategoria produktu: " + productCategory.categoryName);
        }
    }
}
