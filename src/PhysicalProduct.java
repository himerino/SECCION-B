// Subclase base para productos físicos que tienen peso

public abstract class PhysicalProduct extends Product implements Weighable {
    private double weight;

    public PhysicalProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

}
