
/**
 * @author agaust
 * @blog bloggersmart.net
 */
import java.awt.*;
import java.applet.Applet;

public class tesParameter2 extends Applet {
    private String nama, nim, jurusan, semester;
    
    @Override
    public void init() {
        nama = getParameter("nama");
        nim = getParameter("nim");
        jurusan = getParameter("jurusan");
        semester = getParameter("semester");
        
        nama=nama == null ?"Agus Makmun": nama;
        nim=nim == null ?"L200130113": nim;
        jurusan=jurusan == null ?"Teknik Informatika": jurusan;
        semester=semester == null ?"Semester 4": semester;
    }
    
    @Override
    public void paint (Graphics grafik) {
        grafik.drawString(nama, 25, 20);
        grafik.drawString(nim, 25, 40);
        grafik.drawString(jurusan, 25, 60);
        grafik.drawString(semester, 25, 80);
    }
}
