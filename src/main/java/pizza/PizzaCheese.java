package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaCheese extends Pizza {
    public PizzaCheese() {
        super();
        this.nom = "Cheese pizza";
		this.garnitures.add("Mozzarella");
    }
}
