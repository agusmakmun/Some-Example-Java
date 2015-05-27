/*
This script for check admin or not, with 2 different constructor. 
@author Summon Agus
@blog bloggersmart.net
*/
 
public class CheckUser {
	String idku = "Summon";
	String passwordku = "Agus";
	
	String id;
	String password;
	String nama;
	String admin;
	
	public CekUser (String id, String password) {
		this.id = id;
		this.password = password;
	}
	public CekUser (String id, String password, String nama, String admin) {
		this.id = id;
		this.password = password;
		this.nama = nama;
		this.admin = admin;
	}
	public boolean apakahAdmin() {		
		if (id.equals(idku) && password.equals(passwordku)) {
			System.out.println("id = "+id+ "; password = "+password+"; ----> True, Welcome Admin");
			return true;
		}
		else {
			System.out.println("Wrong, you not Admin!");
			return false;
		}
	}
 
}

/*
* // Result of Output 
* Wrong, you not Admin!
* id = Summon; password = Agus; ----> True, Welcome Admin
*/
