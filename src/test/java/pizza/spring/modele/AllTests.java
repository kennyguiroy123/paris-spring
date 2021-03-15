package pizza.spring.modele;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CategorieTest.class, CommandeTest.class, DetailCommandeTest.class, FidelisationTest.class,
		IngredientTest.class, PizzaTest.class, RapportJournalierTest.class })
public class AllTests {

}
