package buoi5;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface FileRMI_Itf extends Remote{
	//Khai bao cac ham goi tu xa
	public int getLength(String filename) throws RemoteException;
	public byte[] getFile(String filename) throws RemoteException;
}
