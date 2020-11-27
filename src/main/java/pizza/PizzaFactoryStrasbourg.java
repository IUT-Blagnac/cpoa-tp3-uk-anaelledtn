package pizza;

public class PizzaFactoryStrasbourg extends PizzaFactory {

    
	public Pizza create(String type) {

		switch (type) {
			case "fromage":
				return new PizzaCheeseStyleStrasbourg();

			default:
				return super.create(type);
		}
	}
}
