
/**
 * Subclass of Item, one of the types of items that go into shopping cart
 *
 * @author Dan Boxall
 * @version 
 */
public class Beverage extends Item
{
    // instance variables 
    private boolean isAlcoholic;

    /**
     * Constructor for objects of class Beverage
     */
    public Beverage(String aTitle, String aBrand, boolean isAlcoholic, double aPrice)
    {
        super(aTitle, aBrand, aPrice);
        this.isAlcoholic = isAlcoholic;
    }
    
    public boolean checkIfAlcoholic()
    {
        return this.isAlcoholic;
    }
    
    public void setAlcoholic(boolean alcoholic)
    {
        this.isAlcoholic = alcoholic;
    }
    
    @Override
    public String toString()
    {
        
        return String.format("Beverage has title %s, brand %s, alcoholic is %b and costs %.2f\n",
                    this.getTitle(), this.getBrand(), this.checkIfAlcoholic(), this.getPrice());
    }
}
