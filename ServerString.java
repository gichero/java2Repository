import java.io.*;
import java.net.*;

public class ServerString {

	public static void main(String[] args){

		
		ServerString SERVER = new ServerString();
		SERVER.run();

	}

		public void run(){

		try{
			Socket S1;
			ServerSocket SS1;

			SS1= new ServerSocket(8000);
			System.out.println("Server is waiting for a connection...");
			S1=SS1.accept();

			InputStream IS;
			IS = S1.getInputStream();

			InputStreamReader ISR;
			ISR = new InputStreamReader(IS);

			BufferedReader BR = new BufferedReader (ISR);

			String Str;
			Str = BR.readLine();

			PrintStream PS;
			PS = new PrintStream(S1.getOutputStream());
			PS.println("Message Received!!!");

		}

		catch(IOException ex){
			ex.printStackTrace();

		}

	}

}