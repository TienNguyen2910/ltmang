package buoi3;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ClientTalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			//Tao UDP Socket 
			DatagramSocket ds = new DatagramSocket();
			//Nhap 1 chuoi tu ban phim
			Scanner kb = new Scanner(System.in);
			while(true) {
				System.out.print("Client: ");
				String dl = kb.nextLine();
				//Dong goi du lieu vua nhap
				byte b[] = dl.getBytes();
				int len = b.length;
				InetAddress dc = InetAddress.getByName("localhost");
				int p = 2910;
				DatagramPacket goigui = new DatagramPacket(b,len,dc,p);
				//Gui goi qua Server
				ds.send(goigui);
				if(dl.equals(""))	break;
				//Tao ra UDP dung de nhan
				byte b1[] = new byte[60000];
				DatagramPacket goinhan = new DatagramPacket(b1,60000);
				//Nhan goi tra loi Server
				ds.receive(goinhan);
				//Hien thi ket qua cua goi
				byte b2[] = goinhan.getData();
				int len2 = goinhan.getLength();
				String ketqua = new String(b2,0,len2);
				System.out.println("Server: "+ketqua);
			}
			//Dong Socket
			ds.close();
		}
		catch(SocketException e) {
			System.out.println("Khoi tao UDP bi that bai");
		}
		catch(UnknownHostException e) {
			System.out.println("Sai dia chi");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
	}

}
