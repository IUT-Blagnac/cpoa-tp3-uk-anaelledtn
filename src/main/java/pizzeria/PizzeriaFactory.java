package pizzeria;

import pizza.PizzaFactoryBrest;
import pizza.PizzaFactoryStrasbourg;

public class PizzeriaFactory {
    private static PizzeriaFactory fabriquePizzeria = new PizzeriaFactory();

    private PizzeriaFactory() {
    }

    public static PizzeriaFactory getInstance() {
        return fabriquePizzeria;
    }

    public Pizzeria creer(String ville) {
        Pizzeria pizzeria;
        switch (ville) {
            case "Brest":
                pizzeria = new PizzeriaBrest(new PizzaFactoryBrest());
                break;

            case "Strasbourg":
                pizzeria = new PizzeriaStrasbourg(new PizzaFactoryStrasbourg());
                break;

            default:
                pizzeria = null;

        }
        return pizzeria;
    }
}
