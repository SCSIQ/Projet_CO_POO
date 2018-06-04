/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;
import static java.awt.Color.WHITE;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 *
 * @author emili
 */
public class Vaisseau extends ObjetTouchable implements KeyListener {
    
    public Vaisseau(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void effetCollision(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTypeObjet() {
        return "Vaisseau";
    }

    @Override
    public void evoluer(long l) {
     
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    
    }

    @Override
    public void keyPressed(KeyEvent ke) {
            switch(ke.getKeyCode())
        {
            case KeyEvent.VK_LEFT:
                if(this.posGauche()>0)
                    this.deplacerXY(-10, 0);
                break;
            case KeyEvent.VK_RIGHT:
                if(this.posDroite()<this.leJeu().largeur())
                    this.deplacerXY(+10, 0);
                break;                                        
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    
    }
    
  
}
