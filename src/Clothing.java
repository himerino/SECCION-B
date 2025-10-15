// Subclase concreta con su lógica particular

public class Clothing extends PhysicalProduct {

    public Clothing(String name, double price, double weight) {
        super(name, price, weight);
    }


    @Override
    public double calculateIVA() {
        return getPrice() * 0.12;
    }
}
