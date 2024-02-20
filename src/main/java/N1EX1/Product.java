package N1EX1;

public class Product {

    // CLASS ATTRIBUTES
    private String name;
    private int price;

    // CLASS BUILDER METHODS

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // GETTERS

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "The product name is " + name + " and it's price is " + price;
    }

}
