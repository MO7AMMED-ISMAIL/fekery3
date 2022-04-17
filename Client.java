/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpsection;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author new
 */
public class Client {
    
    
    Client() throws UnknownHostException, IOException{
        
    InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
        Socket s = new Socket(ip,2200);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        String mag1 = in.readUTF();
        String mag2 = in.readUTF();
        System.out.println(mag1);
        System.out.println(mag2);
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter your massege: ");
            String UserMag = scan.nextLine();
            out.writeUTF(UserMag);
            String reply = in.readUTF();
            System.out.println(reply);
            if(UserMag.equals("Exit")){
                break;
            }
            else{
                
            }
            
        }
        
        s.close();
       
        
        
        
    }
    
    
}
