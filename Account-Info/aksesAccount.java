/*
Ini adalah class aksesAccount.java yang digunakan sebagai ->
pengakses dari class Mahasiswa.java dan sub class Account.java
Lihat induk classnya (Mahasiswa.java) : 
Lihat sub classnya (Account.java)     : 
@author Summon Agus (L200130113)
@blog bloggersmart.net
*/
 
public class aksesAccount {
	public static void main(String[] args) {
		Account akun = new Account("Agus", "Makmun", "agus", 12345);
		akun.infoAccount();
		
		System.out.println("\n");
		
		Account lulusan = new Account("Agus", "Makmun", ".S.KOM");
		lulusan.getNameWithDegree();
		
		System.out.println("\n");
		
		Mahasiswa infoku_all = new Mahasiswa("Agus", "Makmun","L200130113", "18 Agustus 1994", "Laki-laki", "Palembang");
		infoku_all.infoMahasiswa();
	}
}
 
 
//Outputnya:
/*
Username : agus
Password : 12345
Full Name: Agus Makmun

Full Name: Agus Makmun.S.KOM

Nama    : Agus Makmun
NIM     : L200130113
HBD     : 18 Agustus 1994
Kelamin : Laki-laki
Alamat  : Palembang

*/
