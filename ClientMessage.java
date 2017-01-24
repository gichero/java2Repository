import java.rmi.*;
import java.rmi.registry.*;

public class ClientMessage{
	//properties
	private String s;
	private Message m1;

	//constructors
	public ClientMessage(){
		try{
			Registry reg;
			reg=LocatedRegistry.getRegistry("localhost");

			m1=(Message)reg.lookup("XYZ");
			s=m1.getMessage();
			System.out.println(s);
		}
		catch(Exception e){
			System.out.println(e);
		}

		

	}
	//behaviors
	public static void main (String[] args){
	    clientMessage cm;
		cm = new ClientMessage();
	}
}