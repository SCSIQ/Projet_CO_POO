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
import static jdk.nashorn.internal.objects.NativeMath.random;

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
            
            
<<<<<<< HEAD
                int x = (int) (random(6)*100)+500;
                int y = (int) (random(6)*100)+600;

                setNombreAsteroides(getNombreAsteroides()-1);
                super.getJeuAsteroid().ajouterScore(10);
=======
>>>>>>> cc779fd8caba2c30fac7d333753d42cc021d193d
            
            
                //int x = (int) (random(6)*100)+500;
                //int y = (int) (random(6)*100)+600;

                            
        }else if(objet.getTypeObjet()=="Vaisseau"){
            leJeu().supprimer(this);
            
        }
        
         if(this.milieuX()<=0){
            leJeu().supprimer(this);
            /*PetitAsteroide  galea = new PetitAsteroide (leJeu() ,"petit_Asteroide",800,300 );  
            leJeu().ajouter(galea); */
            this.setNombreAsteroides(this.getNombreAsteroides()-1);
            System.out.println("astéroides = "+this.getNombreAsteroides());
        }else if(this.milieuY()<=0){
            leJeu().supprimer(this);
            /*PetitAsteroide  galea = new PetitAsteroide (leJeu() ,"petit_Asteroide",800,300 );  
            leJeu().ajouter(galea); */
            this.setNombreAsteroides(this.getNombreAsteroides()-1);
            System.out.println("astéroides = "+this.getNombreAsteroides());
        }
         
        if(this.getNombreAsteroides()<5){
            PetitAsteroide galea = new PetitAsteroide(leJeu() ,"Petit_Asteroide",800,300 );  
            leJeu().ajouter(galea);
        }
        if (this.getNombreAsteroides()<0){
            PetitAsteroide galea = new PetitAsteroide(leJeu() ,"Petit_Asteroide",800,300 );  
            leJeu().ajouter(galea);
            MoyenAsteroide gale = new MoyenAsteroide(leJeu() ,"Moyen_Asteroide",800,300 );  
            leJeu().ajouter(gale);
            PetitAsteroide gal = new PetitAsteroide(leJeu() ,"Petit_Asteroide",800,300 );  
            leJeu().ajouter(gal);
            this.setNombreAsteroides(3);
        }
    }

    @Override
    public String getTypeObjet() {
        return "Petit asteroide" ; 
    }
    
}
