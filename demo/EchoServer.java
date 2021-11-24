// Nguyen Thi My Tien _ B1809524
package demo;

import java.net.*;
import java.io.*;

public class EchoServer {
	public static void main(String[] args) {
		try {
			//Tao Server Socket pv o cong 7
			ServerSocket ss=new ServerSocket(7);
			System.out.println("Da khoi tao xong Server cong 7");
			while(true) { //phuc vu cho nheu Client
				//Chap nhan cho 1 Client noi ket
				Socket s=ss.accept();
				System.out.println("Co 1 Client noi ket");
				//lay ra Stream nhan-gui(in-out)
				InputStream is=s.getInputStream();
				OutputStream os=s.getOutputStream();
				while(true) { //Phuc vu cho 1 Client nhieu lan
					//Nhan yeu cau tu Client
					int ch=is.read();
					System.out.println("Nhan duoc tu Client: "+ch);
					//kiem tra dieu kien de thoat ra
					if(ch=='@')	break;
					//Xu ly yeu cau
					int ch1=ch;
					//Gui ket qua phuc vu cho Client 
					os.write(ch1);
				}
				//Dong noi ket
				s.close();
				System.out.println("   Da dong noi ket voi 1 Client");
			}
			//ss.close();
		}
		catch(IOException e) {
			System.out.println("Khong khoi tao duoc Server");
		}
	}
}
