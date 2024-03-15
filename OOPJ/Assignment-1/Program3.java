import java.util.*;

class Program3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose an option: ");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divide");

        int option = sc.nextInt();
        int ans;
        switch(option){
            case 1:
                ans = a+b;
                System.out.println(ans);
                break;
            case 2:
                ans = a-b;
                System.out.println(ans);
                break;
            case 3:
                ans = a*b;
                System.out.println(ans);
                break;
            case 4:
        
                float ans2 = ((float)a/(float)b);
                System.out.println(ans2);
                break;
        }
        
    }
}