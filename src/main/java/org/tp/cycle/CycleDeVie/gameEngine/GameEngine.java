package org.tp.cycle.CycleDeVie.gameEngine;

import java.util.Random;
import java.util.Scanner;
import org.tp.cycle.CycleDeVie.Utilisateur.Utilisateur;

public class GameEngine {

	private int randomNumb;
	private IRandomNumber service;
	
	public GameEngine(IRandomNumber service) {
		this.randomNumb = service.randomNumber();
		this.service = service;
	}
	
	public String isGood(int numberUtil) {
		if(this.randomNumb == numberUtil) {
			return "C'est bon";
		}else if(this.randomNumb > numberUtil) {
			return "C'est plus";
		}else {
			return "C'est moins";
		}
	}
	
	public void go() {
		Utilisateur u= new Utilisateur();
		Scanner sc = new Scanner(System.in);
		int nb =sc.nextInt();
		int nbDeCoups =1;
		sc.nextLine();
		System.out.println(this.isGood(nb));
		while (!this.isGood(nb).equalsIgnoreCase("C'est bon")) {
			nb =sc.nextInt();
			nbDeCoups++;
			System.out.println(this.isGood(nb));
		}	
		u.recordNbCoup(nbDeCoups);
		sc.nextLine();
		System.out.println("Try again ? (o/any) ");
		String ouiNon = sc.nextLine();

		if (retry(ouiNon)) {
			System.out.println("Nouvelle Partie - Score a battre : "+ u.getNbessai());
			this.randNew();
			this.go();
		}
		
	}
	
	public boolean retry(String ouiNon) {
		if(ouiNon.equalsIgnoreCase("o")) {
			return true;
		}else {
			return false;
		}
	}

	public void randNew() {
		this.service.randomNumber();
	}

	
}
