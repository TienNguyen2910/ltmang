package buoi4;

import java.net.*;
import java.io.*;

public class MulticastTimeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			//Tao ra 1 multicast socket cong 9013
			MulticastSocket ms= new MulticastSocket(9013);
			//tham gia vao nhom dia chi 230.0.0.1
			InetAddress dc = InetAddress.getByName("230.0.0.1");
			ms.joinGroup(dc);
			//Nhan goi phuc vu
			byte b[] =new byte[1000];
			DatagramPacket goinhan = new DatagramPacket(b,1000);
			ms.receive(goinhan);
			//Hien thi thong tin
			byte b1[]  = goinhan.getData();
			int len1 =  goinhan.getLength();
			String kq = new String(b1,0,len1);
			System.out.println("Bay gio la: "+kq);
			//Roi khoi nhom
			ms.leaveGroup(dc);
			//Dong socket lai
			ms.close();
		}
		catch(UnknownHostException e) {
			System.out.println("Sai dia chi");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
	}

}
