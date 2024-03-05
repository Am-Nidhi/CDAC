import java.util.*;
class que4{

static String reverseString(String s)  
{  
	String s2="";
	
	for(int i=s.length();i>0;--i){
		s2 = s2+(s.charAt(i-1));
	}
	//System.out.println("Output: "+s2);
	return s2;
}  

public static void main(String [] args){
	System.out.println("Input a string");
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	
	System.out.println("Output: "+reverseString(a));
}
}