import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("First subject: ");
        double n1 = sc.nextDouble();
     System.out.print("Second subject: ");
        double n2 = sc.nextDouble();
        
     System.out.print("Third subject: ");
        double n3 = sc.nextDouble()        System.out.println("Result: " + calculate(n1, n2, n3));
    }
    public static String calculate(double n1, double n2, double n3) {
        double average = (n1 + n2 + n3) / 3;
        return average >= 85 ? "Passed" : "Failed"; 
    }
}