package entites;

public abstract class Operation {
	protected String date;
	protected double montant;
	
	public Operation(String d, double m) {
		date = d;
		montant = m;		
	}
	public abstract String afficherType();

	@Override
	public String toString() {
		return "Operation [date=" + date + ", montant=" + montant + "]";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	};
	
}
