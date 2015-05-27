/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class Bank {
    public int Saldo;
    public int noRek;
    public String nama;
    
    public void setAkun(int norek, String nama, int saldo){
        this.noRek = norek;
        this.nama = nama;
        this.Saldo = saldo;    
    }
    public void check() {
        System.out.println("Berhasil Check...");
    }
    
    public void getAkun(){
        System.out.println("No Rek :" + this.noRek);
        System.out.println("Nama   :" + this.nama);
        System.out.println("Saldo  :" + this.Saldo);
        System.out.println("---------------------");
    }
    
    public void nabung(int nabung){
        this.Saldo += nabung;
    }
    
    public void tarik(int tarik){
        this.Saldo -= tarik;
    }
    
    public void trasfer(int transfer){
        this.Saldo -= transfer;
    }
    
    public int getSaldo(){
        return this.Saldo;
    }
}
