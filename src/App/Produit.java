package App;

public class Produit implements I_Produit {

	/*
	private integer quantiteStock
	
	private void nom:string
	
	private void prixUnitaireHT:real
	
	private void tauxTVA:real=0.2
	*/
	
	public Produit(String nom, double prixHT, int quantite) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ajouter(int qteAchetee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enlever(int qteVendue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getQuantite() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrixUnitaireHT() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrixUnitaireTTC() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrixStockTTC() {
		// TODO Auto-generated method stub
		return 0;
	}

}
