package src;

import src.entities.Cart;
import src.entities.Customer;
import src.entities.Ecommerce;
import src.entities.Item;


public class Exercise3 {
    public static void main(String[] args) {

        Customer myCustomer = new Customer(2212, "Aldo", "Baglio", "aldobaglio@gmail.com", "12/12/2020");
        Item myItem = new Item(121212, "awesome item", 12.50, 2);
        Cart myCart = new Cart(myCustomer, myItem, myItem.getItemPrice());

        Ecommerce myEcommerce = new Ecommerce(myItem, myCustomer, myCart);

        System.out.println(myEcommerce);
    }
}
