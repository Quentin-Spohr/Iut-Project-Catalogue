package App;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalogue implements I_Catalogue{
	
	private List<I_Produit> produits;

	public Catalogue() {
		this.produits= new ArrayList<>();
	}

	@Override
	public boolean addProduit(I_Produit produit) {
		produits.add(produit);
		return true;
	}

	@Override
	public boolean addProduit(String nom, double prix, int qte) {
		produits.add(new Produit(nom,prix,qte));
		return true;
	}

	@Override
	public int addProduits(List<I_Produit> l) {
		int compteur=0;
		for (I_Produit produit : l) {
			if(addProduit(produit)) {
				compteur++;
			}
		}
		return compteur;
	}

	@Override
	public boolean removeProduit(String nom) {
		boolean produitEnleve=false;
		for (I_Produit produit : produits) {
			if (produit.getNom().equals(nom)) {
				produits.remove(produit);
				produitEnleve=true;
			}
		}
		return produitEnleve;
	}

	@Override
	public boolean acheterStock(String nomProduit, int qteAchetee) {
		boolean stockAchete=false;
		for (I_Produit produit : produits) {
			if (produit.getNom().equals(nomProduit)) {
				produit.ajouter(qteAchetee);
				stockAchete=true;
			}
		}
		return stockAchete;
	}

	@Override
	public boolean vendreStock(String nomProduit, int qteVendue) {
		boolean stockVendu=false;
		for (I_Produit produit : produits) {
			if (produit.getNom().equals(nomProduit)) {
				produit.enlever(qteVendue);
				stockVendu=true;
			}
		}
		return stockVendu;
	}

	@Override
	public String[] getNomProduits() {
		
		if (produits.size()!=0) {
			String[] nomsProduits =new String[produits.size()];
			for (int i = 0; i < nomsProduits.length; i++) {
				nomsProduits[i]=produits.get(i).getNom();
			}
			return nomsProduits;
		}
		else return null;
	}

	@Override
	public double getMontantTotalTTC() {
		double montantTotalTTC=0;
		for (I_Produit produit : produits) {
			montantTotalTTC=montantTotalTTC+produit.getPrixStockTTC();
		}
		
		return montantTotalTTC;
	}

	@Override
	public void clear() {
		produits.clear();	
	}
	
}
