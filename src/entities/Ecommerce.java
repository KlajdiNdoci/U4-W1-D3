package src.entities;

public class Ecommerce {
    private Item item;
    private Customer customer;
    private Cart cart;

    public Ecommerce(Item item, Customer customer, Cart cart) {
        this.item = item;
        this.customer = customer;
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Ecommerce{" +
                "item=" + item +
                ", customer=" + customer +
                ", cart=" + cart +
                '}';
    }
}
