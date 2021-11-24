//Nguyen Thi My Tien, b1809524
package buoi2;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class ClientReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ket noi Server cong 123
			Socket s=new Socket("localhost",123);
			//Lay ra 2 Stream nhan-gui (in-out)
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			Scanner sc=new Scanner(is);
			PrintWriter pw=new PrintWriter(os);
			//nhap tu ban phim ten file can doc
			Scanner kb=new Scanner(System.in);
			System.out.println("Nhap ten file tu ban phim can doc:");
			String tenfile=kb.nextLine();
			//gui cau lenh:"READ tenfile" qua Server
			String caulenh="READ "+ tenfile;
			pw.println(caulenh); pw.flush();
			////Nhan ket qua tra ve tu Server
			//Nhan noi dung file
			String str=sc.nextLine();
			System.out.println("Noi dung file duoc nhan tu Server:\n"+str);
			FileOutputStream fileout =null;
			FileInputStream filein=null;
			String desClient="file_client.txt";
			fileout=new FileOutputStream(desClient);
				//Ghi file
			byte[] b=str.getBytes();
			fileout.write(b);
				//Hien thi noi dung file da doc
			System.out.println("  Noi dung file da ghi vao Client: ");
			filein=new FileInputStream(desClient);
			byte[] b1=new byte[2000];
			int n=filein.read(b1);
			String chuoi=new String(b1,0,n);
			System.out.println(chuoi);
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
