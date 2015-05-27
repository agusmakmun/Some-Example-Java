
/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class TesLampuInterface {
    public static void main(String[] args) {
        Lampu lampuKamar = new Lampu();
        lampuKamar.hidupkan();
        lampuKamar.hidupkan();
        lampuKamar.matikan();
        lampuKamar.matikan();
        lampuKamar.hidupkan();
        lampuKamar.redupkan(); //menampilkan method baru berupa redupkan()
        lampuKamar.redupkan();
    }
}
