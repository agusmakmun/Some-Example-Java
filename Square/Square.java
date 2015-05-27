/*
Some script for check Square, example long, width, circumference, and other.
@author Summon Agus
@blog bloggersmart.net - python.web.id
*/
 
public class Square { 
  private int panjang = 20; //ganti dengan double untuk melihat perubahannya.
  private int lebar = 10; 
 
  public void setPanjang(int panjang) { 
    this.panjang = panjang; 
  }
  public void setLebar(int lebar) { 
    this.lebar = lebar; 
  }
  public double getPanjang() { 
  	return panjang; 
  }
  public double getLebar() { 
  	return lebar; 
  }
  public double getLuas() { 
  	return panjang * lebar; 
  }
  public double getKeliling() { //double akan terdapat .0
  	return 2*panjang + 2*lebar; 
  }
  public void showValue() {     
    System.out.println("\nPanjang segi empat = "+panjang);
    System.out.println("Lebar segi empat = "+lebar);
    System.out.println("Luas segi empat = "+getLuas());
    System.out.println("Keliling segi empat = "+getKeliling());
  }
}
