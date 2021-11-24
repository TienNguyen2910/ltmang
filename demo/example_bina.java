package demo;

import java.io.*;
import java.util.Scanner;

public class example_bina {
	public static String toBinary(int n) {
		String s = "";
		while (n > 0) {
			s=(((n%2)== 0)? "0":"1")+s;
			n=n/2;
		}
		return s;
	}

	public static void main(String[] args) {
		//try {
			System.out.println("Nhap vao 1 chuoi so nguyen: ");
//			byte b[] = new byte[400];
//			int str = System.in.read(b);
//			System.in.skip(2);
			String str;
			Scanner sc=new Scanner(System.in);
			str=sc.nextLine();
			int c=Integer.parseInt(str);
			String s=Integer.toBinaryString(c);
			String s1=toBinary(c);
			System.out.println("Chuyen nhi phan bang ham co san: " + s);
			System.out.println("Viet ham chuyen nhi phan: " + s);
//		} catch (IOException e) {
//			System.out.println("Loi nhap xuat");
//		}

	}
}
