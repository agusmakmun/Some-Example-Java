import java.util.Scanner;
 
/**
 * This simple checker for ChessBoard in Java Programming
 * for methode input, example: g5 > will check, white board or black board
 * @author Agus Makmun (Summon Agus)
 * @blog bloggersmart.net - python.web.id
 * Thanks to: Gunawan Ariyanto
 */
 
public class ChessBoard {
    public static void main (String [] args) {  
        Scanner scan;
        scan = new Scanner(System.in); //boolan
        System.out.print("Enter for label board (ex: g5): ");
        String x = scan.nextLine();
        char h = x.charAt(0);
        int a = Integer.valueOf(String.valueOf(""+x.charAt(1))); //Integer.valueOf.(""+x.charAt(1)); //Integer.valueOf.(String.valueOf(+x.charAt(1)));
        if (h == 'a' || h == 'c' || h == 'e' || h == 'g' ) {
            if (a%2 == 1) {
                System.out.println("Black Board");
            }
            else {
                System.out.println("White Board");
            }
        }
        else {
            if (a%2 == 1) {
                System.out.println("White Board");
            }
            else {
                System.out.println("Black Board");
            }
        }
    }    
}
