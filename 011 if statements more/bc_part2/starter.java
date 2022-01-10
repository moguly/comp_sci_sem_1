import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		
Scanner console = new Scanner(System.in);
System.out.print("How old are you?");
int age = console.nextInt();

Scanner onsole = new Scanner(System.in);
System.out.print("How old is your mother? ");
int motherage = console.nextInt();

Scanner nsole = new Scanner(System.in);
System.out.print("How old is your father? ");
int fatherage = console.nextInt();
if(age > fatherage){
System.out.println("Your age is"+ age);
} else {
System.out.println("Your father age is"+ fatherage);
}
if (fatherage > motherage){
System.out.println("Your father age is"+ fatherage);
} else {
System.out.println("Your mother age is"+ motherage); 
}  
	}   

    }


  