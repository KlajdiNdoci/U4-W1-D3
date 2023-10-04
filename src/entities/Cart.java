package src.entities;

public class Cart {
    private Customer customer;
    private Item items;

    private double itemsPrices;

    public Cart(Customer customer, Item items, double itemsPrices) {
        this.customer = customer;
        this.items = items;
        this.itemsPrices = itemsPrices;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", items=" + items +
                ", itemsPrices=" + itemsPrices +
                '}';
    }
}
