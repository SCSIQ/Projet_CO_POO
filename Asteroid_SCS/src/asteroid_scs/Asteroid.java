/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroid_scs;

import iut.Jeu;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alexiane
 */
public class Asteroid extends Jeu {

    public Asteroid(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);
        dessinerArrierePlan(this.getGraphics());
    }
    
       
    public void dessinerArrierePlan(Graphics gfx ){
        gfx.setColor(Color.black);
        gfx.fillRect(0, 0, 500, 500);
    }
    
    @Override
    protected void creeObjets() {
        
    }

    @Override
    protected void perdu() {
       
    }

    @Override
    protected void gagne() {
        
    }

    @Override
    protected boolean aGagne() {
        return false ; 
    }

    @Override
    protected boolean aPerdu() {
        return false ; 
    }
}
