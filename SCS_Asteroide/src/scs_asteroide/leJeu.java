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
import java.io.File;
import javax.swing.JOptionPane;


/**
 *
 * @author emilie
 */
public class leJeu extends Jeu{

    //ATTRIBUTS 
    private Vaisseau vaisseau = null;
    private Jeu jeu ;
    private int score = 0;
    private int vie = 3;

    public leJeu(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);         
    }

    @Override
    protected void creeObjets() {
        vaisseau = new Vaisseau(this, "fusee", 10, 10);
        this.ajouteEcouteurClavier(vaisseau);
        this.ajouter(vaisseau);
        
        GrandAsteroide ga = new GrandAsteroide(this ,"grosA",200,300 ); 
        
        MoyenAsteroide ma = new MoyenAsteroide(this ,"moyen_asteroide",400,600 ); 
        
            
        PetitAsteroide pa = new PetitAsteroide(this,"petit_asteroide",200,100);
        PetitAsteroide pa2 = new PetitAsteroide(this,"petit_asteroide",400,400);
        
        this.ajouter(pa);        
        this.ajouter(pa2);        
        this.ajouter(ma);        
        this.ajouter(ga);

       

        
        Vie v = new Vie(this, "trois_coeur", 675, 10);
        this.ajouter(v);

       
       
    }

    @Override
    protected void dessinerArrierePlan(Graphics grphcs) {
        grphcs.setColor(Color.black);
        grphcs.fillRect(0, 0, 800, 800);
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
      JOptionPane.showMessageDialog(this, "Vous avez perdu");
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
