package buoi5;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
 class FileRMIServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//khoi tao co che bao mat RMI
			if(System.getSecurityManager()==null)
				System.setSecurityManager(new RMISecurityManager());
			//khoi tao doi tuong cho phep goi tu xa
			FileRMI obj=new FileRMI();
			System.out.println("Da khoi tao thanh cong doi tuong goi tu xa");
			//Dang ky doi tuong cho phep goi tu xa
			Naming.rebind("file", obj);
			System.out.println("Da dang ky xong doi tuong goi tu xa");
		}
		catch(RemoteException e) {
			System.out.println("Loi khi goi ham tu xa");
		}
		catch(MalformedURLException e) {
			System.out.println("Sai ten dang ky");
		}
	}

}
