/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroid_scs;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;

/**
 * @author lb078916
 */
public class Tir extends ObjetTouchable{
    private double angle ; 
    private Jeu jeu;


    public Tir(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        jeu=g;
    }

    @Override
    public void effetCollision(Objet objet) {
           if (testerCollision(objet)==true){
               if(objet.getTypeObjet()=="GrosAsteroide"){
                   
                   MoyenAsteroide ma1 = new MoyenAsteroide(jeu,20,20,"ast1");
                   MoyenAsteroide ma2 = new MoyenAsteroide(jeu,20,20,"ast2");
                   
               }else if(objet.getTypeObjet()=="MoyenAsteroide"){
                   PetitAsteroide pa1 = new PetitAsteroide(jeu,10,10,"ast1");
                   PetitAsteroide pa2 = new PetitAsteroide(jeu,10,10,"ast2");
                   PetitAsteroide pa3 = new PetitAsteroide(jeu,10,10,"ast3");
                   PetitAsteroide pa4 = new PetitAsteroide(jeu,10,10,"ast4");
                   
               }else if(objet.getTypeObjet()=="PetitAsteroide"){
                   
               }else if(objet.getTypeObjet()=="PetitAsteroide"){
                   
               }else if(objet.getTypeObjet()=="Vaisseau"){
                   
               }
           }
    }

    @Override
    public String getTypeObjet() {
        
    return "tir";
    }

    @Override
    public void evoluer(long l) {
        
    }
    
}
