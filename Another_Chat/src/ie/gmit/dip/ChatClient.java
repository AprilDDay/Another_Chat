/*package ie.gmit.dip;


import java.net.*;
import java.io.*;
 
/**
 * This is the chat client program.
 * Type 'bye' to terminte the program.
 *
 * @author www.codejava.net
 */
/*
public class ChatClient {
    private String hostname;
    private int port;
    private String userName;

    private static final String TERMINATE = "\\q";
    static volatile boolean finished=false;
    
    public ChatClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }
 
    public void execute() {
        try {
            Socket socket = new Socket(hostname, port);
 
            System.out.println("Connected to the chat server");
 
            new ReadThread(socket, this).start();
            new WriteThread(socket, this).start();
 
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
 
    }
 
    void setUserName(String userName) {
        this.userName = userName;
    }
 
    String getUserName() {
        return this.userName;
    }
 
 
    public static void main(String[] args) {
     //   if (args.length < 2) return;
 
       // String hostname = args[0];
       // int port = Integer.parseInt(args[1]);
 
        //ChatClient client = new ChatClient("localhost", 3001);
    	ChatClient client = new ChatClient("127.0.0.1", 3001);
        client.execute();
    }
}*/