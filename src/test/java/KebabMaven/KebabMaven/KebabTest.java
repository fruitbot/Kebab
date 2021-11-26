package KebabMaven.KebabMaven;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class KebabTest.
 *
 * @author (Shuting ZHANG)
 * @version (1.0.1)
 */
public class KebabTest
{
    /**
     * Default constructor for test class KebabTest
     */
    public KebabTest()
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
    public void testSetMyMenu() {
        Kebab myFavoriteKebab = new Kebab();
        Menu myFavoriteMenu = new Menu();
        assertEquals("Menu: Voici un menu : Soda: Coca, [Kebab: Barbecue, Fries: true] prix : 6 is set.", myFavoriteKebab.setMyMenu(myFavoriteMenu));
    }
    
    @Test
    public void testEquals() {
    	Kebab myKebabKetchup1 = new Kebab("Ketchup",true);
    	Kebab myKebabKetchup2 = new Kebab("Ketchup", true);
    	Kebab myKebabBlanche = new Kebab("Blanche", true);

        assertTrue(!myKebabKetchup1.equals(null));
        assertEquals(myKebabKetchup1, myKebabKetchup2);
        assertTrue(myKebabKetchup1.equals(myKebabKetchup2));
        assertEquals(myKebabKetchup1, new Kebab("Ketchup",true));
        assertTrue(!myKebabKetchup1.equals(myKebabBlanche));
    }
}

