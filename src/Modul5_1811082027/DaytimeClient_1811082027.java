/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811082027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Salman Alfarissy
 */
public class DaytimeClient_1811082027 {
    public static final int SERVICE_PORT = 13;
    public static void main(String[] args) {
        try {
            String hostname = "localhost";
            
            Socket daytime = new Socket(hostname, SERVICE_PORT);
            System.out.println("Connection established");
            
            daytime.setSoTimeout(2000);
            
            BufferedReader reader1811082027 = new BufferedReader(new InputStreamReader(daytime.getInputStream()));
            
            System.out.println("Result: "+reader1811082027.readLine());
            
            daytime.close();
        } catch (IOException e) {
            System.err.println("Error "+e);
        }
    }
            
    
}
