import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import KebabMaven.KebabMaven.Kebab;
import KebabMaven.KebabMaven.Menu;


public class US001_AjouterKebab {
	public static void main(String args[]) {
		
		@Given("la création d un menu <myMenu> avec attribut <drink>, <withFries>, <kebabs> and <price>, les création des kebabs <myKebab1>, <myKebab2>, <myKebab3>")
		public void step() {
			Kebab myKebab1 = new Kebab();	
			Kebab myKebab2 = new Kebab("Ketchup", true);	
			Kebab myKebab3 = new Kebab("Blanche", true);	
			ArrayList<Kebab> kebabs = new ArrayList<Kebab>();
			kebabs.add(myKebab1);
			kebabs.add(myKebab2);
			kebabs.add(myKebab3);
			Menu myMenu = new Menu("Sprite", true, kebabs, 56);
		}
		@when("l utilisateur valide")
		public void step() {
			// user nods his head
		}
		@then("les kebabs sont ajoutés dans le menu")
		public void step() {
			assertEquals("Vous prenez ce menu : Soda: Sprite, [Kebab: Barbecue, Fries: true Kebab: Ketchup, Fries: true Kebab: Blanche, Fries: true] prix : 56", myMenu1.prendreUnMenu());
		}
	}
}