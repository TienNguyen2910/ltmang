package buoi4;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MulticastFileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			//Tao Multicast Socket cong 2910
			MulticastSocket ms = new MulticastSocket(2910);
			//Tham gia vao dia chi 230.0.0.2
			InetAddress dc = InetAddress.getByName("230.0.0.2");
			ms.joinGroup(dc);
			
			//Nhan ten file can luu
			Scanner kb = new Scanner(System.in);
			System.out.println("Nhap ten file can luu cuc bo vao: ");
			String tenfileluu = kb.nextLine();
			//Nhan goi phuc vu
			byte b[] = new byte[60000];
			DatagramPacket goinhan = new DatagramPacket(b,60000);
			ms.receive(goinhan);
			//Hien thi thong tin
			//lay thong tin trong goi nhan
			byte b2[] = goinhan.getData();
			int len2 = goinhan.getLength();
			String nd = new String(b2,0,len2);
			System.out.println("Noi dung file nhan tu Server: "+nd);
			if(len2==0)	System.out.println("File rong");
			else {
				//Luu thanh file
				FileOutputStream f = new FileOutputStream(tenfileluu);
				f.write(b2,0,len2);
				System.out.println("Da ghi file thanh cong");
				f.close();
			}
			//Roi khoi nhom
			ms.leaveGroup(dc);
			//Dong Socket lai
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
