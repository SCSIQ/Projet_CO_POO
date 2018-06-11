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
    private final leJeu jeu;
    
    public Tir(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        jeu = (leJeu)g;
    }

    @Override
    public void effetCollision(Objet objet) {
         if (objet!=this){
               if(objet.getTypeObjet()=="Grand asteroide"){
                   leJeu().supprimer(this); 
                   objet.effetCollision(this);
                   jeu.ajouterScore(1);
               }
               if(objet.getTypeObjet()=="Moyen asteroide"){
                   leJeu().supprimer(this); 
                   objet.effetCollision(this);
                   jeu.ajouterScore(1);
               }
               if(objet.getTypeObjet()=="Petit asteroide"){
                   leJeu().supprimer(this); 
                   objet.effetCollision(this);
                   jeu.ajouterScore(1);
               }
               if(objet.getTypeObjet()=="Vaisseau"){
                   leJeu().supprimer(this); 
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
