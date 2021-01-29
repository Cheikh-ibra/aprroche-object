package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void principal(String[] args) {
		
		AdressePostale a = new AdressePostale(15,  "dans les bois" , 22000,  "Trefouin" );
		
		Personne p1 = new Personne();
		Personne p2 = new Personne("Maître" ,  "Lee" ,a);
		
		
	}

}