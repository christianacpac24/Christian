import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        char input = sc.next().charAt(0);
       
        if ((input>='a'&&input<='z')||(input>='A'&&input<='Z')) { 
            System.out.println(input+" is a letter");
          }  if ((input>='0'&&input<='9')){
              System.out.print(input+"is a digit");
 
          
              } else {
            System.out.println(input+"It's not a letter or digit");
        }
        
        sc.close(); 
    
}
}