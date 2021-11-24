package demo;
import java.util.Scanner;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
public class bai4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner scanner=null;
		
		FileInputStream fin=null;
		String des;
		System.out.println("Bạn hãy nhập đường dẫn vào: ");
		try {
			//nhap duong dan
			des=sc.nextLine();
			fin=new FileInputStream(des);
			scanner=new Scanner(fin);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//xử lý xuất file
		if(!scanner.hasNextLine())
			System.out.println("File rỗng");
		else {
			while(scanner.hasNextLine()) {
				String line=scanner.nextLine();
				System.out.println(line);
			}
			System.out.println("NoSuchElementException");
	
		}
	}
}
