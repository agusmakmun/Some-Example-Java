/*
@author Summon Agus
@blog bloggersmart.net
*/
 
public class WithOutSpace {
	public static void main(String[] args) {
		String name = "You and";
		System.out.println("All Character is: "+name.replaceAll("\\s","").length());
	}
}
/*
* //then output
* All Character is: 6
*/
