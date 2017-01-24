import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {

    	try{
    		Socket socket;
    		socket = new Socket("localhost" , 8000 );

            DataOutputStream dos;
            dos = new DataOutputStream(socket.getOutputStream());

            int[] myArray = {1,2,3,4,5};

            for (int i = 0; i<myArray.length; i++)
            
            dos.write(myArray[i]);

    	}
        
        socket.close();

        catch(Exception e) {
        	printStackTrace();
        }


}