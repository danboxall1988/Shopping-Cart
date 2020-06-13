
/**
 * Subclass of Item, one of the items to go into shopping cart
 *
 * @author Dan Boxall
 * @version (a version number or a date)
 */
public class Apparel extends Item
{
    // instance variables - replace the example below with your own
    private String season;
    
    // constructer for Apparel
    public Apparel(String aTitle, String aBrand, String aSeason, double aPrice)
    {
        super(aTitle, aBrand, aPrice);
        this.season = aSeason;
    }
    
    public void setSeason(String aSeason)
    {
        this.season = aSeason;
    }
    
    public String getSeason()
    {
        return this.season;
    }
    
    @Override
    public String toString()
    {
        return String.format("Apparal has title %s, brand %s, season %s and costs %.2f\n",
                    this.getTitle(), this.getBrand(), this.getSeason(), this.getPrice());
    }
}
