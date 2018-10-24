package org.tp.cycle.CycleDeVie;

import org.tp.cycle.CycleDeVie.gameEngine.GameEngine;
import org.tp.cycle.CycleDeVie.gameEngine.IRandomNumber;
import org.tp.cycle.CycleDeVie.gameEngine.RandomNumberStub;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	IRandomNumber bouchon = new RandomNumberStub();
    	GameEngine game = new GameEngine(bouchon);
    	
        assertEquals( game.isGood(1),"C'est bon" );
        assertEquals( game.isGood(2),"C'est moins" );
        assertEquals( game.isGood(0),"C'est plus" );
        //assertEquals( game.isGood(0),"C'est moins" ); -> error
        assertTrue( game.retry("o"));
        assertTrue(!game.retry("n"));
        //assertTrue(!game.retry("o")); -> error
        /* Sinon passer par une interface passant par 2 implémentation : mettre dans le constructuer du test une
         * implémentation via un classe, pour le test un classe avec un nb fixe
         *  */
    }
}
