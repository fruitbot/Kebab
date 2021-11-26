package KebabMaven.KebabMaven;
import java.util.ArrayList;
/**
 * class Menu
 *
 * @author (Shuting ZHANG)
 * @version (1.0.1)
 */
public class Menu
{
    private String drink;
    private Boolean isWithFries;
    public ArrayList<Kebab> kebabs;
    private Integer price;

    public Menu()
    {
        this.drink = "Coca";
        this.kebabs = new ArrayList<Kebab>();
        this.isWithFries = true;
        this.price = 1;
    }

    public Boolean getIsWithFries(){
        return isWithFries;
    }
    
    public Boolean eatFries(){
        eatFriesBis();
        return isWithFries;
    }
    
	public void eatFriesBis() {
        this.isWithFries = false;
	}
    
    public String addKebab(Kebab kebab) {
    	if (!this.kebabs.contains(kebab)) {
    		this.kebabs.add(kebab);
        	kebab.setMyMenu(this);
        	this.price += kebab.getPrice();
    	}
    	return "Kebab "+kebab+" is added.";
    }
    
    public String toString()
    {
        return "Voici un menu : Soda: "+drink+", "+kebabs.toString()+ " withFries : " +isWithFries.toString()+ " prix : " +price.toString(); 
    }
    
    
    public String prendreUnMenu()
    {
        return "Vous prenez ce menu : Soda: "+drink+", "+kebabs.toString()+ " withFries : " +isWithFries.toString()+" prix : " +price.toString(); 
    }
}
