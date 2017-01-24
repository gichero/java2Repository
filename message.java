import java.rmi.*;

public interface Message extends Remote{

	public String getMessage() throws RemoteException;

}//end interface