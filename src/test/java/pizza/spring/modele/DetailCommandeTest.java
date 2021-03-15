package pizza.spring.modele;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DetailCommandeTest {
	
	private DetailCommande detailCommande;
	private Long id;
	private Commande commande;
	private Pizza pizza;
	
	
	@Before
	public void setUp() throws Exception {
		this.id = (long) 1;
		this.commande = new Commande();
		this.pizza = new Pizza();
		this.detailCommande = new DetailCommande(this.id, this.commande, this.pizza);
	}
	
	
	@Test
	public void testGetId() {
		assertEquals(this.id, this.detailCommande.getId());
	}

	@Test
	public void testGetCommande() {
		assertEquals(this.commande, this.detailCommande.getCommande());
	}

	@Test
	public void testGetPizza() {
		assertEquals(this.pizza, this.detailCommande.getPizza());
	}

}
