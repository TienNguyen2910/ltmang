package buoi3;

import java.net.*;
import java.io.*;
import java.util.Date;
public class UDPSeverDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			//Tao UDP Socket cong 123
			DatagramSocket ds = new DatagramSocket(123);
			//Nhan goi yeu cau tu Client
			byte b[] = new byte[1000];
			DatagramPacket goinhan = new DatagramPacket(b,1000);
			ds.receive(goinhan);
			//Xu ly yeu cau
			Date d = new Date();
			System.out.println("Ngay hien tai: "+d);
			String ketqua = d.toString();
			//Dong goi ket qua
			byte b2[] = ketqua.getBytes();
			int len2 = b2.length;
			InetAddress dc2 = goinhan.getAddress();
			int p2 = goinhan.getPort();
			DatagramPacket goigui = new DatagramPacket(b2,len2,dc2,p2);
			//Gui ket qua cho Client
			ds.send(goigui);
		}
		catch(SocketException e) {
			System.out.println("Khoi tao UDP Socket that bai");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
	}

}
