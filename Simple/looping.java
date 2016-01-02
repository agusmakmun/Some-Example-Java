/**
 * @author agaust
 */

public class Perulangan {
    public static void main(String[] args) {
	//1. binary string
	String binaryString1 = "1010";
        System.out.println(binaryString1 + " Output decimalnya adalah: "+Integer.parseInt(binaryString1,2));

        
        //2. ini binary to decimal dengan integer method
        int decimal = 0;
        int p = 0;
        int bin = 1010;
        
        while(true){
          if(bin == 0){
            break;
          } else {
              int temp = bin%10;
              decimal += temp*Math.pow(2, p);
              bin = bin/10;
              p++;
           }
        }
        System.out.println("1010  --> Decimalnya adalah: " + decimal);


        //3. do while
        System.out.println("------ Do While --------");
        int a = 0;
        do {
            System.out.println("Perulangan ke: " + a);
            a++;
        }while(a < 5);
        

        //4. while  
        System.out.println("------ While --------");        
        int count = 1;
        while (count < 5) {
            System.out.println("Perulangan ke: " + count);
            count++;
        }

        //5. for
        System.out.println("------ For --------");
        for(int i=0 ; i < 5 ; i++) {
            System.out.println("Perulangan ke: " + i);
        }
    }
}
