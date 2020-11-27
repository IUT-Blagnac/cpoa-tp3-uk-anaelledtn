package pizzeria;

import pizza.Pizza;
import pizza.PizzaFactory;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {

	PizzaFactory factory;

	public Pizzeria(PizzaFactory f){
		this.factory = f;
	}

	public final Pizza commanderPizza(String type) {

		Pizza pizza;

		pizza = factory.create(type);

		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
	}

	protected abstract Pizza creerPizza(String type);
}