/*
This class to call CheckUser.java
@author Summon Agus
@blog bloggersmart.net
*/
public class callCekUser {
	public static void main(String[] args) {
		CheckUser cek = new CheckUser("Admin", "Admin");
		cek.apakahAdmin();
		
		CheckUser cek1 = new CheckUser("Summon", "Agus", null, null);
		cek1.apakahAdmin();
	}
}
/*
* // Result of Output 
* Wrong, you not Admin!
* id = Summon; password = Agus; ----> True, Welcome Admin
*/
