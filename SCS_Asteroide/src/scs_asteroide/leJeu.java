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

    //ATTRIBUTS 
    private Vaisseau vaisseau;
    private Jeu jeu ;
    
    public leJeu(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);
        vaisseau = new Vaisseau(this, "joueur", 0, 0);
        dessinerArrierePlan(this.getGraphics());
        creeObjets();
        
    }

    @Override
    protected void creeObjets() {
        vaisseau.dessiner(this.getGraphics(),10,10);
        
        PetitAsteroide comete = new PetitAsteroide(jeu ,"comete",20,20 ); 

        
        for(int i=1;i<6;i++){
            comete.dessiner(this.getGraphics());
        }
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
