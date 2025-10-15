// Subclase concreta con su lógica particular

public class Book extends PhysicalProduct {
    public Book(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public double calculateIVA() {
        return 0; // Exento de IVA
    }
}