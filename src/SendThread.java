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
public class SendThread implements Runnable {
    Socket sock = null;
    //PrintWriter print = null;
    BufferedReader brinput = null;
    String text;
    String msgtoServerString;

    SendThread(Socket sock) {
        this.sock = sock;
    }
    SendThread(String text){
        this.text=text;
    }

    
    
    
    
    public void run(){
        try{
            if(sock.isConnected()){
                //this.print = new PrintWriter(sock.getOutputStream(), true);
                InputStream stream = new ByteArrayInputStream(this.text.getBytes(StandardCharsets.UTF_8));
                while(true){
                    brinput = new BufferedReader(new InputStreamReader(stream));
                    msgtoServerString = brinput.readLine();
                    
                }
            }
            sock.close();
        }catch(Exception e){System.out.println(e.getMessage());}
    }
    
}
