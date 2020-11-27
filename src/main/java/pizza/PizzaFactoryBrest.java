package pizza;

public class PizzaFactoryBrest extends PizzaFactory {

	public Pizza creerPizza(String type) {

		switch (type) {
			case "fromage":
				return new PizzaFromageStyleBrest();

			default:
				return super.create(type);
		}
	}
}
