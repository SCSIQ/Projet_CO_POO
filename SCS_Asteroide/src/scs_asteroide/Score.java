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
public class Score extends iut.Objet {

        //ATTRIBUTS 
    private int score= 0; 

   
    
    public Score(Jeu g, int val) {
        super(g, String.valueOf(val), 10, 10);
    }

    @Override
    public boolean testerCollision(Objet objet) {
        return false ; 
    }

    @Override
    public void effetCollision(Objet objet) {
       
    }

    @Override
    public String getTypeObjet() {
        return "Score"; 
    }

    @Override
    public void evoluer(long l) {
       
    }
     public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }
    
}
