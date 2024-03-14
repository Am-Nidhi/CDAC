import java.util.Scanner;
public class Program5{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char input = in.next().charAt(0);
        //Write your logic here
        if(input>='a' && input<='z'){
            if(input=='a' || input=='e' ||input=='i' ||input=='o' ||input=='u'){
                System.out.println("Vowel");
            } else 
                System.out.println("Consonant");
        } else System.out.println("error");
    }
}
