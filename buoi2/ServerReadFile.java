//Nguyen Thi My Tien, B1809524
package buoi2;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ServerReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Khoi tao Server Socket cong 123
			ServerSocket ss=new ServerSocket(123);
			System.out.println("Da khoi tao thanh cong Server cong 123");
			//Chap nhan noi ket
			Socket s=ss.accept();
			//lay ra 2 Stream nhan gui
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			Scanner sc=new Scanner(is);
			PrintWriter pw=new PrintWriter(os);
			//Nhan cau lenh READ tu Client
			String caulenh=sc.nextLine(); 
				////Xu ly yeu cau
			//lay ra ten file
			String tenfile=caulenh.substring(5);
			//doc noi dung file
			FileInputStream fin=null;
			fin=new FileInputStream(tenfile);
			System.out.println("Noi dung file: ");
			byte b[]=new byte[1000];
			int n=fin.read(b); // so luong byte trong noi dung file
			String str=new String(b,0,n);
			System.out.println(str);
			//Gui ket qua 
			pw.println(str); pw.flush();
			//Dong noi ket
			s.close();
			ss.close();
		}
		catch(IOException e) {
			System.out.println("Khong khoi tao duoc Server");
		}
	}

}
