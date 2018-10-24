package org.tp.cycle.CycleDeVie.gameEngine;

import java.util.Random;

public class RandomNumberImpl implements IRandomNumber {

	public int randomNumber() {
		Random rand = new Random();
		return rand.nextInt(100) + 1;
	}

}
