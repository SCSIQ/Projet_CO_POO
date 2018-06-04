/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import java.awt.Graphics;

/**
 *
 * @author emilie
 */
public class Score extends iut.Objet {

    private int score= 0; 
 
    public Score(Jeu g, int val) {
        super(g, String.valueOf(val), 0, 0);
    }
    
    public void dessiner(Graphics g){
        g.drawString("Score : ", 400, 15);
        String sScore = ""+score;
        g.drawString(sScore, 448, 15);
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

    public void ajouterScore(int score) {
        this.score += score;
    }
    
}
