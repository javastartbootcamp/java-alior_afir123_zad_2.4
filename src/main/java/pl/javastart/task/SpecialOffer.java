package pl.javastart.task;

public class SpecialOffer {
    Product productInSpecialOffer;
    String offerDescription;
    String offerDateFrom;
    String offerDateTo;
    double discount;

    SpecialOffer(Product prod, String desc, String from, String to, double disc) {
        productInSpecialOffer = prod;
        offerDescription = desc;
        offerDateFrom = from;
        offerDateTo = to;
        discount = disc;
    }

    void printInfo() {
        System.out.println("Opis oferty: " + offerDescription + ", Produkt w ofercie: " + productInSpecialOffer.productName
                + ", Oferta obowiązuje od " + offerDateFrom + " do " + offerDateTo
                + ", Rabat na produkt wynosi: " + discount * 100 + "%");
    }
}