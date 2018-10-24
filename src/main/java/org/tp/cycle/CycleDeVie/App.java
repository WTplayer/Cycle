package org.tp.cycle.CycleDeVie;

import org.tp.cycle.CycleDeVie.gameEngine.GameEngine;
import org.tp.cycle.CycleDeVie.gameEngine.IRandomNumber;
import org.tp.cycle.CycleDeVie.gameEngine.RandomNumberImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Nouvelle partie : ");
        IRandomNumber service = new RandomNumberImpl();
        GameEngine game = new GameEngine(service);
        game.go();
    }
}
