package demo;
import java.io.*;
import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream filein=null;
		FileOutputStream fileout=null;
		Scanner sc=new Scanner(System.in);
		try {
			String nguon,dich;
			System.out.println("Nhap duong dan file can doc: ");
			nguon=sc.nextLine();
			filein=new FileInputStream(nguon);
			System.out.println("Nhap duong dan dich:");
			dich=sc.nextLine();
			fileout=new FileOutputStream(dich);
			
			byte[] b=new byte[50000];
			int n=filein.read(b);
			System.out.println("Do dai file n = "+n);
			
			//ghi file
			fileout.write(b);
		}
		catch(FileNotFoundException e) {
			System.out.println("Khong tim thay file");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
	}

}
