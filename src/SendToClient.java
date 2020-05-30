/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author muhta
 */
public class SendToClient implements Runnable{
    Socket clientSocket = null;
    PrintWriter pwPrintWriter = null;
    String msgtoclient = null;
    
    public SendToClient(Socket clientSocket){
        this.clientSocket = clientSocket;
    }
    public SendToClient(String msgtoclient){
        this.msgtoclient = msgtoclient;
    }
    
    public void run() {
        try{
            pwPrintWriter = new PrintWriter(new OutputStreamWriter(this.clientSocket.getOutputStream()));
            while(true){
                InputStream stream = new ByteArrayInputStream(msgtoclient.getBytes(StandardCharsets.UTF_8));
                BufferedReader input = new BufferedReader(new InputStreamReader(stream));
                msgtoclient = input.readLine();
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
