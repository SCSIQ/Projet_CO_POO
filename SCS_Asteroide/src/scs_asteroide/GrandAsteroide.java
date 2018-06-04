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
        if(objet.getTypeObjet()=="tir"){
           leJeu().supprimer(this);
           MoyenAsteroide ma = new MoyenAsteroide(this.leJeu(),"moyen_asteroide",objet.milieuX()-100,objet.milieuY());            
           leJeu().ajouter(ma);
           MoyenAsteroide ma1 = new MoyenAsteroide(this.leJeu(),"moyen_asteroide",objet.milieuX()+250,objet.milieuY());            
           leJeu().ajouter(ma1);
          
        }else if (objet.getTypeObjet()=="Moyen asteroide"){
            
        }
        else if (objet.getTypeObjet()=="Grand asteroide"){
            
        }
        else if (objet.getTypeObjet()=="Petit asteroide"){
            
        }
    }

    @Override
    public String getTypeObjet() {
        return "Grand asteroide" ; 
    }
    
}
