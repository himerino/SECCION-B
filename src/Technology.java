// Subclase concreta con su lógica particular

public class Technology extends PhysicalProduct {
    public Technology(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public double calculateIVA() {
        return getPrice() * 0.15;
    }
}