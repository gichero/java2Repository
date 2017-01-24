import java.io.*;
import java.net.*;

public class ServerInt{

	public static void main(String[] args) {
	 	
	 	try{



	 		ServerSocket serverSocket;
            serverSocket = new ServerSocket(8000);
        
            Socket socket;
            socket = serverSocket.accept();

            DataInputStream dis; 
            dis = new DataInputStream(socket.getInputStream());
       
            System.out.println(dis.read(myArray[i]));
        }

        socket.close();

        catch(Exception ex){

            ex.printStackTrace();
                
        }
    }
	
}