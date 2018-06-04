/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;

/**
 *
 * @author emilie
 */
public class Tir extends ObjetTouchable {

    //ATTRIBUTS 
    private double angle=0 ; 
    private double vitesse=0.5;
    
    public Tir(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void effetCollision(Objet objet) {
         if (objet!=this){
               if(objet.getTypeObjet()=="GrosAsteroide"){
                   
                   MoyenAsteroide ma1 = new MoyenAsteroide(leJeu(),"ast1",20,20);
                   MoyenAsteroide ma2 = new MoyenAsteroide(leJeu(),"ast2",20,20);
                   this.leJeu().mourir();
                   
                   
               }
               if(objet.getTypeObjet()=="MoyenAsteroide"){
                   PetitAsteroide pa1 = new PetitAsteroide(leJeu(),"ast1",10,10);
                   PetitAsteroide pa2 = new PetitAsteroide(leJeu(),"ast2",10,10);
                   PetitAsteroide pa3 = new PetitAsteroide(leJeu(),"ast3",10,10);
                   PetitAsteroide pa4 = new PetitAsteroide(leJeu(),"ast4",10,10);
                   this.leJeu().mourir();
                   
                   
               }
               if(objet.getTypeObjet()=="PetitAsteroide"){
                   
                   this.leJeu().mourir();
                   
               }
               if(objet.getTypeObjet()=="Vaisseau"){
                   
                   this.leJeu().mourir();
               }
           }
    }

    @Override
    public String getTypeObjet() {
        return "tir" ; 
    }

    @Override
    public void evoluer(long l) {
        this.deplacerDA(l*vitesse, angle);
    }
    
}
