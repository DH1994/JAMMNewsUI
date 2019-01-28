/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jammnews;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
/**
 *
 * @author dhergaarden
 */
public class tcpConnection 
{

    private Socket socket;
    private Scanner scanner;
    PrintWriter out;
    BufferedReader in;
     
    private String received;

    public Boolean dataAvailable()
    {
        try {
            return socket.getInputStream().available() > 0;
        } catch (IOException ex) {
            Logger.getLogger(tcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Boolean getConnectionState()
    {
        return socket.isConnected() & !socket.isClosed();
    }
    
    public String getReceived() {
        return received;
    }
    
    public tcpConnection(String addr, int port) {
        try {
            connect(InetAddress.getByName(addr), port);
        } catch (Exception ex) {
            Logger.getLogger(tcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     
    private void connect(InetAddress serverAddress, int serverPort) throws Exception {
        this.socket = new Socket(serverAddress, serverPort);
        this.scanner = new Scanner(System.in);

        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));   
    }
    
    public boolean disConnect()
    {
        try {
            this.socket.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(tcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void readFromConnection()
    {
        String buffer = null;
        try {
            if((buffer = in.readLine()) != null);
            {
                System.out.println(buffer);  
                received = buffer;
            }                               
        } catch (IOException ex) {
            Logger.getLogger(tcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writeToConnection(String data)
    {
        System.out.println(data);
        try {
            out = new PrintWriter(this.socket.getOutputStream(), true);
            out.println(data);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(tcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}

