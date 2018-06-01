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
    private Asteroid monJeu;


    public Tir(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        jeu=g;
        monJeu = new Asteroid(x,y,nom); 
    }

    @Override
    public void effetCollision(Objet objet) {
           if (testerCollision(objet)==true){
               if(objet.getTypeObjet()=="GrosAsteroide"){
                   
                   MoyenAsteroide ma1 = new MoyenAsteroide(jeu,"ast1",20,20);
                   MoyenAsteroide ma2 = new MoyenAsteroide(jeu,"ast2",20,20);
                   monJeu.setScore(10);
                   
               }else if(objet.getTypeObjet()=="MoyenAsteroide"){
                   PetitAsteroide pa1 = new PetitAsteroide(jeu,"ast1",10,10);
                   PetitAsteroide pa2 = new PetitAsteroide(jeu,"ast2",10,10);
                   PetitAsteroide pa3 = new PetitAsteroide(jeu,"ast3",10,10);
                   PetitAsteroide pa4 = new PetitAsteroide(jeu,"ast4",10,10);
                   monJeu.setScore(20);
                   
               }else if(objet.getTypeObjet()=="PetitAsteroide"){
                   monJeu.setScore(30);
                   
               }else if(objet.getTypeObjet()=="Vaisseau"){
                   monJeu.setScore(50);
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
