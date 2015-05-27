
/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
import java.awt.*;
import java.applet.Applet;

public class tesParameter extends Applet {
    String nama;
    
    @Override
    public void init() {
        nama = getParameter("nama");
        if (nama == null)
            nama = "Coy";
    nama = "Hai "+nama+ " !!!";
    }
    @Override
    public void paint (Graphics grafik) {
        grafik.drawString(nama, 10, 25);
    }
}
