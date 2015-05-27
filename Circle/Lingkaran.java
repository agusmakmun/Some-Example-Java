/**
 * @author agaust
 * @blog bloggersmart.net - python.web.id
 */
public class Lingkaran {
    private double radius;
    
    //methode
    void isiJariJari(double radius) {
        this.radius = radius;
    }
    
    //private dan public conditional
    //private double ambilPhi(){
    public double ambilPhi(){
        return 3.14;
    }
    public double hitungKeliling() {
        return 2*ambilPhi() * radius;
    }
}
