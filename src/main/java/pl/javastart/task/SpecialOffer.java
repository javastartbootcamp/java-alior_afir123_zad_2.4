package pl.javastart.task;

public class SpecialOffer {
    Product productInSpecialOffer;
    String description;
    String dateFrom;
    String dateTo;
    double discount;

    SpecialOffer(Product prod, String desc, String from, String to, double disc) {
        this.productInSpecialOffer = prod;
        this.description = desc;
        this.dateFrom = from;
        this.dateTo = to;
        this.discount = disc;
    }

    void printInfo() {
        System.out.println("Opis oferty: " + description + ", Produkt w ofercie: " + productInSpecialOffer.name
                + ", Oferta obowiązuje od " + dateFrom + " do " + dateTo
                + ", Rabat na produkt wynosi: " + discount * 100 + "%");
    }
}