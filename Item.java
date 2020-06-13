
/**
 * Superclass for items available
 *
 * @author Dan Boxall
 * @version 11/06/2020
 */
public class Item
{
    // instance variables common to all types of item
    private String title;
    private String brand;
    private double price;
    
    public Item(String aTitle, String aBrand, double aPrice)
    {
        this.title = aTitle;
        this.brand = aBrand; 
        this.price = aPrice;
    }
    
    // methods common to all types of item
    public void setTitle(String aTitle)
    {
        this.title = aTitle;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setBrand(String aBrand)
    {
        this.brand = aBrand;
    }
    
    public String getBrand()
    {
        return this.brand;
    }
    
    public void setPrice(double aPrice)
    {
        this.price = aPrice;
    }
    
    public double getPrice()
    {
        return this.price;
    }
}
