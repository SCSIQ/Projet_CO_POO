/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroid_scs;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;

/**
 *
<<<<<<< HEAD
 * @author eg816621
 */
public class Tir extends ObjetTouchable {
=======
 * @author lb078916
 */
public class Tir extends ObjetTouchable{
    private double angle ; 
>>>>>>> 78ffd6a250810864c44539877d3beb1a26b70911

    public Tir(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void effetCollision(Objet objet) {
<<<<<<< HEAD
        
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 78ffd6a250810864c44539877d3beb1a26b70911
    }

    @Override
    public String getTypeObjet() {
<<<<<<< HEAD
       
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 78ffd6a250810864c44539877d3beb1a26b70911
    }

    @Override
    public void evoluer(long l) {
<<<<<<< HEAD
        
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 78ffd6a250810864c44539877d3beb1a26b70911
    }
    
}
