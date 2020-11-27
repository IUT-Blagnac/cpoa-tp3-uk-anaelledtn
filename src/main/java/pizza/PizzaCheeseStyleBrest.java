package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaCheeseStyleBrest extends Pizza {
    public PizzaCheeseStyleBrest() {
        super();
        this.nom = "Pizza sauce style brest and cheese";
        this.garnitures.add("Parmigiano reggiano râpé");
        
    }

    @Override
    public void couper() {
        System.out.println("Cut the pizza in triangles");
    }
}
