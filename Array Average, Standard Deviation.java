import java.util.Scanner;
/**
 * @author agaust
 * thanks to: gunawan ariyanto
 */
public class NewArray {
    public static void main (String [] args) {
        String[] nama = {"Prabowo", "Cameron", "Beni"};
        int[] nilai = new int[nama.length];
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nilai "+nama[i]+" : ");
            nilai[i] = x.nextInt();
        }
        System.out.println("Rata-rata: "+jumlah(nilai)/nilai.length);
        System.out.println("STD: "+deviasi(nilai));
    }
    private static double jumlah(int[] nilai) {
        double total = 0.0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }
    private static double deviasi(int[] nilai) {
        double hasil = 0.0;
        double retara = jumlah(nilai)/ nilai.length;
        for (int i = 0; i < nilai.length; i++) {
            hasil += Math.pow(nilai[i]-retara,2);
        }
        return Math.sqrt(hasil/nilai.length);
    }
}
//Output:
run:
Masukkan nilai Prabowo : 90
Masukkan nilai Cameron : 80
Masukkan nilai Beni : 70
Rata-rata: 80.0
STD: 8.16496580927726
BUILD SUCCESSFUL (total time: 6 seconds)
