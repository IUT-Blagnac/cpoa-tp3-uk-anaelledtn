package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaFromage extends Pizza {
    public PizzaFromage() {
        super();
        this.nom = "Cheese pizza";
		this.garnitures.add("Mozzarella");
    }
}
