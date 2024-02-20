package N1EX1;

// TODO: 1. Create a class named "Product" with the attributes name and price.
// TODO: 2. Create a class named "Sale" with the attributes Collection of products and total price of the sale.
// TODO: 3. Create a method in the "Sale" class called "CalculateTotal".
// The method "CalculateTotal" has to throw the personalized exception "SaleEmptyException" if the list of products is empty.
// If not it has to save the total price of the products in the attribute total price of the sale.
// The "SaleEmptyException" must be a sub-class of the Exception class and it's constructor has to receive the message
// "To make a sale you must first add products" that will be printed using the method "getMessage" in the moment the
// exception is captured.
// TODO: 4. Write the necessary code to generate and capture an "ArrayIndexOutOfBondsException".

public class Main {

    public static void main(String[] args) {

        App.runProgram();

    }

}
