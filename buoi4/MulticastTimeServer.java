package buoi4;

import java.io.*;
import java.net.*;
import java.util.Date;

public class MulticastTimeServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			//Tao UDP Socket 
			DatagramSocket ds = new DatagramSocket();
			while(true) {	
				//Lay thong tin ve thoi gian
				Date d = new Date();
				String kq = d.toString();
				//Dong goi UDP
				byte b[] = kq.getBytes();
				int len = b.length;
				InetAddress dc = InetAddress.getByName("230.0.0.1");
				int p =9013;
				DatagramPacket goigui = new DatagramPacket(b,len,dc,p);
				//Gui goi cho nhom dia chi 230.0.0.1, cong 9013
				ds.send(goigui);
				Thread.sleep(1000);
			}
		}
		catch(SocketException e) {
			System.out.println("Khong khoi tao duoc UDP Socket");
		}
		catch(UnknownHostException e) {
			System.out.println("Sai dia chi");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
		catch(InterruptedException e) {
			System.out.println("Loi xay ra khi tam dung");
		}
	}

}
