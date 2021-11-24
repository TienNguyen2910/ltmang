package demo;

import java.util.Scanner;

public class luythua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x=0;
		String S;
		boolean tem = false; // tem để xác định kiểu nhập
		do {
			System.out.println("Nhap x vao: ");
			S = sc.nextLine();
			try {
				x = Float.parseFloat(S);
				tem = true;
			} catch (Exception e) {
				System.out.println("Nhap sai kieu_Nhap lai:");
				// tem=true;
			}
		} while (tem == false);

		int n=Integer.MAX_VALUE;
		int kt=0;
		do{
			System.out.println("Nhap n vao: ");
			S=sc.nextLine();
			try{
				n=Integer.parseInt(S);
				kt=1;
				if(n<0) {
					kt=0;
					System.out.println("Ban phai nhap so duong");
				}
			}
			catch(Exception e){
				System.out.println("Nhap sai nhap lai !!");
				n=Integer.MAX_VALUE;
			}
		}while((n==Integer.MAX_VALUE)||(kt==0));

		System.out.println(x+"^"+n+"="+Math.pow(x,n));
	}
}
