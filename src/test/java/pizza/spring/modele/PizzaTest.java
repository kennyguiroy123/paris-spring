package pizza.spring.modele;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PizzaTest {
	
	private Pizza pizza;
	private Long id;
	private String nom;
	private int prix;
	private boolean disponible;
	private Categorie categorie;
	private List<Ingredient> ingredients;
	
	@Before
	public void setUp() throws Exception {
		this.id = (long)1;
		this.nom = "Bob" ;
		this.prix = 12;
		this.disponible = true;
		this.categorie = new Categorie();
		this.ingredients = new ArrayList<>();
		this.pizza  = new Pizza(this.id, this.nom, this.prix, this.disponible, this.categorie, this.ingredients);
	}

	@Test
	public void testGetId() {
		assertEquals(this.id, this.pizza.getId());
	}

	@Test
	public void testGetNom() {
		assertEquals(this.nom, this.pizza.getNom());
	}

	@Test
	public void testGetPrix() {
		assertEquals(this.prix, this.pizza.getPrix());		
	}

	@Test
	public void testIsDisponible() {
		assertEquals(this.disponible, this.pizza.isDisponible());		
	}

	@Test
	public void testGetCategorie() {
		assertEquals(this.categorie, this.pizza.getCategorie());	
	}

	@Test
	public void testGetIngredients() {
		assertEquals(this.ingredients, this.pizza.getIngredients());
	}

}
