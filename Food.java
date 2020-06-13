
/**
 * Subclass of item, one of the items available to be put in shpping cart
 *
 * @author Dan Boxall
 * @version 
 */
public class Food extends Item
{
    // instance variables - replace the example below with your own
    private String type;
    
    // Constructer for food class
    public Food(String aTitle, String aBrand, String aType, double aPrice)
    {
        super(aTitle, aBrand, aPrice);
        this.type = aType;
    }
    
    public void setType(String aType)
    {
        this.type = aType;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    @Override
    public String toString()
    {
        return String.format("Food has title %s, brand %s, type %s and costs %.2f\n",
                    this.getTitle(), this.getBrand(), this.getType(), this.getPrice());
    }
}
