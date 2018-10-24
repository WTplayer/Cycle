package org.tp.cycle.CycleDeVie.Utilisateur;

public class Utilisateur {

	private String prenom;
	private int nbessai;
	
	public Utilisateur() {
		this.prenom="Terence";
		this.nbessai=1000;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNbessai() {
		return nbessai;
	}
	public void setNbessai(int nbessai) {
		this.nbessai = nbessai;
	}
	public void recordNbCoup(int nb) {
		if(nb >= this.nbessai) {
			System.out.println("Meilleur Score : "+ this.nbessai);
		}else if (nb < this.nbessai) {
			System.out.println("Nouveau Meilleur Score : "+ nb);
			this.nbessai = nb;
		}
	}
	
	
	
}
