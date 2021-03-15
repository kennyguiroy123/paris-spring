package pizza.spring.modele;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RapportJournalierTest {
	
	private RapportJournalier rapportjournalier;
	private Categorie categorie;
	private long nbPizzas;
	private long montantEncaisse;
	
	@Before
	public void setUp() throws Exception {
		this.categorie = new Categorie();
		this.nbPizzas = (long)5;
		this.montantEncaisse = (long)58;
		this.rapportjournalier = new RapportJournalier(categorie,nbPizzas,montantEncaisse);
	}

	@Test
	public void testGetCategorie() {
		assertEquals(this.categorie, this.rapportjournalier.getCategorie());
	}

	@Test
	public void testGetMontantEncaisse() {
		assertEquals(this.nbPizzas, this.rapportjournalier.getNbPizzas());
	}

	@Test
	public void testGetNbPizzas() {
		assertEquals(this.montantEncaisse, this.rapportjournalier.getMontantEncaisse());
	}

}
