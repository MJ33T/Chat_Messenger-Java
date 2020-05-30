/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;
import java.lang.*;
/**
 *
 * @author muhta
 */
public class Server{
    int port;
    public void Server() throws IOException{
        try{
            ServerSocket ss = new ServerSocket(port);
            
            Socket clientSocket = ss.accept();
            System.out.println("Create"); 
            RecieveFromClientThread receive = new RecieveFromClientThread(clientSocket);
            Thread thread = new Thread(receive);
            thread.start();
        
            SendToClient send = new SendToClient(clientSocket);
            Thread thread2 = new Thread(send);
            thread2.start();
            
        }catch(Exception IOE){
            System.out.println(IOE.getMessage());
        }
        
        
            
        //System.out.println(port);
    }
        
    

    
}
