/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Lutin;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author emilie
 */
public class leJeu extends Jeu{

    //ATTRIBUTS 
    private Vaisseau vaisseau;
    private Jeu jeu ;
    private int score = 0;
    private int vie = 3;

 

    
    public leJeu(int largeur, int hauteur, String title) throws IOException {
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
        grphcs.setColor(Color.black);
        grphcs.fillRect(0, 0, 500, 500);
        grphcs.fillRect(0, 0, 500, 500);
        grphcs.fillRect(0, 0, 500, 500);
        grphcs.setColor(Color.white);
        grphcs.drawString("Vies : ", 300, 15);
        String sVie = ""+vie;
        grphcs.drawString(sVie, 338, 15);
        grphcs.drawString("Score : ", 400, 15);
        String sScore = ""+score;
        grphcs.drawString(sScore, 448, 15);

 
        
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
