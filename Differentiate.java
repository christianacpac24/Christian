import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num1=sc.nextLine();
        System.out.print("Another number");
        int num2=sc.nextLine();
        if (num1>num2){
            System.out.println("The first number is greater");
           } else if(num1<num2){
                System.out.println("Second is greater");
               } else (num1==num2) {
                   System.out.println("they are equal");
                   
   }     
		
	}
}