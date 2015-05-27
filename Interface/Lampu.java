
/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class Lampu implements IntLampu {
    private int statusLampu = 0;
    
    @Override
    public void hidupkan() {
        if(this.statusLampu == keadaanMati) {
            this.statusLampu = keadaanHidup;
            System.out.println("Lampu Hidup");
        }
        else {
            System.out.println("Lampu Sudah Hidup");
        }
    }
    @Override
    public void redupkan() {
        if(this.statusLampu == keadaanHidup) {
            this.statusLampu = keadaanRedup;
            System.out.println("Lampu Redup");
        }
        else if (this.statusLampu == keadaanMati) {
            this.statusLampu = keadaanRedup;
            System.out.println("Lampu Redup");
        }
        else {
            System.out.println("Lampu sudah Redup");
        }
    }
    @Override
    public void matikan() {
        if(this.statusLampu == keadaanHidup) {
            this.statusLampu = keadaanMati;
            System.out.println("Lampu Mati");
        }
        else {
            System.out.println("Lampu sudah Mati");
        }
    }
}
