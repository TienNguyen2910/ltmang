package buoi3;

import java.net.*;
import java.io.*;

public class UDPClientDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Tao UDP Socket
			DatagramSocket ds = new DatagramSocket();
			//Dong goi du lieu vua nhap
			byte b[] = new byte[1000];
			InetAddress dc = InetAddress.getByName("localhost");
			int p = 123;
			DatagramPacket goigui = new DatagramPacket(b,0,dc,p); 
			//Gui goi qua Server
			ds.send(goigui);
			//Tao ra UDP dung de nhan
			byte b1[] = new byte[1000];
			DatagramPacket goinhan = new DatagramPacket(b1,1000);
			//Nhan goi tra loi Server
			ds.receive(goinhan);
			//Hien thi ket qua cua goi
			byte b2[] = goinhan.getData();
			int len2 = goinhan.getLength();
			String ketqua = new String(b2,0,len2);
			System.out.println("Nhan duoc: "+ketqua);
			//Dong Socket
			ds.close();
		}
		catch(SocketException e) {
			System.out.println("Khoi tao UDP Socket that bai");
		}
		catch(UnknownHostException e) {
			System.out.println("Sai dia chi");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
	}

}
