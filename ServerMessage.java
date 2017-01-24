import java.rmi.*;
import.rmi.server.*;
import.rmi.registry.*;

public class ServerMessage extends UnicastRemoteObject implements Message {
	//properties
	private ServerMessage sm;
	private Registry reg;

	//constructors
	public ServerMessage() throws RemoteException{
		try{
			reg=LocateRegistry.getRegistry();
			reg.rebind("XYZ", this);
			System.out.println("Server Ready to send message");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	//behaviors
	public String getMessage() throws RemoteException{
		return "Go Braves";
	}

	public static void main(String[] args) throws RemoteException{
		ServerMessage sm1 = new ServerMessage;
	}
}//end class