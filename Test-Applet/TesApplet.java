
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class TesApplet extends Applet {
    private Object fontMetrics;
    @SuppressWarnings("empty-statment")
    @Override
    public void paint(Graphics grafik) {
        Font font = new Font("sanserif", Font.BOLD, 20);
        grafik.setFont(font);
        grafik.setColor(Color.blue);
        
        int xPusat = this.getSize().width/2;
        int yPusat = this.getSize().height/2;
        
        String ucapan = "Selamat Belajar JAVA Applet";
        FontMetrics fontMetrics = this.getFontMetrics(font);
        int posisiX = xPusat-(fontMetrics.stringWidth(ucapan)/2);
        
        grafik.drawString(ucapan, xPusat, yPusat);
    }
}
