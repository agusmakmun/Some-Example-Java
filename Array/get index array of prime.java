import java.util.*;

public class HelloWorld{
     public static void main(String []args){
        int i =0;
        int num =0;
        
        String  primeNumbers = "";
        
        for (i = 1; i <= 100; i++) {               
              int counter=0;      
              for(num =i; num>=1; num--) {
                 if(i%num==0) {
                     counter = counter + 1;
                 }
              }
              if (counter ==2) {
                  //Appended the Prime number to the String
                  primeNumbers = primeNumbers + i + ",";
              }
        }
        //System.out.println(primeNumbers);
        
        String _prime = primeNumbers;
        //System.out.println(_prime);
        
        List<String> myList = new ArrayList<String>(Arrays.asList(_prime.split(",")));
        //System.out.println(myList);
        
        //ini inputan'nya
        int _input = 3;
        System.out.println(myList.get(_input) );
        //Result is: 7
     }
}
