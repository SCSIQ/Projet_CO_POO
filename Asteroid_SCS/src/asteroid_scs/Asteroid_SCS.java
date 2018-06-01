/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroid_scs;

import iut.Jeu;
import java.awt.Graphics;

import java.awt.Graphics2D;

/**
 *
 * @author aurian
 */
public class Asteroid_SCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Jeu jeuAsteroid = new Asteroid(500, 500, "Asteroid");

        Vaisseau vJoueur = new Vaisseau(jeuAsteroid, "vaisseauJoueur", 0, 0);
        
        Bloc comete = new Bloc(jeuAsteroid, "bloc",0,0);

        
    }
    
}
