package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gui.GuiLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author Bruno
 */
public class SplashController implements Runnable{
    JProgressBar barra = new JProgressBar();
    JFrame frame = new JFrame();
    
    public void setBarra(JProgressBar b){
        barra=b;
    }
    
    public void setFrame(JFrame f){
        frame=f;
    }
    
    public void run(){
        int i;
        for(i=0;i<=100;i++){
            try {
                Thread.sleep(30);
                barra.setValue(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        frame.setVisible(false);
        try {
            new GuiLogin().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread.currentThread().interrupt();
    }
}
