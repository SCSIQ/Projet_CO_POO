/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import java.awt.Graphics;

/**
 *
 * @author emilie
 */
public class leJeu extends Jeu{

    public leJeu(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);
    }

    @Override
    protected void creeObjets() {
        
    }

    @Override
    protected void dessinerArrierePlan(Graphics grphcs) {
       
    }

    @Override
    protected void perdu() {
       
    }

    @Override
    protected void gagne() {
        
    }

    @Override
    protected boolean aGagne() {
      return true ; 
    }

    @Override
    protected boolean aPerdu() {
       return false ; 
    }
    
}
