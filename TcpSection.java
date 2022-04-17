/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpsection;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author new
 */
public class TcpSection {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.err.println("who are you ? : ");
        Scanner s = new Scanner(System.in);
        String rep = s.nextLine();
        
        if(rep.equals("server")){
            Server ser =new Server();
        }
        else{
            Client cli = new Client();
        }
        
    }
    
}
