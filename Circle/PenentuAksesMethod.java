/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class PenentuAksesMethod {
    public static void main (String [] args) {
        Lingkaran bulatan = new Lingkaran();
        
        //mengisi jari-jari lingkaran
        bulatan.isiJariJari(10);
        
        //menampilkan keliling lingkaran
        System.out.println("Keliling = "+bulatan.hitungKeliling());
        
        //Menampilkan nilai Phi
        System.out.println("Nilai Phi = "+bulatan.ambilPhi()); //notif kesalahan disini
    }
}
/*
--> Output:
run:
Keliling = 62.800000000000004
Nilai Phi = 3.14
BUILD SUCCESSFUL (total time: 0 seconds)
*/
