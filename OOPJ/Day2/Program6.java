import java.util.Scanner;
import java.lang.Math;
public class Program6{
  public static void main(String[] args)
    {
        //BMI = Weight/(Height)^2;
        //Math.pow(number, POW);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in cms.");
        float height = sc.nextFloat();
        System.out.println("Enter weight in kgs.");
        float weight = sc.nextFloat();

        float bmi = ((float)weight/(float)(Math.pow(height,2)))*10000;

        //System.out.print("---------"+bmi); 
        if(bmi<18.5){
            System.out.println("Underweight");
        }else if( bmi>=18.5 && bmi<=25){
            System.out.println("Normal weight");
        } else if( bmi>=18.5 && bmi<=25){
            System.out.println("Overweight");
        } else if( bmi>=18.5 && bmi<=25){
            System.out.println("Obese Class 1");
        } else System.out.println("Obese Class 2");
    }
}
