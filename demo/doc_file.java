package demo;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
public class doc_file {
// fin.read(): đọc từng ký tự từ file
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập đường dẫn và tên file: ");
		String url;
		url=sc.nextLine();
		
		FileInputStream fin=null;
		try {
			fin=new FileInputStream(url);
			System.out.println("Nội dung file: ");
			int cha;
			while((cha=fin.read())!=-1) // chuyen đổi nội dung mã ascii thành chuỗi
				System.out.print((char)cha);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fin!= null)
				fin.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
