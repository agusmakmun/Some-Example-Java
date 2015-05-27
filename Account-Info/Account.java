/*
Ini adalah Account.java yang merupakan sub class dari Mahasiswa.java.
Lihat induk classnya (Mahasiswa.java)    : https://github.com/agusmakmun/Some-Example-Java/blob/master/Account-Info/Mahasiswa.java
Lihat pemanggilannya (aksesAccount.java) : https://github.com/agusmakmun/Some-Example-Java/blob/master/Account-Info/aksesAccount.java
@author Summon Agus (L200130113)
@blog bloggersmart.net
*/
 
public class Account extends Mahasiswa {
	protected String username;
	protected int password;
	protected String deegree;
	
	public Account (String firstName, String lastName, String username, int password) {
		super(firstName, lastName);
		this.username = username;
		this.password = password;
	}
	public Account (String firstName, String lastName, String deegree) {
		super(firstName, lastName);
		this.deegree = deegree;
	}
	public void infoAccount() {
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		super.getFullName();
	}
	public void getNameWithDegree() {
		super.getFullName();
		System.out.print(deegree);
	}
}
