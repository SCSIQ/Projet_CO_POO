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
            
        }else if (objet.getTypeObjet()=="Petit asteroide"){
            
        }if(objet.getTypeObjet()=="tir"){
            leJeu().supprimer(this);
             PetitAsteroide a1= new PetitAsteroide(leJeu(),"petit_asteroide",this.milieuX(),this.milieuY());
             //PetitAsteroide a2= new PetitAsteroide(leJeu(),"petit_asteroide",this.milieuX()+10,this.milieuY());
             //PetitAsteroide a3= new PetitAsteroide(leJeu(),"petit_asteroide",this.milieuX()-10,this.milieuY());
             
             
             setNombreAsteroides(getNombreAsteroides()+2);
             
             this.leJeu().ajouter(a1);
             //this.leJeu().ajouter(a2);
             //this.leJeu().ajouter(a3);
       
             
        }else if(objet.getTypeObjet()=="Vaisseau"){
            leJeu().supprimer(this);
        }
        
        if(this.milieuX()<=0){
            leJeu().supprimer(this);
            /* MoyenAsteroide galea = new MoyenAsteroide (leJeu() ,"moyen_Asteroide",800,300 );  
            leJeu().ajouter(galea); */
             this.setNombreAsteroides(this.getNombreAsteroides()-1);
            System.out.println("astéroides = "+this.getNombreAsteroides());
        }else if(this.milieuY()<=0){
            leJeu().supprimer(this);
            /*MoyenAsteroide  galea = new MoyenAsteroide (leJeu() ,"moyen_Asteroide",800,300 );  
            leJeu().ajouter(galea); */
             this.setNombreAsteroides(this.getNombreAsteroides()-1);
            System.out.println("astéroides = "+this.getNombreAsteroides());
        }
        
         if(this.getNombreAsteroides()<5){
            MoyenAsteroide galea = new MoyenAsteroide(leJeu() ,"moyen_asteroide",800,300 );  
            leJeu().ajouter(galea);
        }
    }

    @Override
    public String getTypeObjet() {
        return "Moyen asteroide" ; 
    }
    
}
