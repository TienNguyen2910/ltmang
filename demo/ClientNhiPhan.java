// Nguyen Thi My Tien _ B1809524
package demo;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class ClientNhiPhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
				//ket noi den Server cong 188
			Socket s=new Socket("127.0.0.1",188);
			System.out.println(" Da ket noi thanh cong voi Server");
				//Lay ra 2 Stream nhan-gui du lieu(in-out)
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			while(true) {
					//Nhan 1 chuoi str tu ban phim
				byte b[]=new byte[200];
				System.out.println("Nhap 1 chuoi so nguyen: ");
				String str=sc.nextLine();
					//chuyen chuoi sang byte
				b=str.getBytes();
				//kiem tra dieu kien thoat
				if(str.equals("@")) break;
					//Gui du lieu cho Server
				os.write(b);
					//Nhan ket qua tra ve tu Server
				byte b1[]=new byte[500];
				int n=is.read(b1);
					//Hien thi ket qua
				String kq=new String(b1,0,n);
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
