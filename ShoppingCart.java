import java.util.*;
/**
 * Class for collecting items
 *
 * @author Dan Boxall
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private List<Item> shoppingCart;

    /**
     * Constructor for objects of class ShoppingCart
     */
    public ShoppingCart()
    {
        this.shoppingCart = new ArrayList<Item>();
    }
    
    public void addItem(Item item)
    {
        this.shoppingCart.add(item);
    }
    
    @Override
    public String toString()
    {
        return this.shoppingCart.toString();
    }
       
    public static void main(String args)
    {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem(new Food("bacon", "walls", "meat", 2.0));
        sc.addItem(new Beverage("beer", "stella", true, 5.0));
        System.out.println(sc);
    }
}
