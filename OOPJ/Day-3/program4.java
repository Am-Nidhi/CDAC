/*4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and
prints the result.*/

class Program4{
    public static void main(String[] args){
        
        int num1 = 10;
        float num2 = 1.1f;
        double num3 = 20.55;

        int res = (int)(num1+num2+num3);

        System.out.println(res);
    }
}