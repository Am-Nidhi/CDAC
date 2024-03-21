package in.classwork;

public class que9 {

	public static void main(String[] args) {
		
		int n = 6;
		int val[]= new int[n];
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				val[i-1] = i*i;
			}else {val[i-1] = i*i*i;}
		}
		
		for(int i=0; i<n;i++) {
			System.out.print(val[i]+",");
		}

	}

}
