package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaCheeseStyleStrasbourg extends Pizza {
    public PizzaCheeseStyleStrasbourg() {
        super();
        this.nom = "Preparation of Pizza Strasbourg style with cheese";
        this.garnitures.add("Mozzarella");
        
    }
    
    @Override
    public String getNom() {
		return "Pizza Strasbourg style with cheese";
    }

    @Override
    public void couper() {
        System.out.println("Cut in square portions");
    }
}
