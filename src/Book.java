// Subclase concreta con su lógica particular

public class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateIVA() {
        return 0; // Exento de IVA
    }
}