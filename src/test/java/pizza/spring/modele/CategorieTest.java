package pizza.spring.modele;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CategorieTest {
	
	private Categorie categorie;
	private Long id;
	private String nom;
	
	@Before
	public void setUp() throws Exception {
		this.id = (long) 1;
		this.nom = "base tomate";
		this.categorie = new Categorie(this.id,this.nom);
	}

	@Test
	public void testGetId() {
		assertEquals(this.id, this.categorie.getId());
	}

	@Test
	public void testGetNom() {
		assertEquals(this.nom, this.categorie.getNom());
	}

}
