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
 * @author emili
 */
public class GrandAsteroide extends Asteroide {
  

    public GrandAsteroide(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
      
    }

    @Override
    public void effetCollision(Objet objet) {
        if (objet.getTypeObjet()=="Tir"){
            MoyenAsteroide ma1 = new MoyenAsteroide(this.leJeu(),"moyen_asteroide",10,10);
            MoyenAsteroide ma2 = new MoyenAsteroide(this.leJeu(),"moyen_asteroide",10,10);
            
        }
    }

    @Override
    public String getTypeObjet() {
        return "Grand asteroide" ; 
    }
    
}
