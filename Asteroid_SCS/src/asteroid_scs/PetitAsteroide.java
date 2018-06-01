package asteroid_scs;


import asteroid_scs.Asteroid;
import iut.Jeu;
import iut.Objet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexiane
 */
public class PetitAsteroide extends Bloc {
    
    public PetitAsteroide(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void effetCollision(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTypeObjet() {
       return "PetitAsteroide";
    }
    
 
    
}
