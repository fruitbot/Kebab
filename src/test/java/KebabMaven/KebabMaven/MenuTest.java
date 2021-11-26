package KebabMaven.KebabMaven;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * class MenuTest
 *
 * @author (Shuting ZHANG)
 * @version (1.0.1)
 */
public class MenuTest
{
	Kebab myKebab1;	
	Kebab myKebab2;
	Menu myMenu1;
	
    /**
     * Default constructor for test class MenuTest
     */
    public MenuTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    	Kebab myKebab1 = new Kebab();	
    	Kebab myKebab2 = new Kebab();
    	Menu myMenu1 = new Menu();
    	
    	myMenu1.addKebab(myKebab1);
    	myMenu1.addKebab(myKebab2);

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testEatFries()
    {
        Menu myFavoriteMenu = new Menu();
        assertEquals(false, myFavoriteMenu.eatFries());
        myFavoriteMenu.eatFries();
    }

    @Test
    public void testPrendreUnMenu()
    {
    	Kebab myKebab1 = new Kebab();	
    	Kebab myKebab2 = new Kebab();
    	Menu myMenu1 = new Menu();
    	myMenu1.addKebab(myKebab1);
    	myMenu1.addKebab(myKebab2);
    	System.out.println("test");
    	//System.out.println(myMenu1.prendreUnMenu());
        assertEquals("Vous prenez ce menu : Soda: Coca, [Kebab: Barbecue, Fries: true] prix : 6", myMenu1.prendreUnMenu());
    }

}

