package KebabMaven.KebabMaven;
/**
 * class Kebab
 *
 * @author (Shuting ZHANG)
 * @version (1.0.1)
 */
public class Kebab
{
    private String sauce;
	private Menu myMenu;
	private Integer price;

    /**
     * Constructor for objects of class Kebab
     */
    public Kebab()
    {
        this.sauce = "Barbecue";
        this.myMenu = null;
        this.price = 5;
    }
    
    public Kebab(String sauce, Boolean isWithFries)
    {
        this.sauce = sauce;
        this.myMenu = null;
        this.price = 5;
    }

    public String getSauce(){
        return sauce;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setSauce(String newSauce){
        this.sauce = newSauce;
    }
    
    public String setMyMenu(Menu myMenu) {
    	this.myMenu = myMenu;
    	myMenu.addKebab(this);
    	return "Menu: "+myMenu+" is set.";
    }
    
    public Menu getMyMenu(){
        return myMenu;
    }
    
    public String toString(){
        return "Kebab: "+sauce;
    }
   
	
	@Override
	public boolean equals(Object anObject) {
	    if (!(anObject instanceof Kebab))
	        return false;
	    Kebab aKebab= (Kebab)anObject;
	    return aKebab.getSauce().equals(getSauce());
	}

}