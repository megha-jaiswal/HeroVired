import java.util.Stack;

class CartItem {
    private String itemName;
    private int quantity;

    public CartItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return itemName + " (Quantity: " + quantity + ")";
    }
}


class Cart {
    private Stack<CartItem> items;
    public Cart() {
        items = new Stack<>();
    }
    public void addItem(String itemName, int qty){
        CartItem newItem = new CartItem(itemName, qty);
        items.push(newItem);
        for (CartItem i : items){
            System.out.println("Item added to Carts " + "- " + items);
        }
    }

}

public class CartMenu{
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem("Apple", 5 );
        cart.addItem("Banana", 10 );


    }
}

