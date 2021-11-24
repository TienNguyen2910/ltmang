package buoi5;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Tim doi tuong tu xa
			HelloItf ref = (HelloItf)Naming.lookup("rmi://127.0.0.1/ABC"); //URL
			System.out.println("Da tim duoc doi tuong ABC");
			//Goi ham tu xa
			String kq = ref.SayHello();
			System.out.println("Ket qua la: "+kq);
		}
		catch(NotBoundException e) {
			System.out.println("Khong tim duoc doi tuong ABC");
		}catch(RemoteException e) {
			System.out.println("Loi tu xa");
		}catch(MalformedURLException e) {
			System.out.println("Sai dinh dang URL tim kiem");
		}
	}

}
