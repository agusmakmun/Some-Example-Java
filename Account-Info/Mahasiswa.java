/*
Ini adalah class Mahasiswa sebagai induk utamanya.
Lihat sub classnya (Account.java)        : https://github.com/agusmakmun/Some-Example-Java/blob/master/Account-Info/Account.java
Lihat pemanggilannya (aksesAccount.java) : https://github.com/agusmakmun/Some-Example-Java/blob/master/Account-Info/aksesAccount.java
@author Summon Agus (L200130113)
@blog bloggersmart.net
*/
 
public class Mahasiswa {
	private String firstName, lastName, NIM, HBD, kelamin, alamat;
	
	public Mahasiswa(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Mahasiswa(String firstName, String lastName, String NIM, 
					 String HBD, String kelamin, String alamat) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.NIM = NIM;
		this.HBD = HBD;
		this.kelamin = kelamin;
		this.alamat = alamat;
	}
	protected void getFullName() {
		System.out.print("Full Name: "+ firstName+" "+lastName); //tidak menggunakan println
	}
	public void infoMahasiswa() {
		System.out.println("Nama    : "+firstName+" "+lastName);
		System.out.println("NIM     : "+NIM);
		System.out.println("HBD     : "+HBD);
		System.out.println("Kelamin : "+kelamin);
		System.out.println("Alamat  : "+alamat);
	}
}
