// Nguyen thi My Tien, b1809524
package buoi2;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client_hten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Ket noi voi Server cong 2910
			Socket s = new Socket("localhost", 2910);
			System.out.println("Da ket noi thanh cong voi Server");
			// Lay ra 2 Stream nhan gui du lieu(in-out)
			InputStream is = s.getInputStream(); // Nhan du lieu tu Server
			OutputStream os = s.getOutputStream(); // Gui du lieu cho Server
			Scanner sc = new Scanner(is);
			PrintWriter pw = new PrintWriter(os);
			// Nhan 1 chuoi tu ban phim ho va ten
			Scanner kb = new Scanner(System.in);
			while(true) {
				System.out.println("Nhan 1 chuoi ho va ten: ");
				String hoten = kb.nextLine();
				// Gui du lieu cho Server
				pw.println(hoten);
				pw.flush();
				// Kiem tra dieu kien thoat
				if(hoten.equals("exist")) break;
				// Nhan ket qua tu Server
				String ho, ten,chuLot;
				ho = sc.nextLine();
				chuLot=sc.nextLine();
				ten = sc.nextLine();
				System.out.println("Ho : " + ho);
				System.out.println("Chu lot: "+chuLot);
				System.out.println("Ten: " + ten);
			}
			// Dong ket noi
			s.close();
		} catch (UnknownHostException e) {
			System.out.println("Sai dia chi Server");
		} catch (IOException e) {
			System.out.println("Loi nhap xuat");
		}

	}

}
