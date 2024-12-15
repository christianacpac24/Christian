import java.util.Scanner;
public class CovidTest {
	public static void main(String[] args) {
	    Scanner sc = new
Scanner(System.in);	

String z;
do{
    System.out.println("Do you have a fever?");
    String a = sc.nextLine();
    System.out.println("Do you have a cough?");
    String b = sc.nextLine();
    System.out.println("Do you have difficulty in breathing?");
    String c = sc.nextLine();
    if (a.equals("Yes") && b.equals("Yes") && c.equals("Yes")){
        System.out.println("You have covid");
    }
 
      else {
        System.out.println("You don't' have covid");
    }
    System.out.println("do you want to check again?");
    z = sc.nextLine();
}while(z.equalsIgnoreCase("Yes"));
	}
}

