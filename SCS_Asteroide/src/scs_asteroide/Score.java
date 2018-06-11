/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author emilie
 */
public class Score extends iut.Objet {

    private int score;

    public Score(Jeu g, int val) {
        super(g, String.valueOf(val), 0, 0);
        score = 0;
    }

    /**
     * fonction qui permet d'afficher le score sur la fenetre de jeu
     *
     * @param g
     */
    public void dessiner(Graphics g) {
        //g.clearRect(395, 0, 100, 20);
        //g.setColor(Color.black);
        //g.fillRect(395, 0, 100, 20);
        g.setColor(Color.white);
        g.drawString("Score : ", 400, 15);
        String sScore = "" + score;
        g.drawString(sScore, 448, 15);
    }

    @Override
    public boolean testerCollision(Objet objet) {
        return false;
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

    public void ajouterScore(int _score) {
        this.score += _score;
    }

}
