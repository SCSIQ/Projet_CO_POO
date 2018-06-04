/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;

/**
 *
 * @author emilie
 */
public class MoyenAsteroide extends Asteroide {

    public MoyenAsteroide(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void effetCollision(Objet objet) {
        if (objet.getTypeObjet()=="Tir" ){
        PetitAsteroide pa1 = new PetitAsteroide(this.leJeu(),"petit_asteroide", 5, 5); }
        PetitAsteroide pa2 = new PetitAsteroide(this.leJeu(),"petit_asteroide", 10, 10);
        PetitAsteroide pa3 = new PetitAsteroide(this.leJeu(),"petit_asteroide", 15, 15);
    }

    @Override
    public String getTypeObjet() {
        return "Moyen asteroide" ; 
    }
    
}
