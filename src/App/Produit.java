package App;

public class Produit implements I_Produit {


	private int quantiteStock;
	
	private String nom;
	
	private double prixUnitaireHT;
	
	private double tauxTVA = 0.2;

	private double prixUnitaireTTC;
	
	private double prixStockTTC;
	
	public Produit(String nom, double prixHT, int quantite) {
		this.nom = nom;
		prixUnitaireHT = prixHT;
		quantiteStock = quantite;
	}

	@Override
	public boolean ajouter(int qteAchetee) {
		quantiteStock = quantiteStock + qteAchetee;
		return false;
	}

	@Override
	public boolean enlever(int qteVendue) {
		quantiteStock = quantiteStock - qteVendue;
		return false;
	}

	@Override
	public double getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	@Override
	public double getPrixUnitaireTTC() {
		prixUnitaireTTC = prixUnitaireHT * (1+tauxTVA);
		return prixUnitaireTTC;
	}

	@Override
	public double getPrixStockTTC() {
		prixStockTTC = getPrixUnitaireTTC() * quantiteStock;
		return prixStockTTC;
	}
	
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public int getQuantite() {
		return quantiteStock;
	}

	
}
