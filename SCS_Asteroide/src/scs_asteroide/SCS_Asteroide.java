/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs_asteroide;

import iut.Jeu;
import iut.Lutin;
import iut.Lutins;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.TimerTask;
import javax.swing.Timer;
import java.util.TimerTask; 


/**
 *
 * @author emilie
 */
public class SCS_Asteroide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
   
       
       
        Jeu jeuAsteroid = new leJeu(800, 800, "Asteroid");
        jeuAsteroid.jouer();
       
    }
      
}

