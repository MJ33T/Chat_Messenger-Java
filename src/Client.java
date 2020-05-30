/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
/**
 *
 * @author muhta
 */
public class Client {
    String ip;
    int port;
    
    public void Client(){
        
        try{
           Socket sock = new Socket(ip,port);
           SendThread sendThread = new SendThread(sock);
           Thread thread = new Thread(sendThread);
           thread.start();
           
           RecieveThread receiveThread = new RecieveThread(sock);
           Thread thread2 =new Thread(receiveThread);
           thread2.start();
   
        } catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
}
