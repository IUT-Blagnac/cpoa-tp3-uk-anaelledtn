package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaFromageStyleStrasbourg extends Pizza {
    public PizzaFromageStyleStrasbourg() {
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
