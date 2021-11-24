package buoi5;

import java.io.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class FileRMIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//tim doi tuong
			FileRMI_Itf fil=(FileRMI_Itf)Naming.lookup("rmi://127.0.0.1/file");
			//goi ham tu xa
			///Nhap ten file tren server can doc
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap ten file can lay ve: ");
			String filedoc=sc.nextLine();
			System.out.println("Nhap ten file can luu cuc bo: ");
			String fileghi=sc.nextLine();
			//tien hanh doc file
			byte b[]=fil.getFile(filedoc);
			int len=fil.getLength(filedoc);
			System.out.println("Kich thuoc file: "+len);
			String nd=new String(b,0,len);
			System.out.println("Noi dung file: "+nd);
			// ghi file cuc bo cho Client
			FileOutputStream f=new FileOutputStream(fileghi);
			f.write(b);
			System.out.println("Da ghi file thanh cong");
		}
		catch(RemoteException e) {
			System.out.println("Loi khi goi ham tu xa");
		}
		catch(MalformedURLException e) {
			System.out.println("Sai dinh dang URL tim kiem");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
		catch(NotBoundException e) {
			System.out.println("Khong tim doi tuong file");
		}
	}

}
