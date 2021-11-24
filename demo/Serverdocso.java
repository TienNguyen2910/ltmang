// Nguyen Thi My Tien _ B1809524
package demo;
import java.io.*;
import java.net.*;
public class Serverdocso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				//Tao Server Socket phuc vu cong 7777
			ServerSocket ss=new ServerSocket(7777);
			System.out.println("Da khoi tao xong Server cong 7777");
			while(true) {	//phuc vu cho nhieu Client
					//Chap nhan 1 Client noi ket
				Socket s=ss.accept();
				System.out.println(" Co 1 Client noi ket");
					//Lay ra Stream nhan-gui(in-out)
				InputStream is=s.getInputStream();
				OutputStream os=s.getOutputStream();
				while(true) {	// Phuc vu cho Client nhieu lan
						//Nhan yeu cau tu Client
					int ch=is.read();
					System.out.println("Nhan duoc tu Clien: "+ch);
						//Kiem tra dieu kien thoat
					if(ch=='@') break;
						//Xu ly yeu cau 
					String kq = "Khong biet";
					switch(ch) {
					case '0': kq="Khong"; break;
					case '1': kq="Mot"; break;
					case '2': kq="Hai"; break;
					case '3': kq="Ba"; break;
					case '4': kq="Bon"; break;
					case '5': kq="Nam"; break;
					case '6': kq="Sau"; break;
					case '7': kq="Bay"; break;
					case '8': kq="Tam"; break;
					case '9': kq="Chin"; break;
					}
						//Gui ket qua phuc vu cho Client
					byte b[]=kq.getBytes();
					os.write(b);
				}
					//Dong noi ket
				s.close();
				System.out.println("    Da dong 1 ket noi voi Client");
			}
			//ss.close();
		}
		catch(IOException e) {
			System.out.println("Khong khoi tao duoc Server");
		}
	}

}
