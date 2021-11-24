// Nguyen Thi My Tien _ B1809524
package demo;

import java.net.*;
import java.io.*;

 class Clientdocso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				//Ket noi den Server cong 7777
			Socket s=new Socket("Localhost",7777);
			System.out.println("Da ket noi thanh cong voi Server");
				//Lay ra 2 Stream nhan-gui du lieu(in-out)
			InputStream is=s.getInputStream(); //Nhan du lieu tu Server
			OutputStream os=s.getOutputStream(); // Gui du lieu cho Server
			while(true) {
					//Nhan 1 ky tu (0-9) ch tu ban phim 
				System.out.println("Nhap 1 ky tu (0-9): ");
				int ch=System.in.read();
					//Gui du lieu cho Server
				os.write(ch);
				System.in.skip(2);
					//kiem tra dieu kien thoat
				if(ch=='@')	break;
					//Nhan ket qua tra ve tu Server
				byte b[] = new byte[100];
				int n = is.read(b);
					//Hien thi ket qua
				String kq=new String(b,0,n); // chuyen doi mang b sang chuoi
				System.out.println("Nhan duoc: "+kq);
			}
				//Dong noi ket
			s.close();
		}
		catch(UnknownHostException e) {
			System.out.println("Sai dia chi Server");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
	}

}
