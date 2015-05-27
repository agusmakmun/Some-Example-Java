
/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
interface IntLampu {
    public static final int keadaanHidup = 2; //mengganti variable menjadi 2
    public static final int keadaanRedup = 1; //menambah variable redup
    public static final int keadaanMati = 0;
    
    public abstract void hidupkan();
    public abstract void redupkan(); //menambah method baru berupa redupkan()
    public abstract void matikan();
}
