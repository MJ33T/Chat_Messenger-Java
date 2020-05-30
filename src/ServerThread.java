/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhta
 */
public class ServerThread implements Runnable{
    public void run(){
        ServerGUI SG = new ServerGUI();
        SG.setVisible(true);
    }
    
}
