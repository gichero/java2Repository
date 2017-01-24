import java.io.*;
import java.net.*;

public class ClientString{

	public static void main(String[] args){

		ClientString CLIENT = new ClientString();
		CLIENT.run();

	}

	public void run() {

		try{

			Socket S1;
			S1 = new Socket("localhost", 8000);
			
			OutputStream OS;
			OS = S1.getOutputStream();

			PrintStream PS;
			PS = new PrintStream(OS);

			PS.println("Hello to SERVER from CLIENT");

			InputStreamReader ISR;
			ISR = new InputStreamReader(S1.getInputStream());
			BufferedReader BR = new BufferedReader(ISR);

			String Str;
			Str = BR.readLine();
			System.out.println(Str);

		}

		catch(IOException ex){
			ex.printStackTrace();

		}

    }
	
}

	
	