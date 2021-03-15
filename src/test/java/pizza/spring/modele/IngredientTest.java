package pizza.spring.modele;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IngredientTest {
	
	private Ingredient ingredient;
	private Long id;
	private String nom;
	
	
	@Before
	public void setUp() throws Exception {
		this.id = (long)1;
		this.nom = "Charles";
		this.ingredient = new Ingredient(this.id, this.nom);
	}
	
	@Test
	public void testGetId() {
		assertEquals(this.id, this.ingredient.getId());
	}

	@Test
	public void testGetNom() {
		assertEquals(this.nom, this.ingredient.getNom());
	}


}
