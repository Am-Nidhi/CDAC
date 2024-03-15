/* Write a program that performs arithmetic operations involving different data types (int, double, float)
and observes how Java handles widening conversions automatically.*/

class Program3{
    public static void main(String[] args){
    
    int num1 = 10;
    double num2 = 20.55;
    float num3 = 1.1f;

    double res = (double)(num1+num2+num3);
    System.out.println(res);
}}
