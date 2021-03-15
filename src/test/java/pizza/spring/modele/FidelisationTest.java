package pizza.spring.modele;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FidelisationTest {
	
	private Fidelisation fidelisation;
	private String nomClient;
	private long nbCommandes;
	
	@Before
	public void setUp() throws Exception {
		this.nomClient = "Jean";
		this.nbCommandes = (long)1;
		this.fidelisation = new Fidelisation(nomClient,nbCommandes);
	}


	@Test
	public void testGetNomClient() {
		assertEquals(this.nomClient, this.fidelisation.getNomClient());
	}

	@Test
	public void testGetNbCommandes() {
		assertEquals(this.nbCommandes, this.fidelisation.getNbCommandes());
	}

}
