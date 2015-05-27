/*
This class to call CheckUser.java
@author Summon Agus
@blog bloggersmart.net
*/
public class callCekUser {
	public static void main(String[] args) {
		CekUser cek = new CekUser("Admin", "Admin");
		cek.apakahAdmin();
		
		CekUser cek1 = new CekUser("Summon", "Agus", null, null);
		cek1.apakahAdmin();
	}
}
/*
* // Result of Output 
* Wrong, you not Admin!
* id = Summon; password = Agus; ----> True, Welcome Admin
*/
