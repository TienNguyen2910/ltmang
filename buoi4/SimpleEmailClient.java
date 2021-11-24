package buoi4;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class SimpleEmailClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Nhap tu ban phim
			Scanner kb = new Scanner(System.in);
			System.out.println("Nhap dia chi SMTP Server:");
			String dcserver = kb.nextLine();
			System.out.println("Nhap user:");
			String user = kb.nextLine();
			//Noi ket den SMTP Server
			Socket s = new Socket(dcserver,25);
			//Lay ra 2 Stream  in-out
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			Scanner sc = new Scanner(is);
			
			 //Gui cau lenh HELO den SMTP Server
			pw.println("HELO "+user); pw.flush();
			//Nhan tra loi tu SMTP server
			String kq = sc.nextLine();
			System.out.println(kq);
			
			//Nhap Email gui
			System.out.println("MAIL FROM: ");
			String efrom = kb.nextLine();
			 // Gui cau MAIL FROM cho SMTP Server
			pw.println("MAIL FROM: "+efrom); pw.flush();
			//Nhan tra loi tu SMTP server
			String kq1 = sc.nextLine();
			System.out.println(kq1);
			 	
			//Nhap Email nhan
			System.out.println("RCPT TO: ");
			String ereceive = kb.nextLine();
			 //Gui cau RCPT TO cho SMTP Server
			pw.println("RCPT TO: "+ereceive); pw.flush();
			//Nhan tra loi tu SMTP server
			String kq2 = sc.nextLine();
			System.out.println(kq2);
			
			
			//Du lieu gui cho Server
			System.out.println("DATA");
			pw.println("DATA"); pw.flush();
			//Nhan kq tu server
			String data = sc.nextLine();
			System.out.println(data);
			
			//bat dau viet gmail
			System.out.println("Nhap email gui: ");
			String emailgui = kb.nextLine();
			System.out.println("Nhap email nhan: ");
			String emailnhan = kb.nextLine();
			System.out.println("Nhap subject: ");
			String subject = kb.nextLine();
			System.out.print("\n");
			System.out.println("Nhap noi dung: ");
			String nd = kb.nextLine();
			System.out.println(".");
			
			// gui du lieu cho server
			pw.println("From: "+emailgui);
			pw.println("To: "+emailnhan);
			pw.println("Subject: "+subject);
			pw.println();
			pw.println(nd);
			pw.println(".");
			
			//Nhan tra loi tu SMTP server
			String kq3  = sc.nextLine();
			System.out.println(kq3);
			
			//gui cho SMTP server
			pw.println("QUIT"); pw.flush();
			//nhan tra loi tu SMTP server
			String kq4 = sc.nextLine();
			System.out.println(kq4);
			System.out.println("Da gui email thanh cong");
		} catch(UnknownHostException e) {
			System.out.println("Khong tim thay server");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
	}

}
