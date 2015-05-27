/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class PanggilBank {
    public static void main(String[] args) {
        Bank cekinfo = new Bank();
        Bank set  = new Bank();
        
        cekinfo.check();
        set.setAkun(1234567890, "Summon Agus", 10000);
        set.getAkun();
        
        set.nabung(10000);
        set.getAkun();
        
        set.tarik(5000);
        set.getAkun();
        
        set.trasfer(5000);
        set.getAkun();
        
    }
}
