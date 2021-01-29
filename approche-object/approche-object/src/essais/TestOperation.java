package essais;

import entites.Credit;
import entites.Debit;
import entites.Operation;

public class TestOperation {
	
	public static void main(String[]args) {
		
		Operation[] tabOperation = new Operation[4];
		
		tabOperation[0] = new Credit("12/12/2020", 255);
		tabOperation[1] = new Credit("31/12/2020", 150);
		
		tabOperation[2] = new Debit("25/12/2020", 55);
		tabOperation[3] = new Debit("15/01/2021", 220);
		double somme = 0.0;
		for (int i=0; i<tabOperation.length; i++) {

			System.out.println(tabOperation[i].getDate()+" "+tabOperation[i].getMontant()+" "+tabOperation[i].afficherType());
		
			if (tabOperation[i].afficherType().equals("debit")) {
				somme -= tabOperation[i].getMontant();
			}
			else {
				somme += tabOperation[i].getMontant();
			}
		}
		System.out.println(somme);
	}
}
