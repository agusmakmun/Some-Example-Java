
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class tesNama extends Applet {
    private Object fontMetrics;
    @SuppressWarnings("empty-statment")
    @Override
    public void paint(Graphics grafik) {
        Font font = new Font("sanserif", Font.BOLD, 20);
        grafik.setFont(font);
        grafik.setColor(Color.red);
        
        int xPusat = this.getSize().width/2;
        int yPusat = this.getSize().height/2;
        
        String nama = "Nama: Agus Makmun";
        String nim = "NIM: L200130113";
        String smt = "Smt: Semester sekarang";

        FontMetrics fontMetrics = this.getFontMetrics(font);
        int posisiX = xPusat-(fontMetrics.stringWidth(nama)/2);
        //int posisiY = xPusat-(fontMetrics.stringWidth(nama)/2);
        //int posisiZ = xPusat-(fontMetrics.stringWidth(nama)/2);
        
        grafik.drawString(nama, posisiX, yPusat);
        grafik.drawString(nim, posisiX, yPusat+20);
        grafik.drawString(smt, posisiX, yPusat+40);
    }
}
