package buoi5;
import java.rmi.Remote;
import java.rmi.RemoteException;
interface HelloItf extends Remote {
	//Khai bao cac ham goi tu xa
	public String SayHello() throws RemoteException;
}
