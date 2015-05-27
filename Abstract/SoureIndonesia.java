
/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class SoureIndonesia extends Indonesia {
    SoureIndonesia (String indonesiaKu) {
        this.indonesiaKu = indonesiaKu;
    }

    /**
     * Apabila terjadi 2 method yang sama, maka diberi @Override
     */
    @Override
    public void Kebangsaan() {
        System.out.println(this.indonesiaKu+" raya adalah lagu kebangsaan republik "+this.indonesiaKu);
        System.out.println(this.indonesiaKu+" raya pertama kali diumumkan pada upacara bendera 17 Agustus 1945");
        System.out.println(this.indonesiaKu+" raya dipilih sebagai lagu kebangsaan ketika "+this.indonesiaKu+" memproklamasikan kemerdekaan.");
    }
}
