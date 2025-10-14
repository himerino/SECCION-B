// Subclase concreta con su lógica particular

public class Clothing extends Product {
    private double weight;

    public Clothing(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double calculateIVA() {
        return getPrice() * 0.12;
    }
}
