package demo;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

//Ä‘á»�c háº¿t ná»™i dung file vÃ o máº£ng byte[], sau Ä‘Ã³ chuyá»ƒn Ä‘á»•i máº£ng byte[] thÃ nh String vÃ  hiá»ƒn thá»‹ String ra mÃ n hÃ¬nh.
public class bai3 {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Ban hay nhap duong dan vao: ");
		String des;
		des=sc.nextLine();
		FileInputStream fil= null;
		
		try {
			fil=new FileInputStream(des);
			byte b[]=new byte[100]; // táº¡o vÃ¹ng Ä‘á»‡m cho máº£ng, dá»± kiáº¿n khÃ´ng quÃ¡  100 kÃ½ tá»±
			int n=fil.read(b); //dá»¯ liá»‡u nháº­p vÃ  lÆ°u vÃ o máº£ng b[]
			String str=new String(b,0,n); //chuyá»ƒn dá»•i tá»« máº£ng b[] sang chuá»—i
			System.out.println("Noi dung file: ");
				System.out.print(str);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
