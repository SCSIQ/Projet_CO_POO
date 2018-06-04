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
       if (objet.getTypeObjet()=="Moyen asteroide"){
            
        }else if (objet.getTypeObjet()=="Grand asteroide"){
            
        }
        else if (objet.getTypeObjet()=="Petit asteroide"){
            
        }
    }

    @Override
    public String getTypeObjet() {
        return "Moyen asteroide" ; 
    }
    
}
