/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;

/**
 *
 * @author emili
 */
public class Mur extends ObjetTouchable{

    public Mur(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void effetCollision(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTypeObjet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evoluer(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}