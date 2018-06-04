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
    private Vie vieJoueur = null;
    private Jeu jeu ;
    private int score = 0;

    public leJeu(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);         
    }

    @Override
    protected void creeObjets() {
        vaisseau = new Vaisseau(this, "fusee", 10, 10);
        this.ajouteEcouteurClavier(vaisseau);
        this.ajouter(vaisseau);
        
        GrandAsteroide ga = new GrandAsteroide(this ,"grosA",600,300 ); 
        
        MoyenAsteroide ma = new MoyenAsteroide(this ,"moyen_asteroide",500,600 ); 
        
            
        PetitAsteroide pa = new PetitAsteroide(this,"petit_asteroide",600,100);
        PetitAsteroide pa2 = new PetitAsteroide(this,"petit_asteroide",600,400);
        
        this.ajouter(pa);        
        this.ajouter(pa2);        
        this.ajouter(ma);        
        this.ajouter(ga);
        


        
        vieJoueur = new Vie(this, "trois_coeur", 675, 10);
        this.ajouter(vieJoueur);

       
       
    }

    @Override
    protected void dessinerArrierePlan(Graphics grphcs) {
        grphcs.setColor(Color.black);
        grphcs.fillRect(0, 0, 800, 800);
        grphcs.setColor(Color.white);
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

}
