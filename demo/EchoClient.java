package demo;

import java.io.*;
import java.net.*;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Noi ket den Echo Server (cong 7)
			Socket s = new Socket("127.0.0.1", 7);
			// Lay ra 2 Stream nhan-gui du lieu (in-out)
			InputStream is = s.getInputStream(); // Nhan dl tu Server
			OutputStream os = s.getOutputStream(); // Gui dl cho Server
			while (true) {
				// Nhap 1 ky tu ch tu ban phim
				System.out.println("Nhap 1 ky tu: ");
				int ch = System.in.read();
				// Gui ky tu ch qua Server
				os.write(ch);
				System.in.skip(2); //Loai bo trong buffer \r\n
				//kiem tra dieu kien
				if(ch=='@')	break;
				// Nhan ket qua tra ve tu Server
				int ch1 = is.read();
				// Hien thi ket qua ra man hinhf
				System.out.println("Nhan duoc : " + (char) ch1);
			}
			// Dong noi ket
			s.close();
		} catch (UnknownHostException e) {
			System.out.println("Sai dia chi Server");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
