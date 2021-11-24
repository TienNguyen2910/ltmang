package buoi4;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MulticastFileServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Tao UDP Socket
			DatagramSocket ds = new DatagramSocket();
			// Nhap ten file can gui
			Scanner kb = new Scanner(System.in);
			System.out.println("Nhap ten file can gui: ");
			String tenfile = kb.nextLine();
			int count =1;
			while (true) {
				// Doc noi dung file
				File f = new File(tenfile);
				if (f.exists() && f.isFile()) {
					int len1 = (int) f.length(); // doc kich thuoc file
					System.out.println("Kich thuoc file: " + len1);
					FileInputStream f1 = new FileInputStream(tenfile);
					byte b2[] = new byte[len1];
					int len2 = f1.read(b2);
					String nd = new String(b2, 0, len2);
					System.out.println("Noi dung file chuan bi gui: " + nd);
					f1.close();
					InetAddress dc2 = InetAddress.getByName("230.0.0.2");
					int p2 = 2910;
					// Dong goi UDP
					DatagramPacket goigui = new DatagramPacket(b2, len2, dc2, p2);
					// Gui goi cho nhom dia chi 230.0.0.2, cong 2910
					ds.send(goigui);
					System.out.println("    Da gui thanh cong goi thu "+count);
					Thread.sleep(30000);
				}
			}

		} catch (SocketException e) {
			System.out.println("Khong khoi tao duoc UDP");
		} catch (FileNotFoundException e) {
			System.out.println("Loi khong tim thay file");
		} catch (IOException e) {
			System.out.println("Loi nhap xuat");
		} catch (InterruptedException e) {
			System.out.println("Loi xay ra khi tam dung");
		}
	}

}
