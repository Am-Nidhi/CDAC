import java.util.Scanner;

class Program1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Marks: ");
        int marks = sc.nextInt();

        System.out.print("Your grade is: ");
        if( marks>=90 ){
            System.out.println("A+");
        } else if( marks>=80 && marks<90 ){
            System.out.println("A");
        }else if( marks>=70 && marks<80 ){
            System.out.println("B+");
        }else if( marks>=60 && marks<70 ){
            System.out.println("B");
        }else if( marks>=55 && marks<60 ){
            System.out.println("C");
        }else if( marks>=33 && marks<55 ){
            System.out.println("D");
        }else 
            System.out.println("F");
    }
}