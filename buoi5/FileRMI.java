package buoi5;

import java.rmi.server.UnicastRemoteObject;
import java.io.*;
import java.rmi.*;

class FileRMI extends UnicastRemoteObject implements  FileRMI_Itf {
	// Ham xay dung
	public FileRMI() throws RemoteException {
		super();
	}

	// Dinh nghia ham goi tu xa
	// ham lay kich thuoc cua file
	public int getLength(String filename) {
		File f = new File(filename);
		int n;
		if (f.exists() && f.isFile()) {
			n = (int) f.length();
		} else
			n = -1;
		// f.close();
		return n;
	}

	// ham lay noi dung file
	public byte[] getFile(String filename) {
		byte b[] = new byte[60000];
		try {
			FileInputStream ff = new FileInputStream(filename);
			byte b1[] = new byte[60000];
			int size = ff.read(b1); //doc file
			String kq=new String(b1,0,size); //chuyen thanh chuoi
			b=kq.getBytes(); //gan noi dung thanh byte
		}
		catch(IOException e) {
			System.out.println("Khong tim thay file");
		}
		return b;
	}
}