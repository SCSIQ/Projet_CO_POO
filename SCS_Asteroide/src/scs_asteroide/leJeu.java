/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author emilie
 */
public class leJeu extends Jeu{

    //ATTRIBUTS 
    private Vaisseau vaisseau = null;
    private int score = 0;
    private int vie = 3;
    
    public leJeu(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title); 
    }

    @Override
    protected void creeObjets() {
        vaisseau = new Vaisseau(this, "fusee", 0, 0);
        this.ajouteEcouteurClavier(vaisseau);
        this.ajouter(vaisseau);
        
        //PetitAsteroide comete = new PetitAsteroide(jeu ,"comete",20,20 ); 
        /*for(int i=1;i<6;i++){
            comete.dessiner(this.getGraphics());
        }*/
    }

    @Override
    protected void dessinerArrierePlan(Graphics grphcs) {
        grphcs.setColor(Color.black);
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
      return false ; 
    }

    @Override
    protected boolean aPerdu() {
       return false ; 
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
    
}
