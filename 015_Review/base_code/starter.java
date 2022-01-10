import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int Strength = 0;
        int Dexterity = 0;
        int Intelligence = 0;
        int Constitution = 0;
        int Charisma = 0;
        	System.out.print("Enter your name?");
        	String name = sc.nextLine();
        	System.out.println("What is your title?");
        	String title = sc.nextLine();
            System.out.println("Are you a Wizard, Warrior, or Rogue?");
            System.out.print("Input your role");
            String dwn = sc.nextLine();
            System.out.println("");
        if ((dwn.equals("Rogue")) || (dwn.equals("Warrior")) || (dwn.equals("Wizard")) || (dwn.equals("wizard")) || (dwn.equals("warrior")) || (dwn.equals("rogue")))
	  	{
	  	   System.out.println("I see, "+ dwn +" is your choosen class");
	  	}
        else 
        {   
            System.out.println(dwn +"is not a real class thats availiable");
        }
        	System.out.println("You have 25 points at your disposal for your traits");
        	System.out.println("Strength - Buff and able to carry larger items");
        	System.out.println("Dexterity - Agile and moves quick");
        	System.out.println("Intelligence - Better at magic spells!");
        	System.out.println("Constitution - How much health");
        	System.out.println("Charisma - How personable ");
        	System.out.println("How many points would you like to put in Strength?");
        	System.out.println("Strength:");
        int e4 = 25;
        int a1 = sc.nextInt();
        if ((a1<=e4) && (a1 <= 10))
            {Strength = a1;
    	    e4 = e4-a1;
    	    System.out.println("You have"+e4+" points left.");}
    	else
    	    {System.out.println("You got the wrong number, try again.");
    	    System.out.print("Strength: ");
    	int a2 = sc.nextInt();
        if ((a2<=e4) && (a2 <= 10))
            {Strength = a2;
    	    e4 = e4-a2;
    	    System.out.println("You have"+e4+" points left.");}
        else System.out.println("Invalid!");}
        	
        	
        	System.out.println("How many points would you like to put in Dexterity?");
        	System.out.println("Dexterity:");
        int z1 = sc.nextInt();
        if ((z1<=e4) && (z1 <= 10))
            {Dexterity = z1;
    	    e4 = e4-z1;
    	    System.out.println("You have"+e4+" points left.");}
    	else
    	    {System.out.println("You got the wrong number, try again.");
    	    System.out.print("Dexterity: ");
    	int z2 = sc.nextInt();
        if ((z2<=e4) && (z2 <= 10))
            {Dexterity = z2;
    	    e4 = e4-z2;
    	    System.out.println("You have"+e4+" points left.");}
    	else System.out.println("Invalid!");}
    	   
    	   	System.out.println("How many points would you like to put in Intelligence?");
        	System.out.println("Intelligence:");
        int c1 = sc.nextInt();
        if ((c1<=e4) && (c1 <= 10))
            {Intelligence = c1;
    	    e4 = e4-c1;
    	    System.out.println("You have"+e4+" points left.");}
    	else
    	    {System.out.println("You got the wrong number, try again.");
    	    System.out.print("Intelligence: ");
    	int c2 = sc.nextInt();
        if ((c2<=e4) && (c2 <= 10))
            {Intelligence = c2;
    	    e4 = e4-c2;
    	    System.out.println("You have"+e4+" points left.");}
    	else System.out.println("Invalid!");}
    	   
    	   	System.out.println("How many points would you like to put in Constitution?");
        	System.out.println("Constitution:");
        int g1 = sc.nextInt();
        if ((g1<=e4) && (g1 <= 10))
            {Constitution = g1;
    	    e4 = e4-g1;
    	    System.out.println("You have"+e4+" points left.");}
    	else
    	    {System.out.println("You got the wrong number, try again.");
    	    System.out.print("Constitution: ");
    	int g2 = sc.nextInt();
        if ((g2<=e4) && (g2 <= 10))
            {Constitution = g2;
    	    e4 = e4-g2;
    	    System.out.println("You have"+e4+" points left.");}
    	   else System.out.println("Invalid!");}
    	
    	System.out.println("How many points would you like to put in Charisma?");
        	System.out.println("Charisma:");
        int f1 = sc.nextInt();
        if ((f1<=e4) && (f1 <= 10))
            {Charisma = f1;
    	    e4 = e4-f1;
    	    System.out.println("You have"+e4+" points left.");}
    	else
    	    {System.out.println("You got the wrong number, try again.");
    	    System.out.print("Charisma: ");
    	int f2 = sc.nextInt();
        if ((f2<=e4) && (f2 <= 10))
            {Charisma = f2;
    	    e4 = e4-f2;
    	    System.out.println("You have "+e4+" points left.");}
    	   else System.out.println("Invalid!");}
    	   
    	   System.out.println(name);
    	   System.out.println(title);
    	   System.out.println(Strength);
    	   System.out.println(Dexterity);
    	   System.out.println(Intelligence);
    	   System.out.println(Constitution);
    	   System.out.println(Charisma);
              }
	     }
     
   

 