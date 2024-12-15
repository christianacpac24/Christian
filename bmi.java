public class BMI {
    public static void main(String[] args) {
      double height = 1.69;
      double weight = 44;    
      double bmi = weight / (height * height);
      if (bmi < 18.5) {
        System.out.println("Underweight: " + bmi);
    } else if (bmi <=18.5 &&bmi < 25.0) {
      System.out.println("Normal: " + bmi);
    } else if (bmi <= 25.0 && bmi < 30.0) {
        System.out.println("Overweight: " + bmi);
    } else if (30.0<=bmi){
        System.out.println("Obese: " + bmi);
        }
    }
}