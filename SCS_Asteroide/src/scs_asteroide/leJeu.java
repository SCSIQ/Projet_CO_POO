/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.Image;
import java.io.File;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeMath.random;
import java.util.TimerTask;
import java.util.Timer; 
import java.util.TimerTask; 
import java.util.Random;




/**
 *
 * @author emilie
 */
public class leJeu extends Jeu{

    //ATTRIBUTS 
    private Vaisseau vaisseau = null;
    private Score score = null;
    private boolean perdu ; 
    private boolean gagne; 
    private int i =0;
    private int posX = (int)random(100)+900;
    private int posY =(int)random(100)+500;
    private Random rand = new Random();
    
    public leJeu(int largeur, int hauteur, String title) {
        super(largeur, hauteur, title);  
        vaisseau = new Vaisseau(this, "fusee", 10, 100);
        perdu= false ; 
        gagne = false ; 
        
        
    }

    @Override
    protected void creeObjets() {

        this.ajouteEcouteurClavier(vaisseau);
        
        this.ajouter(vaisseau);
        
        GrandAsteroide ga = new GrandAsteroide(this ,"grosA",800,300 );      
        this.ajouter(ga);        
        
        score = new Score(this, WIDTH);
        this.ajouter(score);
                
       
    }



    @Override
    protected void dessinerArrierePlan(Graphics grphcs) {
        grphcs.setColor(Color.black);
        grphcs.fillRect(0, 0, 800, 800);
        grphcs.setColor(Color.white);
        
        
        if(i%10==0){
            int n = rand.nextInt(3);
            System.out.println("rand : "+rand);
            switch (n){
                case 0 : PetitAsteroide galea0 = new PetitAsteroide((this),"petit_asteroide",posX,posY );
                        this.ajouter(galea0);
                    break;
                case 1 : MoyenAsteroide galea1 = new MoyenAsteroide((this),"moyen_asteroide",posX,posY );
                        this.ajouter(galea1);
                    break;
                case 2 : GrandAsteroide galea2 = new GrandAsteroide((this),"grosA",posX,posY );
                        this.ajouter(galea2);
                    break;
            }
             
            
        }
        i++;
        
   
    }

    @Override
    protected void perdu() {
      JOptionPane.showMessageDialog(this, "Vous avez perdu");
    }

    @Override
    protected void gagne() {
        
    }

    @Override
    protected boolean aGagne() {
      return gagne ; 
    }

    @Override
    protected boolean aPerdu() {
 
        if(vaisseau.getVie() == 0){
            perdu= true ; 
            
        }else {
            perdu = false; 
        }
       return perdu;  
    }

    public void ajouterScore(int _score) {
        this.score.ajouterScore(_score);
    }
               

}
