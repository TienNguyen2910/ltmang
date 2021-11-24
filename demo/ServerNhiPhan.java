package demo;

import java.net.*;
import java.io.*;

public class ServerNhiPhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Khoi tao Server Socket cong 188
			ServerSocket ss = new ServerSocket(188);
			System.out.println(" Da khoi tao thanh cong Server cong 188");
			while (true) {// Phuc vu nhieu Client
				// Chap nhan 1 Client ket noi
				Socket s = ss.accept();
				System.out.println("Co 1 Client noi ket");
				// Lay ra Stream nhan-gui(in-out)
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				while (true) { // phuc vu cho Client nhieu lan
					try {
						String str1 = ""; // Ham chua chuoi nhi phan
						try {
							// Nhan yeu cau tu Client
							byte b[] = new byte[400];
							int ch = is.read(b);
							String str = new String(b, 0, ch);
							System.out.println("Da nhan tu Client: " + str);
							// kiem tra dieu kien thoat
							if (str.equals("@"))
								break;
							int chuyen = Integer.valueOf(str); // chuyen kieu chuoi sang kieu int
							// Xu ly yeu cau
							// System.out.println("Du lieu chuyen: "+chuyen);
							str1 = Integer.toBinaryString(chuyen);
							System.out.println("Chuoi nhi phan: " + str1);
						} catch (NumberFormatException e) {
							str1 = "Khong phai la so nguyen";
						}

						// Gui ket qua cho Client
						byte b1[] = str1.getBytes();
						os.write(b1);
					} catch (Exception e) {
						break;
					}
				}
				// Dong noi ket
				s.close();
				System.out.println("   Da dong noi ket 1 Client");
			}
			// ss.close();
		} catch (IOException e) {
			System.out.println("Khong khoi tao duoc Server");
		}

	}

}
