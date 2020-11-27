package pizzeria;

import pizza.Pizza;
import pizza.PizzaFactory;

public class PizzeriaBrest extends Pizzeria {

    public PizzeriaBrest(PizzaFactory f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        return this.factory.create(type);
    }
    
}
