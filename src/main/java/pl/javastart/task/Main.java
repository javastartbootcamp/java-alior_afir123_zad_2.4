package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Słodycze", "Coś dobrego na poprawę humoru");
        category1.printInfo();

        Category category2 = new Category("Mrożonki", "Przechowywać w zamrażarce");
        category2.printInfo();

        Product product1 = new Product("Czekolada", 3.11, "Czekolada gorzka z orzechami");
        product1.category = category1;
        product1.printInfo();

        Product product2 = new Product("Ciastka", 5.30, "Kruche jak ta lala");
        product2.category = category1;
        product2.printInfo();

        Product product3 = new Product("Ryba mintaj", 15.40, "Smaczna i prosta w przygotowaniu");
        product3.category = category2;
        product3.printInfo();

        Product product4 = new Product("Pomarańcza", 5.34, "Soczysta i słodka");
        product4.printInfo();

        SpecialOffer specialOffer1 = new SpecialOffer(product2, "Oferta październikowa", "2023-10-01", "2023-10-31", 0.20);
        specialOffer1.printInfo();
    }
}