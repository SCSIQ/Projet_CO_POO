/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import static jdk.nashorn.internal.objects.NativeMath.random;

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
           
           MoyenAsteroide ma = new MoyenAsteroide(this.leJeu(),"moyen_asteroide",objet.milieuX(),objet.milieuY());  
           MoyenAsteroide ma1 = new MoyenAsteroide(this.leJeu(),"moyen_asteroide",objet.milieuX()+10,objet.milieuY());    
           MoyenAsteroide ma2 = new MoyenAsteroide(this.leJeu(),"moyen_asteroide",objet.milieuX()-10,objet.milieuY());   
           leJeu().ajouter(ma);
           leJeu().ajouter(ma1);
           
           leJeu().supprimer(this);
           
           
                int x = (int) (random(6)*100)+500;
                int y = (int) (random(6)*100)+600;

                MoyenAsteroide ma3 = new MoyenAsteroide(this.leJeu(),"moyen_asteroide",x,y);
                GrandAsteroide ga1 = new GrandAsteroide(this.leJeu(),"grosA",x,y);
                PetitAsteroide pa = new PetitAsteroide(this.leJeu(),"petit_asteroide",x,y);
                leJeu().ajouter(pa);
                leJeu().ajouter(ma3);
                leJeu().ajouter(ga1);
            
          
           
        }else if (objet.getTypeObjet()=="Moyen asteroide"){
            
        }
        else if (objet.getTypeObjet()=="Grand asteroide"){
            
        }
        else if (objet.getTypeObjet()=="Petit asteroide"){
            
        }else if(objet.getTypeObjet()=="Vaisseau"){
            leJeu().supprimer(this);
        }
    }

    @Override
    public String getTypeObjet() {
        return "Grand asteroide" ; 
    }
    
    
    
}
