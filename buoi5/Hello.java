package buoi5;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class Hello extends UnicastRemoteObject implements HelloItf{
	//Ham xay dung
	public Hello() throws RemoteException{
		super(); //goi ham cha
	}
	//Dinh nghia ham tu xa
	public String SayHello() {
		return "Hello RMI";
	}
}