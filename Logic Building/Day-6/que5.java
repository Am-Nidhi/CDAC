import java.util.*;
class que5{

static boolean isPalindrome(String s)  
{  
	String s2="";
	boolean ans = false;
	for (int i = s.length()-1; i>= 0; i--) {
            s2 = s2 + s.charAt(i);
        }

	if(s.equals(s2)){
		ans = true;
	}
	return ans;
}  

public static void main(String [] args){
	System.out.println("Input a string");
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	
	System.out.println("Output: "+isPalindrome(a));
}
}