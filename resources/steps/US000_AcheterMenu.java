import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import KebabMaven.KebabMaven.Kebab;
import KebabMaven.KebabMaven.Menu;


public class US000_AcheterMenu {
	public static void main(String args[]) {
		
		@Given("la création d un menu myMenu avec attribut <drink>, <withFries>, <kebabs> and <price>")
		public void step() {
			// attributs : String drink, Boolean isWithFries, ArrayList<Kebab> kebabs, int price
			Kebab myKebab1 = new Kebab();	
			ArrayList<Kebab> kebabs = new ArrayList<Kebab>();
			kebabs.add(myKebab1);
			Menu myMenu = new Menu("Pepsi", true, kebabs, 23);
		}
		@when("l utilisateur valide")
		public void step() {
			// user nods his head
		}
		@then("le contenu d un kebab est affiché")
		public void step() {
			assertEquals("Vous prenez ce menu : Soda: Pepsi, [Kebab: Barbecue, Fries: true] prix : 23", myMenu1.prendreUnMenu());
		}
	}
}