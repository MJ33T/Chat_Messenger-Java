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
public class RecieveFromClientThread implements Runnable {
    Socket ClientSocket = null;
    BufferedReader brBufferedReader = null;
    
    public RecieveFromClientThread(Socket ClientSocket){
        this.ClientSocket = ClientSocket;
        
    }


    public void run() {
        try{
            brBufferedReader = new BufferedReader(new InputStreamReader(this.ClientSocket.getInputStream()));
            String msg;
            while(true){
                while((msg = brBufferedReader.readLine()) != null){
                    
                }
                this.ClientSocket.close();
                
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
