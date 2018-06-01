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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author lb078916
 */
public class Vaisseau extends ObjetTouchable implements KeyListener {
    
    private Jeu jeu;
    private int score = 0;
    
    public Vaisseau(Jeu g, String nom, int x, int y) {
        super(g, nom, x, y);
        jeu = g;
    }

    @Override
    public void effetCollision(Objet objet) {
        
    }

    @Override
    public String getTypeObjet() {
        return "Vaisseau";
    }

    @Override
    public void evoluer(long l) {
        
    }
    
    public void dessiner (Graphics g, int x, int y) {
        g.setColor(WHITE);
        //int x = 10;
        //int y = 10;
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

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_LEFT:
                if(this.posGauche()>0)
                    this.deplacerXY(-10, 0);
                break;
            case KeyEvent.VK_RIGHT:
                if(this.posDroite()<this.leJeu().largeur())
                    this.deplacerXY(+10, 0);
                break;                                        
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void deplacerXY(double dx, double dy) {
        super.deplacerXY(dx, dy); //To change body of generated methods, choose Tools | Templates.
        this.dessiner(jeu.getGraphics(),(int)dx,(int)dy);
    }
    
    
    
}
