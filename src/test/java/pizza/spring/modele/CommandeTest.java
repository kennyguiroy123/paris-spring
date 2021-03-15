package pizza.spring.modele;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CommandeTest {
	
	private Commande commande;
	private Pizza pizza;
	private Long id;
	private String nom;
	private String telephone;
	private Date dateEmission;
	private boolean enAttente;
	private List<DetailCommande> details = new ArrayList<>();
	
	@Before
	public void setUp() throws Exception {
		this.id = (long) 1;
		this.nom = "Jean";
		this.telephone = "09328136132";
		this.dateEmission = new Date();
		this.enAttente = true;
		this.details = new ArrayList<>();
		this.commande = new Commande(this.id, this.nom, this.telephone, this.dateEmission, this.enAttente,
				this.details);
	}

	@Test
	public void testGetId() {
		assertEquals(this.id, this.commande.getId());
	}

	@Test
	public void testGetNom() {
		assertEquals(this.nom, this.commande.getNom());
	}

	@Test
	public void testGetTelephone() {
		assertEquals(this.telephone, this.commande.getTelephone());
	}

	@Test
	public void testGetDateEmission() {
		assertEquals(this.dateEmission, this.commande.getDateEmission());
	}

	@Test
	public void testIsEnAttente() {
		assertEquals(this.enAttente, this.commande.isEnAttente());
	}

	@Test
	public void testGetDetails() {
		assertEquals(this.details, this.commande.getDetails());
	}

	@Test
	public void testAjouter() {
		DetailCommande detailCommande = new DetailCommande();
		detailCommande.setPizza(pizza);
		detailCommande.setCommande(commande);
		this.details.add(detailCommande);
		assertEquals(this.details, this.commande.getDetails());
	}

}
