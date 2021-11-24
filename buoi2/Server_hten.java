//Nguyen Thi My Tien, B1809524
package buoi2;

import java.net.*;
import java.io.*;
import java.util.Scanner;

class PhucVuHoTen extends Thread{
	Socket s;
	public PhucVuHoTen(Socket s1) {
		s=s1;
	}
	public void run() {
		try {
			//Lay 2 Stream nhan gui (in-out)
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			Scanner sc=new Scanner(is);
			PrintWriter pw=new PrintWriter(os);
			while(true) {
				//Nhan yeu cau tu Client
				String hoten=sc.nextLine();
				//Xu ly yeu cau
				String ho,chuLot,ten;
					//loai bo khoang cach dau va cuoi
				hoten=hoten.trim();
				System.out.println("Da nhan tu Client chuoi ho va ten: "+hoten);
				if(hoten.equals("exist")) break;
					//tach Ho ra
				ho=hoten.substring(0, hoten.indexOf(" "));
				System.out.println("Ho da xu ly: "+ho);
				chuLot=hoten.substring(hoten.indexOf(" "),hoten.lastIndexOf(" "));
				System.out.println("Chu lot: "+chuLot);
				ten=hoten.substring(hoten.lastIndexOf(" "), hoten.length());
				System.out.println("Ten: "+ten);
				//Gui ket qua cho Client
				pw.println(ho); pw.flush();
				pw.println(chuLot); pw.flush();
				pw.println(ten); pw.flush();
			}
			//Dong noi ket
			s.close();
			System.out.println(" Da dong noi ket voi 1 Client");
		}catch(IOException e) {
			System.out.println("Co loi khi dang phuc vu 1 Client");
		}
	}
}
 class Server_hten {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Tao cong Server Socket 2910
			ServerSocket ss=new ServerSocket(2910);
			System.out.println(" Da khoi tao thanh cong Server cong 2910");
			while(true) {
				//Chap nhan noi ket
				Socket s=ss.accept();
				System.out.println("  Co 1 Client ket noi");
				PhucVuHoTen pv=new PhucVuHoTen(s);
				pv.start();
			}
			//ss.close();
		}
		catch(IOException e) {
			System.out.println("Khong khoi tao duoc Server");
		}
	}

}

