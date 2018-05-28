/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroid_scs;

import iut.Jeu;
import iut.Objet;
import iut.ObjetTouchable;
import static java.awt.Color.WHITE;
import java.awt.Graphics;

/**
 *
 * @author lb078916
 */
public class Vaisseau extends ObjetTouchable {

    public Vaisseau(Jeu g, String nom, int x, int y) {
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
        g.setColor(WHITE);
        int x = 10;
        int y = 10;
        int[] tabx = new int[3];
        int[] taby = new int[3];
        tabx[0] = x;
        taby[0] = y;
        tabx[1] = x+20;
        taby[1] = y+10;
        tabx[2] = x;
        taby[2] = y+20;
        g.drawPolygon(tabx, taby, 3);
    }
    
}
