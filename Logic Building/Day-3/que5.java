
class que5{
	public static void main(String []args){
		int i= 15;
		while(i<10){
			i++;
			int j = 15;
			if(j==0){break;}
			else if(j==1){continue;}
			System.out.println(i);
		}
		System.out.println("finished");
	}
}