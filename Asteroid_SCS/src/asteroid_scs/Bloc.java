/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroid_scs;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.awt.Graphics;
import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 *
 * @author lb078916
 */
public class Bloc extends ObjetTouchable{

    public Bloc(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void effetCollision(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTypeObjet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evoluer(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void dessiner (Graphics g) {
        int xAlea;
        int yAlea;
        xAlea=(int) (random(6)*500);
        yAlea=(int) (random(6)*500);
        g.setColor(red);
        g.fillOval(xAlea, yAlea, 50, 50);
    }
    
    
}
