import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int attempt=0;
		while(attempt<5){
		    System.out.println("Enter your username: ");
		    String username=sc.nextLine();
		    System.out.println("Enter password: ");
		    String password=sc.nextLine();
		    String status=loginValidator(username, password );
		    if (status.equals("success")){
		        System.out.println("Login Successfully");
		        break;
		       
		    }else if (status.equals("failed")){
		    System.out.println("Login failed! please try again");
		    attempt++;
		    System.out.println("Attempt"+attempt);
		    
		    }
		    
		
	}
	if (attempt==5){
	    System.out.println("You've reached 5 attempts. Please try again later");
	    sc.close(); 
}
	}
private static String loginValidator(String username, String password){
  String defaultUsername="Kurt";
  String defaultPassword="Abdula";
  if (username.equals(defaultUsername) && password.equals(defaultPassword)){
      return "success";
  }else{
      return "failed";
}
}
}