/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhta
 */
public class ClientThread implements Runnable{
    public void run(){
        ClintGUI CG = new ClintGUI();
        CG.setVisible(true);
    }
}
