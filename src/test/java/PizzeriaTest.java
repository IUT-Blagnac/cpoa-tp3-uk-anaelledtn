import static org.junit.Assert.*;

import org.junit.Test;

import pizza.Pizza;
import pizza.PizzaFactoryBrest;
import pizza.PizzaFactoryStrasbourg;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaBrest;
import pizzeria.PizzeriaStrasbourg;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = new PizzeriaBrest(new PizzaFactoryBrest());
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = new PizzeriaBrest(new PizzaFactoryBrest());
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg(new PizzaFactoryStrasbourg());
        Pizza miam1 = boutiqueBrest.commanderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("Greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
}