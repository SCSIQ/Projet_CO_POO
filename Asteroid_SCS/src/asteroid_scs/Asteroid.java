/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroid_scs;

import iut.Jeu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Alexiane
 */
public class Asteroid extends Jeu {
    Image comete = Toolkit.getDefaultToolkit().getImage("fond.jpg");
    private int score = 0;
    private int vie = 3;
    
    public Asteroid(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);
        dessinerArrierePlan(this.getGraphics());
        creeObjets();

    }
    
       
    public void dessinerArrierePlan(Graphics gfx ){
        gfx.setColor(Color.black);
        gfx.fillRect(0, 0, 500, 500);
        gfx.fillRect(0, 0, 500, 500);
        gfx.setColor(Color.white);
        gfx.drawString("Vies : ", 300, 15);
        String sVie = ""+vie;
        gfx.drawString(sVie, 338, 15);
        gfx.drawString("Score : ", 400, 15);
        String sScore = ""+score;
        gfx.drawString(sScore, 448, 15);
    }
    
    @Override
    protected void creeObjets() {
        Vaisseau vJoueur = new Vaisseau(this, "joueur", 0, 0);

        Bloc comete = new Bloc(this, "comete", 0, 0);
        vJoueur.dessiner(this.getGraphics());
        
        for(int i=1;i<6;i++){
            comete.dessiner(this.getGraphics());
        }

        Graphics GVaisseau = this.getGraphics();
       
        vJoueur.dessiner(GVaisseau);
    }

    @Override
    protected void perdu() {
       
    }

    @Override
    protected void gagne() {
        
    }

    @Override
    protected boolean aGagne() {
        return false ; 
    }

    @Override
    protected boolean aPerdu() {
        return false ; 
    }
}
