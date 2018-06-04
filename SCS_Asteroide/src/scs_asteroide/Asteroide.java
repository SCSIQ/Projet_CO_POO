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
import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 *
 * @author emili
 */
public abstract class Asteroide extends ObjetTouchable{
    private int x;
    private int y;
    private double vitesse=0.2;
    private int angle=(int)((random(10)+1)*100);
    private Jeu jeu;
    
    public Asteroide(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        this.x=x;
        this.y=y;
        this.jeu = g;
    }
    @Override
    public abstract void effetCollision(Objet objet) ;

    @Override
    public abstract String getTypeObjet() ; 

    @Override
    public void evoluer(long l) {

        this.deplacerDA(l*vitesse, angle);


    }
    


}
