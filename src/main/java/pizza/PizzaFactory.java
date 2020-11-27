package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class PizzaFactory {


	public Pizza create(String type) {

		switch (type) {
			case "fromage":
				return new PizzaFromage();
			case "grecque":
				return new PizzaGrecque();
			case "poivrons":
				return new PizzaPoivrons();
			default:
				return new PizzaFromage();
		}
	}
}