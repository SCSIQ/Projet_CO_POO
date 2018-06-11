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
<<<<<<< HEAD
import java.util.TimerTask;
=======
import java.util.Timer; 
import java.util.TimerTask; 

>>>>>>> cc779fd8caba2c30fac7d333753d42cc021d193d



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
<<<<<<< HEAD
      /* MoyenAsteroide ma = new MoyenAsteroide(this ,"moyen_asteroide",800,600 ); 
=======
        MoyenAsteroide ma = new MoyenAsteroide(this ,"moyen_asteroide",800,600 ); 
>>>>>>> cc779fd8caba2c30fac7d333753d42cc021d193d
        PetitAsteroide pa = new PetitAsteroide(this,"petit_asteroide",800,100);
        PetitAsteroide pa2 = new PetitAsteroide(this,"petit_asteroide",800,400);
        
        this.ajouter(pa);        
        this.ajouter(pa2);        
<<<<<<< HEAD
        this.ajouter(ma); */       
        this.ajouter(ga);
       
=======
        this.ajouter(ma);        
        this.ajouter(ga);
        
>>>>>>> cc779fd8caba2c30fac7d333753d42cc021d193d

        for(int i=0;i<5;i++){
            if(i==4){
                GrandAsteroide galea = new GrandAsteroide(this ,"grosA",800,300 );         
                MoyenAsteroide malea = new MoyenAsteroide(this ,"moyen_asteroide",800,600 ); 
                PetitAsteroide palea = new PetitAsteroide(this,"petit_asteroide",800,100);
                PetitAsteroide palea2 = new PetitAsteroide(this,"petit_asteroide",800,400);

                this.ajouter(palea);        
                this.ajouter(palea2);        
                this.ajouter(malea);        
                this.ajouter(galea);
                
            }
           
<<<<<<< HEAD
      }
=======
        }
        
        score = new Score(this, WIDTH);
        this.ajouter(score);
        
        //genererAsteroide() ; 
>>>>>>> cc779fd8caba2c30fac7d333753d42cc021d193d
        
       
    }

    @Override
    protected void dessinerArrierePlan(Graphics grphcs) {
        grphcs.setColor(Color.black);
        grphcs.fillRect(0, 0, 800, 800);
        grphcs.setColor(Color.white);
        
   
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
    
    public void genererAsteroide(){
     
   
        
    }
    
 /*   public void manche(){
        switch (vaisseau.getVie()) {
            case 2: 
                    this.supprimer(vaisseau); 
                break;
            case 1:
                break;
            case 0:
                perdu() ;
                break;
            default:
                break;
        }
        
    }
    
    
   */
               

}
