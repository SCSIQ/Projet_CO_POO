/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emili
 */
public class PetitAsteroide extends Asteroide {
  
    public PetitAsteroide(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        
    }

    @Override
    public void effetCollision(Objet objet) {
        if (objet.getTypeObjet()=="Moyen asteroide"){
            
        }else if (objet.getTypeObjet()=="Grand asteroide"){
            
        }
        else if (objet.getTypeObjet()=="Petit asteroide"){
            
        }else if(objet.getTypeObjet()=="tir"){
            leJeu().supprimer(this);
            
        }else if(objet.getTypeObjet()=="Vaisseau"){
            leJeu().supprimer(this);
        }
    }

    @Override
    public String getTypeObjet() {
        return "Petit asteroide" ; 
    }
    
}
