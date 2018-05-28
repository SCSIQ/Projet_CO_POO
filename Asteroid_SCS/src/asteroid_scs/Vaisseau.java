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
        g.drawOval(50, 50, 20, 20);
       
    }
    
}
