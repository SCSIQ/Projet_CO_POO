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
    
    private final Jeu jeu;
    private Vie vie = null;

    public Vaisseau(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        this.jeu = g;
        vie = new Vie(jeu, "trois_coeur", 675, 10);

        jeu.ajouter(vie);
    }

    @Override
    public void effetCollision(Objet objet) {
        vie.enleverVie();
        this.changeSprite("fusee_ennemie"); 
        this.changeSprite("fusee"); 
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
            case KeyEvent.VK_Z:
                if(this.posHaute()>0)
                    this.deplacerXY(0, -10);
                break;
            case KeyEvent.VK_S:
                if(this.posBasse()<this.leJeu().hauteur())
                    this.deplacerXY(0, +10);
                break; 
            case KeyEvent.VK_SPACE:
                if (this.posDroite()<this.leJeu().largeur()){
                Tir t = new Tir(this.leJeu(), "tir", this.milieuX()+50, this.milieuY()) ; 
                leJeu().ajouter(t); 
                
                
            }
                        break ;           

        }
         
            //KeyEvent.VK_Z;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    
    }
    
    public void finDuJeu(){
        jeu.stopper();
    }
    
    public int getVie(){
        return vie.getVieRestante();
    }
    
  
}
