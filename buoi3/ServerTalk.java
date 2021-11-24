package buoi3;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ServerTalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Tao UDP Socket cong 2910
			DatagramSocket ds = new DatagramSocket(2910);
			//Nhan goi yeu cau tu Client
			byte b[] = new byte[60000];
			DatagramPacket goinhan = new DatagramPacket(b,60000);
			while(true) {
				ds.receive(goinhan);
				//Xu ly yeu cau
				byte b1[] = goinhan.getData();
				int len1 = goinhan.getLength();
				String dl = new String(b1,0,len1);
				System.out.println("Client: "+dl);
				//kiem tra dieu kien thoat
				if(dl.equals(""))	break;
				//Dong goi ket qua
				System.out.print("Server: ");
				Scanner kb = new Scanner(System.in);
				String chuoi = kb.nextLine();
				byte b2[] = chuoi.getBytes();
				int len2 = b2.length;
				InetAddress dc2 = goinhan.getAddress();
				int p2 = goinhan.getPort();
				DatagramPacket goigui = new DatagramPacket(b2,len2,dc2,p2);
				//Gui cho Client
				ds.send(goigui);
			}
		}
		catch(SocketException e) {
			System.out.println("Khoi tao UDP bi that bai");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
	}

}
