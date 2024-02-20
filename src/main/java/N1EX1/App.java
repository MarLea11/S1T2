package N1EX1;

public class App {

    private App(){}

    public static void runProgram() {

        // 2. SALE CREATION
        Sale sale = new Sale();

        // 3. TRY CATCH SALE EMPTY EXCEPTION IF NOT PRODUCTS ARE ADDED
        try {
            sale.calculateTotal();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 3. NOW ADDING PRODUCTS TO THE LIST
        sale.getListProducts().add(new Product ("Cellphone", 800));
        sale.getListProducts().add(new Product ("Shoes", 200));

        // 3. TRYING AGAIN CALLING THE METHOD CALCULATE TOTAL
        try {
            sale.calculateTotal();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 4. CODE TO CATCH INDEXOUTOFBONDSEXCEPTION
        try {
            if (sale.getListProducts().get(1) instanceof Product) {
                Product seeProduct = (Product)sale.getListProducts().get(2);
                System.out.println(seeProduct.getName());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

        // PRINT TOTAL PRICE SALE
        System.out.println("Total price sale: " + sale.getTotalPriceSale());

    }

}

