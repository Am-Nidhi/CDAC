import java.util.*;

class Program2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year: ");

        int year = sc.nextInt();
        System.out.print("Year "+year+" is");

        //using if-else 
        if( year%400==0){
            System.out.println(" a Leap year.");
        } else if ( year%100==0 ){   
            System.out.println(" Not a Leap year.");
        } else if ( year%4==0 ){
            System.out.println(" a Leap year.");
        } else System.out.println(" Not a Leap year.");

        //using switch case
        int r;
        r = (year%100 !=0 && year%4==0)|| year%400==0 ? 1: 0;
        //r = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 1 : 0;

        switch(r){
            case 1:
                System.out.println(" a Leap Year");
                break;
            case 0:
                System.out.println(" Not a Leap Year");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}