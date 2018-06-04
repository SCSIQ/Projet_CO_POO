/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author emilie
 */
public class leJeu extends Jeu{

    //ATTRIBUTS 
<<<<<<< HEAD
    private Vaisseau vaisseau;
 
=======
    private Vaisseau vaisseau = null;
    private GrandAsteroide ga;
>>>>>>> fe2b730a7fbc3bbda1fe6d72c77c5cd8be6ca1fd
    private Jeu jeu ;
    private int score = 0;
    private int vie = 3;

 

    
<<<<<<< HEAD
    public leJeu(int largeur, int hauteur, String title)  {
        super(largeur, hauteur, title);
        vaisseau = new Vaisseau(this, "joueur", 0, 0);
        dessinerArrierePlan(this.getGraphics());
        
        creeObjets();
        
       

=======
    public leJeu(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title); 
         ga= new GrandAsteroide(this,"gros_asteroide",10,10);
>>>>>>> fe2b730a7fbc3bbda1fe6d72c77c5cd8be6ca1fd
    }

    @Override
    protected void creeObjets() {
        vaisseau = new Vaisseau(this, "fusee", 0, 0);
        this.ajouteEcouteurClavier(vaisseau);
        this.ajouter(vaisseau);
        
<<<<<<< HEAD
        PetitAsteroide comete = new PetitAsteroide(jeu ,"gros_asteroide",20,20 ); 

        
        for(int i=1;i<6;i++){
=======
        //PetitAsteroide comete = new PetitAsteroide(jeu ,"comete",20,20 ); 
        /*for(int i=1;i<6;i++){
>>>>>>> fe2b730a7fbc3bbda1fe6d72c77c5cd8be6ca1fd
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
