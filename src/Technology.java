// Subclase concreta con su lógica particular

public class Technology extends Product {
    public Technology(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateIVA() {
        return getPrice() * 0.15;
    }
}