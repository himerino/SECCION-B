// Subclase concreta con su lógica particular

public class DigitalProduct extends Product {
    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateIVA() {
        return getPrice() * 0.10; // Por ejemplo
    }
}
