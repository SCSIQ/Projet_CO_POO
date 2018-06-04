/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Objet;
import java.awt.event.KeyEvent;

/**
 *
 * @author aurian
 */
public class Vie extends iut.Objet {
    
    private int vieRestante = 3;
    
    public Vie(Jeu g, String nom, int x, int y){
        super(g, nom, x, y);
    }
    
    public void enleverVie(){
        if(vieRestante > 0){
            vieRestante = vieRestante-1;
        }
        System.out.println("vie après impact : "+vieRestante);
        if(vieRestante == 2){
            this.changeSprite("deux_coeur");
        }
        if(vieRestante == 1){
            this.changeSprite("un_coeur");
        }
        if(vieRestante == 0){
            this.changeSprite("zero_coeur");
            //coder fin du jeu car le joueur a perdu
            
        }
        
        
        
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
        return "";
    }

    @Override
    public void evoluer(long l) {
    }

    public int getVieRestante() {
        return vieRestante;
    }

    

}
