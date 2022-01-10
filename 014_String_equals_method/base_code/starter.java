import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Are you a Wizard, Warrior, or Rogue?");
            System.out.print("Input your role");
            String dwn = sc.nextLine();
            System.out.println("");
        if ((dwn.equals("Rogue")) || (dwn.equals("Warrior")) || (dwn.equals("Wizard")) || (dwn.equals("wizard")) || (dwn.equals("warrior")) || (dwn.equals("rogue")))
	  	{
	  	   System.out.println("I see,"+ dwn +"is your choosen class");
	  	}
        else 
        {   
            System.out.println(dwn +"is not a real class thats availiable");
        }
	}
}