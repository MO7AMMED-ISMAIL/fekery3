/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpsection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author new
 */
public class Server {
    
    Server() throws IOException{
        ServerSocket server =new ServerSocket(2200);
        try (Socket s = server.accept()) {
            
            DataInputStream input = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            out.writeUTF("server is connected");
            out.writeUTF("send massage");
            while(true){
                String mag = input.readUTF();
                System.out.println(mag);
                out.writeUTF("Recived");
                if(mag.equals("Exit")){
                 break;
                }
            }
            s.close();
            out.close();
            input.close();
            
        }
    }
    
}