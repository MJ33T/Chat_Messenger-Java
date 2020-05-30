/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.Socket;
/**
 *
 * @author muhta
 */
public class RecieveThread implements Runnable{

    Socket sock = null;
    BufferedReader recieve = null;

    RecieveThread(Socket sock) {
        this.sock = sock;
    }
    public void run() {
        try{
            recieve = new BufferedReader(new InputStreamReader(this.sock.getInputStream()));
            String msgrecieve = null;
            while((msgrecieve = recieve.readLine()) != null){
                System.out.println("From Server: " + msgrecieve);
                System.out.println("Please enter something to send to server..");
            }
        } 
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }   
}