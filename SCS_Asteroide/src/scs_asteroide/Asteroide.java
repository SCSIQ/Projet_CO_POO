/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;
import static java.awt.Color.red;
import java.awt.Graphics;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 *
 * @author emili
 */
public abstract class Asteroide extends ObjetTouchable{
    private int x;
    private int y;
    private double vitesse=0.2;
    private Random random;
    private int angle=(int)((random(10)+1)*100);
    private int posY=(int)random(500);
    private int posX=(int)random(100)+100;
    private leJeu jeuAsteroid;
    private int nombreAsteroides=5;
    
    public Asteroide(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        this.x=posX;
        this.y=posY;
        jeuAsteroid = (leJeu)g;
    }
    @Override
    public abstract void effetCollision(Objet objet) ;

    @Override
    public abstract String getTypeObjet() ; 

    @Override
    public void evoluer(long l) {

        this.deplacerDA(l*vitesse, angle);


    }

    public leJeu getJeuAsteroid() {
        return jeuAsteroid;
    }
    
    public int getNombreAsteroides(){
        return nombreAsteroides;
    }
    public void setNombreAsteroides(int nbast){
        nombreAsteroides=nbast;
    }
    
     
   

}
