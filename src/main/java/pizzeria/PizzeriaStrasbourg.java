package pizzeria;

import pizza.Pizza;
import pizza.PizzaFactory;

public class PizzeriaStrasbourg extends Pizzeria {

    
    public PizzeriaStrasbourg(PizzaFactory f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        
        return this.factory.create(type);
    }
    
}
