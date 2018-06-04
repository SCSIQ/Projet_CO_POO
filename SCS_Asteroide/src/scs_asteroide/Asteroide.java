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
    
    public Asteroide(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
    }
    @Override
    public abstract void effetCollision(Objet objet) ;

    @Override
    public abstract String getTypeObjet() ; 

    @Override
    public void evoluer(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void dessiner (Graphics g) {
        
        
        int xAlea;
        int yAlea;
        int wAlea;
       
        xAlea=(int) (random(6)*500)+10;
        yAlea=(int) (random(6)*500)+10;
        wAlea=(int) (random(6)*70)+20;
        
        g.setColor(red);
        g.fillOval(xAlea, yAlea, wAlea, wAlea);
    }
    
    
}
