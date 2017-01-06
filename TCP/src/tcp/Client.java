package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    
    public Client(){
        try {
            //creating the socket to connect to server running on same maching
            Socket client = new Socket("localhost", 3000); // same pc so use localhost or use ip_address(127.0.0.1)
            System.out.println("Client connected ");
            //getting the o/p stream of that connection
            PrintStream out = new PrintStream(client.getOutputStream());
            //sending the message to server
            out.print("Hello from client\n");
            out.flush();
            //reading the response using tnput strem
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println(in.readLine());
            //closing the streams
            in.close();
            out.close();
    } catch (Exception err) {
            System.err.println("* err" + err);
    }
    }

    public static void main(String[] args) {
        new Client();

    }

}
