package N1EX1;

import java.util.ArrayList;

public class Sale {

    // ATTRIBUTES
    private ArrayList<Product> listProducts;
    private int totalPriceSale;

    // BUILDER METHODS
    public Sale() {
        this.listProducts = new ArrayList<Product>();
        this.totalPriceSale = 0;
    }

    // METHODS
    public int calculateTotal() throws SaleEmptyException {

        if (listProducts.size() == 0) { // CHECKS IF THE ARRAYLIST IS EMPTY
            throw new SaleEmptyException("To make a sale you must first add products"); // THROW THE EXCEPTION
        } else {
            int accumulator = 0;
            for (int i = 0; i < listProducts.size(); i++) {
                accumulator += listProducts.get(i).getPrice();
            }
            totalPriceSale = accumulator;

            return totalPriceSale;
        }
    }

    // GETTERS
    public ArrayList getListProducts() {
        return listProducts;
    }

    public int getTotalPriceSale() {
        return totalPriceSale;
    }

}
